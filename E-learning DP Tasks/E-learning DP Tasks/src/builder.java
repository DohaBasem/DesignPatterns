
public class builder {
public class CourseDirector{
	private ClassBuilder elearningClass;
	public CourseDirector(ClassBuilder builder){
		this.elearningClass=builder;
		
	}
	public void createElearningClass(){
		elearningClass.addContents();
		elearningClass.addAssignment();
		
	}
	
}
public abstract class ClassBuilder{
	public abstract void addContents();
	public abstract void addAssignment();
	
}
public class socialClass extends ClassBuilder{

	@Override
	public void addContents() {
		System.out.println("Add collaborative documents and blogs");
		
	}

	@Override
	public void addAssignment() {
		// TODO Auto-generated method stub
		System.out.println("Peer to peer evaluation ");
		
	}
	
	
}
public class selfPacedClass extends ClassBuilder{

	@Override
	public void addContents() {
		System.out.println("Add video Lectures");
	}

	@Override
	public void addAssignment() {
		System.out.println("Instructor Evaluation");
		
	}} 
}
