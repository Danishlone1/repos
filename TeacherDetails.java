package collegeExam;



public class TeacherDetails {
	private  String teachername;
	private  Gender gender;
   private  SubjectDetails subject;


public TeacherDetails(String teachername, Gender gender, SubjectDetails subject) {
	
	this.teachername = teachername;
	this.gender = gender;
	this.subject = subject;
}








@Override
public String toString() {
	return "TeacherDetails [teachername=" + teachername + ", gender=" + gender + ", subject=" + subject + "]";
}








public String getTeachername() {
	return teachername;
}


public void setTeachername(String teachername) {
	this.teachername = teachername;
}


public Gender getGender() {
	return gender;
}


public void setGender(Gender gender) {
	this.gender = gender;
}


public SubjectDetails getSubject() {
	return subject;
}


public void setSubject(SubjectDetails subject) {
	this.subject = subject;
}









//	String str[] = new String[]{ " Miley","Female", "Maths"};
//	List teacherList =  Arrays.asList(str);
//
//	String str1[] = new String[]{ " miley","female", "maths"};
//	List teacherList1 =  Arrays.asList(str);
//	
//	String str2[] = new String[]{ " miley","female", "maths"};
//	List teacherList2 =  Arrays.asList(str);
//}
}
