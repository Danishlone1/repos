package collegeExam;

public class Gender {

String gender;

public Gender(String gender) {
	
	this.gender = gender;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "Gender [gender=" + gender + "]";
}

}
