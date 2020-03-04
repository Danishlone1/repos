package collegeExam;



public class StudentDetails {
	private int rollNo;
	private String StudentName;
	private Gender studentGender;
	private SubjectDetails studentSubject;
	private int marks = 0;
	private String grades;
	
	public StudentDetails(int rollNo, String studentName, Gender studentGender, SubjectDetails studentSubject,int marks,String grades) {
		
		this.rollNo = rollNo;
		StudentName = studentName;
		this.studentGender = studentGender;
		this.studentSubject = studentSubject;
	this.grades=grades;
	this.marks=marks;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Gender getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(Gender studentGender) {
		this.studentGender = studentGender;
	}
	public SubjectDetails getStudentSubject() {
		return studentSubject;
	}
	public void setStudentSubject(SubjectDetails studentSubject) {
		this.studentSubject = studentSubject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDetails [rollNo=" + rollNo + ", StudentName=" + StudentName + ", studentGender=" + studentGender
				+ ", studentSubject=" + studentSubject + ", marks=" + marks + ", grades=" + grades + "]";
	}
	public void setGrade(String string) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
}
