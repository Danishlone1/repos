package collegeExam;



public class SubjectDetails {


private String subjectName1;
private String subjectName2;
private String subjectName3;

public SubjectDetails(String subjectName1,String subjectName2) {
	
	this.subjectName1 = subjectName1;
	this.subjectName2 = subjectName2;
}
public SubjectDetails(String subjectName1,String subjectName2,String subjectName3) {
	
	this.subjectName1 = subjectName1;
	this.subjectName2 = subjectName2;
	this.subjectName3 = subjectName3;
}
//ArrayList<String> subjectList = new ArrayList<String>();
//public void addsubjects() {
//	subjectList.add("English");
//	subjectList.add("Maths");
//	subjectList.add("MedicalScience");
//}
public SubjectDetails(String subjectName1) {
	
	this.subjectName1 = subjectName1;
}
public String getSubjectName1() {
	return subjectName1;
}
public void setSubjectName1(String subjectName1) {
	this.subjectName1 = subjectName1;
}
public String getSubjectName2() {
	return subjectName2;
}
public void setSubjectName2(String subjectName2) {
	this.subjectName2 = subjectName2;
}
public String getSubjectName3() {
	return subjectName3;
}
public void setSubjectName3(String subjectName3) {
	this.subjectName3 = subjectName3;
}
@Override
public String toString() {
	return "SubjectDetails [subjectName1=" + subjectName1 + ", subjectName2=" + subjectName2 + ", subjectName3="
			+ subjectName3 + "]";
}



}
