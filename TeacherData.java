package collegeExam;

import java.util.ArrayList;

public class TeacherData {
	public ArrayList<TeacherDetails> addTeacherDetails() {
		ArrayList teacherList = new ArrayList();
		TeacherDetails Details1 = new TeacherDetails("Miley",new Gender("Female"),new SubjectDetails("Maths"));
		teacherList.add(Details1);
		TeacherDetails Details2 = new TeacherDetails("Tom",new Gender("Male"),new SubjectDetails("Programming"));
		teacherList.add(Details2);
		TeacherDetails Details3 = new TeacherDetails("Murli",new Gender("Male"),new SubjectDetails("English"));
		teacherList.add(Details3);
		return teacherList;
	}
}
