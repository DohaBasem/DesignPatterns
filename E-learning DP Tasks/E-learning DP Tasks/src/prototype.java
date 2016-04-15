
public class prototype {
public interface userProfile extends Cloneable{
	
	public userProfile cloneProfile() throws Exception;

	public void checkCloning();
	public void setName(String S);
	
}
public class studentUserProfile implements userProfile{
	String name;
	@Override
	public userProfile cloneProfile() throws Exception {
		studentUserProfile SP=(studentUserProfile)super.clone();
		return SP;
	}
	public void checkCloning(){
		System.out.println("Student "+ this.name+ " profile cloned ");
		
	}
	public void setName(String S){this.name=S;}
}
public class InstructorProfile implements userProfile{
	String name;
	@Override
	public userProfile cloneProfile() throws Exception {
		InstructorProfile IP=(InstructorProfile)super.clone();
		return IP;
	}
	public void checkCloning(){
		System.out.println("Instructor "+this.name+" profile cloned ");
		
	}
	public void setName(String S){this.name=S;}
}
public class cloningCreator{
	public userProfile DoCloning(userProfile x) throws Exception{
		
		return x.cloneProfile();
		
	}
	
}
}
