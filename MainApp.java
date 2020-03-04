package collegeExam;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainApp obj = new MainApp();
		CollegeExam exam = new CollegeExam();
		StudentData sData = new StudentData();
		ArrayList<StudentDetails> studentList = sData.detailsStudent();

		TeacherData tData = new TeacherData();
		ArrayList<TeacherDetails> teacherList = tData.addTeacherDetails();
		System.out.println("Enter the day (1-7)");
		Scanner scan = new Scanner(System.in);
		switch(scan.nextInt()) {
		case 1:
		case 5: exam.takeExam(teacherList.get(2), studentList);
				break;
		case 3:
		case 4: exam.takeExam(teacherList.get(0), studentList);
				break;
		case 2:
		case 6: exam.takeExam(teacherList.get(1), studentList);
				break;
		default: System.out.println("Invalid input!");
		}
		
		exam.updateRecord(studentList);
		
		exam.showResult(studentList);
		
		scan.close();
	}
	}


