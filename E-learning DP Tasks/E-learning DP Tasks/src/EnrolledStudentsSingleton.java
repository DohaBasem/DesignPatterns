import java.util.ArrayList;


public class EnrolledStudentsSingleton {
private static EnrolledStudentsSingleton firstInstance=null;
private  EnrolledStudentsSingleton(){}
public static ArrayList <String> studentsList;
public static EnrolledStudentsSingleton getInstance(){
	if(firstInstance==null)
		firstInstance =new EnrolledStudentsSingleton();
	return firstInstance;
}
}
