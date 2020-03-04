package collegeExam;

import java.util.ArrayList;


public class CollegeExam {
public void takeExam(TeacherDetails teacher, ArrayList<StudentDetails> students ) {
	System.out.println("teacher who will take exam is  "+ teacher.getTeachername());
	
	for (StudentDetails student : students ) {
		if(student.getStudentSubject().equals(teacher.getSubject())) {
			student.setMarks(99);
		}
	}
}
public void updateRecord(ArrayList<StudentDetails> data) {
	int marks = 0;
	for(StudentDetails student : data) {
		marks = student.getMarks();
		if(marks>=80) {
			student.setGrades("  A");
		}else if(marks>=60) {
			student.setGrades("  B");
		}else if(marks>=50) {
			student.setGrades("  C");
		}else if(marks>=40) {
			student.setGrades("  D");
		}else if(marks<40) {
			student.setGrades("   E");
		}
	}
}
public void showResult(ArrayList<StudentDetails> student) {
	for(StudentDetails s : student) {
		System.out.println(s.getRollNo()+s.getStudentName()+s.getStudentGender()+s.getMarks()+s.getGrades());
	}
	
}
//public void examDay(TeacherDetails teacher) {
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter the day (1-7)");
//	switch(scan.nextInt()) {
//	case 1:
//	case 5: teacher.takeExam(teachers.get(2), students);
//			break;
//	case 3:
//	case 4: teacher.takeExam(teachers.get(0), students);
//			break;
//	case 2:
//	case 6: teacher.takeExam(teachers.get(1), students);
//			break;
//	default: System.out.println("Invalid input!");
//	}
}


