package feedbackEvaluator;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

class Data{
	public double presentation, communication, assignment, behaviour, fairness, enthusiasm, regularity, knowledge, coverage, overall;
	Data(String facultyName){
		String presentation = facultyName + "_Presentation_Skills";
		String communication = facultyName + "_Communication";
		String assignment = facultyName + "_Assignments";
		String behaviour = facultyName + "_Behaviour";
		String fairness = facultyName + "_Fairness";
		String enthusiasm = facultyName + "_Enthusiam";
		String regularity = facultyName + "_Regularity_Punctuality";
		String knowledge = facultyName + "_Subject_Knowledge";
		String coverage = facultyName + "_Covers_the_syllabus";
		String overall = facultyName + "_Overall_Performance";
		
		this.presentation = getAvgData(presentation);
		this.communication = getAvgData(communication);
		this.assignment = getAvgData(assignment);
		this.behaviour = getAvgData(behaviour);
		this.fairness = getAvgData(fairness);
		this.enthusiasm = getAvgData(enthusiasm);
		this.regularity = getAvgData(regularity);
		this.knowledge = getAvgData(knowledge);
		this.coverage = getAvgData(coverage);
		this.overall = getAvgData(overall);
	}
	public static double getAvgData(String columnName) {
		double avgScore = 0.0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","");
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("SELECT AVG("+columnName+")FROM final_feedback_dataset "+"WHERE "+columnName+" IS NOT NULL");
			while(res.next()) {
				avgScore = res.getDouble(1);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return avgScore;
	}
}

class Score{
	private Data d;
	public double weightedsum;
	public double weightedTotal;
	Score(Data o){
		d = o;
		weightedsum = calculateTotal(d);
	}
	private static double calculateTotal(Data o) {
		double total = 0.0;
		
        //weights
        double w1 = 2.0; //Presentation
        double w2 = 3.0; //Communication
        double w3 = 1.0; //Assignment
        double w4 = 3.0; //Behaviour
        double w5 = 2.0; //Fairness
        double w6 = 1.0; //Enthusiasm
        double w7 = 2.0; //Regularity
        double w8 = 3.0; //Knowledge
        double w9 = 2.0; //Coverage
        double w10 = 1.0; //Overall
        
        total = ((o.presentation*w1)+(o.communication*w2)+(o.assignment*w3)+(o.behaviour*w4)+(o.fairness*w5)+(o.enthusiasm*w6)+(o.regularity*w7)+(o.knowledge*w8)+(o.coverage*w9)+(o.overall*w10));
        
		return total;
	}
}
