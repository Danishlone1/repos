package collegeExam;

import java.util.ArrayList;

public class StudentData {
	public ArrayList<StudentDetails> detailsStudent() {
		ArrayList studentList = new ArrayList();
		StudentDetails studentDetails1 = new StudentDetails(100,"Euella", new Gender("Female"), new SubjectDetails("English","Maths","Programming"), 0, null);
		studentList.add(studentDetails1);
		
		StudentDetails studentDetails2 = new StudentDetails(101,"Morie", new Gender("Male"), new SubjectDetails("English","Programming"), 0, null);
		studentList.add(studentDetails2);
		
		StudentDetails studentDetails3 = new StudentDetails(102,"Christopher", new Gender("Male"), new SubjectDetails("Maths","Programming"), 0, null);
		studentList.add(studentDetails3);
		
		StudentDetails studentDetails4 = new StudentDetails(103,"Delmar", new Gender("Male"), new SubjectDetails("Maths"), 0, null);
		studentList.add(studentDetails4);
		
		StudentDetails studentDetails5 = new StudentDetails(104,"Ben", new Gender("Male"), new SubjectDetails("Maths"), 0, null);
		studentList.add(studentDetails5);
		
		StudentDetails studentDetails6= new StudentDetails(105,"Marda", new Gender("Female"), new SubjectDetails("English","Maths","Programming"), 0, null);
		studentList.add(studentDetails6);
		
		StudentDetails studentDetails7 = new StudentDetails(106,"Marry", new Gender("Female"), new SubjectDetails("English","Programming"), 0, null);
		studentList.add(studentDetails7);
		
		StudentDetails studentDetails8 = new StudentDetails(107,"Raddy", new Gender("Male"), new SubjectDetails("English","Maths"), 0, null);
		studentList.add(studentDetails8);
		
		StudentDetails studentDetails9 = new StudentDetails(108,"Guile", new Gender("Male"), new SubjectDetails("Programming"), 0, null);
		studentList.add(studentDetails9);
		
		StudentDetails studentDetails10 = new StudentDetails(109,"Michael", new Gender("Male"), new SubjectDetails("Maths"), 0, null);
		studentList.add(studentDetails10);
		return studentList;
		
	
	
	
	}
}
