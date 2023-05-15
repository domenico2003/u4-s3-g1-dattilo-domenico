package databaseEsercizii;

import java.time.LocalDate;

public class Student {
	private String name;
	private String lastName;
	private String gender;
	private LocalDate birthdate;
	private double avg;
	private double min_vote;
	private double max_vote;

	public Student(String name, String lastName, String gender, LocalDate birthdate, double avg, double min_vote,
			double max_vote) {
		setAvg(avg);
		setBirthdate(birthdate);
		setGender(gender);
		setLastName(lastName);
		setName(name);
		setMin_vote(min_vote);
		setMax_vote(max_vote);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate.toString();
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public double getMin_vote() {
		return min_vote;
	}

	public void setMin_vote(double min_vote) {
		this.min_vote = min_vote;
	}

	public double getMax_vote() {
		return max_vote;
	}

	public void setMax_vote(double max_vote) {
		this.max_vote = max_vote;
	}
}
