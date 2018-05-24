package feedbackEvaluator;

import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

@SuppressWarnings("serial")
public class GenerateChart extends ApplicationFrame {
	static ShowScore s;
	static String chartNameInstance;
	static public JFreeChart chartx;
	public String addressString;
	public String addressPNG;

	public GenerateChart(int index) {
		super("");
		String chartName;
		String addressString;
		switch (index) {
		case 0:
			chartName = "Ankita Shukla - Report";
			addressString = "ankita_shukla_pc";
			break;
		case 1:
			chartName = "Aradhana Kumari - Report";
			addressString = "aradhana_kumari_pc";
			break;
		case 2:
			chartName = "Hukum Singh Rana - Report";
			addressString = "hukum_singh_rana_pc";
			break;
		case 3:
			chartName = "Poonam Kainthura - Report";
			addressString = "poonam_kainthura_pc";
			break;
		case 4:
			chartName = "Upara Rajinikanth - Report";
			addressString = "upara_rajinikanth_pc";
			break;
		case 5:
			chartName = "Pankaj Badoni - Report";
			addressString = "pankaj_badoni_pc";
			break;
		case 6:
			chartName = "Bhupendra Singh - Report";
			addressString = "bhupendra_singh_pc";
			break;
		case 7:
			chartName = "Sandeep Chaurasiya - Report";
			addressString = "sandeep_chaurasiya_pc";
			break;
		case 8:
			chartName = "Anushree Shah - Report";
			addressString = "anushree_shah_pc";
			break;
		case 9:
			chartName = "Vishal Kaushik - Report";
			addressString = "vishal_kaushik_pc";
			break;
		case 10:
			chartName = "Gunjan Chhabra - Report";
			addressString = "gunjan_chhabra_pc";
			break;
		case 11:
			chartName = "Niharika Singh - Report";
			addressString = "niharika_singh_pc";
			break;
		case 12:
			chartName = "Jatin Sethi - Report";
			addressString = "jatin_sethi_pc";
			break;
		case 13:
			chartName = "Tripti Mishra - Report";
			addressString = "tripti_mishra_pc";
			break;
		case 14:
			chartName = "Keshav Kaushik - Report";
			addressString = "keshav_kaushik_pc";
			break;
		default:
			chartName = "Weighted Score";
			addressString = "score_pc";
		}
		this.chartNameInstance = chartName;
		this.addressString = addressString;

		ShowScore s = new ShowScore(index);
		this.s = s;

		setContentPane(createDemoPanel());

		this.setSize(560, 367);
		RefineryUtilities.centerFrameOnScreen(this);
		this.setVisible(true);

		String addressPNG = "E:/PDFs/" + addressString + ".png";
		JFreeChart ch = chartx;
		int width = 640; /* Width of the image */
		int height = 480; /* Height of the image */
		File pieChart = new File(addressPNG);
		this.addressPNG = addressPNG;
		try {
			ChartUtilities.saveChartAsPNG(pieChart, ch, width, height);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

	private static PieDataset createDataset() {
		double p1 = (s.s1 / 5) * 100;
		double p2 = (s.s2 / 5) * 100;
		double p3 = (s.s3 / 5) * 100;
		double p4 = (s.s4 / 5) * 100;
		double p5 = (s.s5 / 5) * 100;
		double p6 = (s.s6 / 5) * 100;
		double p7 = (s.s7 / 5) * 100;
		double p8 = (s.s8 / 5) * 100;
		double p9 = (s.s9 / 5) * 100;
		double p10 = (s.s10 / 5) * 100;

		String presentation = "Presentation " + p1 + "%";
		String communication = "Communication " + p2 + "%";
		String assignment = "Assignments " + p3 + "%";
		String behaviour = "Behaviour " + p4 + "%";
		String fairness = "Fairness " + p5 + "%";
		String enthusiasm = "Enthusiasm " + p6 + "%";
		String regularity = "Regularity " + p7 + "%";
		String knowledge = "Knowledge " + p8 + "%";
		String coverage = "Coverage of Syllabus " + p9 + "%";
		String overall = "Overall " + p10 + "%";

		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue(presentation, p1);
		dataset.setValue(communication, p2);
		dataset.setValue(assignment, p3);
		dataset.setValue(behaviour, p4);
		dataset.setValue(fairness, p5);
		dataset.setValue(enthusiasm, p6);
		dataset.setValue(regularity, p7);
		dataset.setValue(knowledge, p8);
		dataset.setValue(coverage, p9);
		dataset.setValue(overall, p10);
		return dataset;
	}

	private static JFreeChart createChart(PieDataset dataset) {
		JFreeChart chart = ChartFactory.createPieChart(chartNameInstance, // chart title
				dataset, // data
				true, // include legend
				true, false);
		chartx = chart;
		return chart;
	}

	public static JPanel createDemoPanel() {
		JFreeChart chart = createChart(createDataset());
		return new ChartPanel(chart);
	}
}