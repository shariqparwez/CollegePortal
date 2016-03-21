package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Students {

	private long studentId;
	private String studentName;
	private double academicScore;
	private double sportsScore;
	private double culturalScore;
	private double totalScore;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(long studentId, String studentName, double academicScore, double sportsScore, double culturalScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.academicScore = academicScore;
		this.sportsScore = sportsScore;
		this.culturalScore = culturalScore;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getAcademicScore() {
		return academicScore;
	}
	public void setAcademicScore(double academicScore) {
		this.academicScore = academicScore;
	}
	public double getSportsScore() {
		return sportsScore;
	}
	public void setSportsScore(double sportsScore) {
		this.sportsScore = sportsScore;
	}
	public double getCulturalScore() {
		return culturalScore;
	}
	public void setCulturalScore(double culturalScore) {
		this.culturalScore = culturalScore;
	}
	public double getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}
	public void setTotalScore(){
		totalScore = (int) ((0.5 * academicScore) + (0.3 * sportsScore) + (0.2 * culturalScore));
	}
	
}
