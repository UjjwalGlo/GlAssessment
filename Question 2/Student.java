package Assessment;

public class Student {

	private int rollno;

	private String studentName;
	private String standard;
	private String dob;

	private double fees;

	public Student(int rollno, String studentName, String standard, String dob, double fees) {

		super();

		this.rollno = rollno;
		this.studentName = studentName;
		this.standard = standard;
		this.dob = dob;
		this.fees = fees;

	}

	// Create setters and getters of variable
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

}