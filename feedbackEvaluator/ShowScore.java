package feedbackEvaluator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JSeparator;

public class ShowScore extends JFrame implements ActionListener, Serializable{

	JLabel presentationLabel, communicationLabel, assignmentLabel, behaviourLabel, fairnessLabel, enthusiasmLabel, regularityLabel, knowledgeLabel, coverageLabel, overallLabel, weightedLabel;
	JLabel s1Label, s2Label, s3Label, s4Label, s5Label, s6Label, s7Label, s8Label, s9Label, s10Label, sWeighted;
	JSeparator seperator;
	
	private int index = 0;
	public double s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, totalWeighted;
	
	public ShowScore(int index) {
		this.index = index;
		switch(this.index) {
		case 0:
			Data o1 = new Data("Ankita_Shukla");
			this.s1 = o1.presentation;
			this.s2 = o1.communication;
			this.s3 = o1.assignment;
			this.s4 = o1.behaviour;
			this.s5 = o1.fairness;
			this.s6 = o1.enthusiasm;
			this.s7 = o1.regularity;
			this.s8 = o1.knowledge;
			this.s9 = o1.coverage;
			this.s10 = o1.overall;
			this.totalWeighted = new Score(o1).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 1:
			Data o2 = new Data("Aradhana_Kumari");
			this.s1 = o2.presentation;
			this.s2 = o2.communication;
			this.s3 = o2.assignment;
			this.s4 = o2.behaviour;
			this.s5 = o2.fairness;
			this.s6 = o2.enthusiasm;
			this.s7 = o2.regularity;
			this.s8 = o2.knowledge;
			this.s9 = o2.coverage;
			this.s10 = o2.overall;
			this.totalWeighted = new Score(o2).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 2:
			Data o3 = new Data("Hukum_Singh_Rana");
			this.s1 = o3.presentation;
			this.s2 = o3.communication;
			this.s3 = o3.assignment;
			this.s4 = o3.behaviour;
			this.s5 = o3.fairness;
			this.s6 = o3.enthusiasm;
			this.s7 = o3.regularity;
			this.s8 = o3.knowledge;
			this.s9 = o3.coverage;
			this.s10 = o3.overall;
			this.totalWeighted = new Score(o3).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 3:
			Data o4 = new Data("Poonam_Kainthura");
			this.s1 = o4.presentation;
			this.s2 = o4.communication;
			this.s3 = o4.assignment;
			this.s4 = o4.behaviour;
			this.s5 = o4.fairness;
			this.s6 = o4.enthusiasm;
			this.s7 = o4.regularity;
			this.s8 = o4.knowledge;
			this.s9 = o4.coverage;
			this.s10 = o4.overall;
			this.totalWeighted = new Score(o4).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 4:
			Data o5 = new Data("U_Rajnikanth");
			this.s1 = o5.presentation;
			this.s2 = o5.communication;
			this.s3 = o5.assignment;
			this.s4 = o5.behaviour;
			this.s5 = o5.fairness;
			this.s6 = o5.enthusiasm;
			this.s7 = o5.regularity;
			this.s8 = o5.knowledge;
			this.s9 = o5.coverage;
			this.s10 = o5.overall;
			this.totalWeighted = new Score(o5).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 5:
			Data o6 = new Data("Pankaj_Badoni");
			this.s1 = o6.presentation;
			this.s2 = o6.communication;
			this.s3 = o6.assignment;
			this.s4 = o6.behaviour;
			this.s5 = o6.fairness;
			this.s6 = o6.enthusiasm;
			this.s7 = o6.regularity;
			this.s8 = o6.knowledge;
			this.s9 = o6.coverage;
			this.s10 = o6.overall;
			this.totalWeighted = new Score(o6).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 6:
			Data o7 = new Data("Bhupendra_Singh");
			this.s1 = o7.presentation;
			this.s2 = o7.communication;
			this.s3 = o7.assignment;
			this.s4 = o7.behaviour;
			this.s5 = o7.fairness;
			this.s6 = o7.enthusiasm;
			this.s7 = o7.regularity;
			this.s8 = o7.knowledge;
			this.s9 = o7.coverage;
			this.s10 = o7.overall;
			this.totalWeighted = new Score(o7).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 7:
			Data o8 = new Data("Sandeep_Chaurasiya");
			this.s1 = o8.presentation;
			this.s2 = o8.communication;
			this.s3 = o8.assignment;
			this.s4 = o8.behaviour;
			this.s5 = o8.fairness;
			this.s6 = o8.enthusiasm;
			this.s7 = o8.regularity;
			this.s8 = o8.knowledge;
			this.s9 = o8.coverage;
			this.s10 = o8.overall;
			this.totalWeighted = new Score(o8).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 8:
			Data o9 = new Data("Anushree_Shah");
			this.s1 = o9.presentation;
			this.s2 = o9.communication;
			this.s3 = o9.assignment;
			this.s4 = o9.behaviour;
			this.s5 = o9.fairness;
			this.s6 = o9.enthusiasm;
			this.s7 = o9.regularity;
			this.s8 = o9.knowledge;
			this.s9 = o9.coverage;
			this.s10 = o9.overall;
			this.totalWeighted = new Score(o9).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 9:
			Data o10 = new Data("Vishal_Kaushik");
			this.s1 = o10.presentation;
			this.s2 = o10.communication;
			this.s3 = o10.assignment;
			this.s4 = o10.behaviour;
			this.s5 = o10.fairness;
			this.s6 = o10.enthusiasm;
			this.s7 = o10.regularity;
			this.s8 = o10.knowledge;
			this.s9 = o10.coverage;
			this.s10 = o10.overall;
			this.totalWeighted = new Score(o10).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 10:
			Data o11 = new Data("Gunjan_Chhabra");
			this.s1 = o11.presentation;
			this.s2 = o11.communication;
			this.s3 = o11.assignment;
			this.s4 = o11.behaviour;
			this.s5 = o11.fairness;
			this.s6 = o11.enthusiasm;
			this.s7 = o11.regularity;
			this.s8 = o11.knowledge;
			this.s9 = o11.coverage;
			this.s10 = o11.overall;
			this.totalWeighted = new Score(o11).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 11:
			Data o12 = new Data("Niharika_Singh");
			this.s1 = o12.presentation;
			this.s2 = o12.communication;
			this.s3 = o12.assignment;
			this.s4 = o12.behaviour;
			this.s5 = o12.fairness;
			this.s6 = o12.enthusiasm;
			this.s7 = o12.regularity;
			this.s8 = o12.knowledge;
			this.s9 = o12.coverage;
			this.s10 = o12.overall;
			this.totalWeighted = new Score(o12).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 12:
			Data o13 = new Data("Jatin_Sethi");
			this.s1 = o13.presentation;
			this.s2 = o13.communication;
			this.s3 = o13.assignment;
			this.s4 = o13.behaviour;
			this.s5 = o13.fairness;
			this.s6 = o13.enthusiasm;
			this.s7 = o13.regularity;
			this.s8 = o13.knowledge;
			this.s9 = o13.coverage;
			this.s10 = o13.overall;
			this.totalWeighted = new Score(o13).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 13:
			Data o14 = new Data("Tripti_Mishra");
			this.s1 = o14.presentation;
			this.s2 = o14.communication;
			this.s3 = o14.assignment;
			this.s4 = o14.behaviour;
			this.s5 = o14.fairness;
			this.s6 = o14.enthusiasm;
			this.s7 = o14.regularity;
			this.s8 = o14.knowledge;
			this.s9 = o14.coverage;
			this.s10 = o14.overall;
			this.totalWeighted = new Score(o14).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		case 14:
			Data o15 = new Data("Keshav_Kaushik");
			this.s1 = o15.presentation;
			this.s2 = o15.communication;
			this.s3 = o15.assignment;
			this.s4 = o15.behaviour;
			this.s5 = o15.fairness;
			this.s6 = o15.enthusiasm;
			this.s7 = o15.regularity;
			this.s8 = o15.knowledge;
			this.s9 = o15.coverage;
			this.s10 = o15.overall;
			this.totalWeighted = new Score(o15).weightedsum;
			System.out.println("Score Generated: "+this.totalWeighted);
			break;
		}

		
		this.setBounds(100, 100, 255, 374);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		presentationLabel = new JLabel("Presentation");
		presentationLabel.setBounds(30, 33, 89, 14);
		this.getContentPane().add(presentationLabel);
		
		communicationLabel = new JLabel("Communication");
		communicationLabel.setBounds(30, 58, 89, 14);
		this.getContentPane().add(communicationLabel);
		
		assignmentLabel = new JLabel("Assignments");
		assignmentLabel.setBounds(30, 83, 89, 14);
		this.getContentPane().add(assignmentLabel);
		
		behaviourLabel = new JLabel("Behaviour");
		behaviourLabel.setBounds(30, 108, 89, 14);
		this.getContentPane().add(behaviourLabel);
		
		fairnessLabel = new JLabel("Fairness");
		fairnessLabel.setBounds(30, 133, 89, 14);
		this.getContentPane().add(fairnessLabel);
		
		enthusiasmLabel = new JLabel("Enthusiasm");
		enthusiasmLabel.setBounds(30, 158, 89, 14);
		this.getContentPane().add(enthusiasmLabel);
		
		regularityLabel = new JLabel("Regularity");
		regularityLabel.setBounds(30, 183, 89, 14);
		this.getContentPane().add(regularityLabel);
		
		knowledgeLabel = new JLabel("Knowledge");
		knowledgeLabel.setBounds(30, 208, 89, 14);
		this.getContentPane().add(knowledgeLabel);
		
		coverageLabel = new JLabel("Coverage");
		coverageLabel.setBounds(30, 233, 89, 14);
		this.getContentPane().add(coverageLabel);
		
		overallLabel = new JLabel("Overall");
		overallLabel.setBounds(30, 258, 89, 14);
		this.getContentPane().add(overallLabel);
		
		weightedLabel = new JLabel("Weighted Score");
		weightedLabel.setFont(new Font("Consolas", Font.BOLD, 13));
		weightedLabel.setBounds(30, 291, 134, 25);
		this.getContentPane().add(weightedLabel);
		
		s1Label = new JLabel(((Double)s1).toString());
		s1Label.setBounds(163, 33, 46, 14);
		this.getContentPane().add(s1Label);
		
		s2Label = new JLabel(((Double)s2).toString());
		s2Label.setBounds(163, 58, 46, 14);
		this.getContentPane().add(s2Label);
		
		s3Label = new JLabel(((Double)s3).toString());
		s3Label.setBounds(163, 83, 46, 14);
		this.getContentPane().add(s3Label);
		
		s4Label = new JLabel(((Double)s4).toString());
		s4Label.setBounds(163, 108, 46, 14);
		this.getContentPane().add(s4Label);
		
		s5Label = new JLabel(((Double)s5).toString());
		s5Label.setBounds(163, 133, 46, 14);
		this.getContentPane().add(s5Label);
		
		s6Label = new JLabel(((Double)s6).toString());
		s6Label.setBounds(163, 158, 46, 14);
		this.getContentPane().add(s6Label);
		
		s7Label = new JLabel(((Double)s7).toString());
		s7Label.setBounds(163, 183, 46, 14);
		this.getContentPane().add(s7Label);
		
		s8Label = new JLabel(((Double)s8).toString());
		s8Label.setBounds(163, 208, 46, 14);
		this.getContentPane().add(s8Label);
		
		s9Label = new JLabel(((Double)s9).toString());
		s9Label.setBounds(163, 233, 46, 14);
		this.getContentPane().add(s9Label);
		
		s10Label = new JLabel(((Double)s10).toString());
		s10Label.setBounds(163, 258, 46, 14);
		this.getContentPane().add(s10Label);
		
		sWeighted = new JLabel(((Double)totalWeighted).toString());
		sWeighted.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sWeighted.setBounds(150, 291, 46, 25);
		this.getContentPane().add(sWeighted);
		
		seperator = new JSeparator();
		seperator.setBounds(30, 283, 179, 2);
		this.getContentPane().add(seperator);
		
		this.setResizable(false);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {}
}
