import java.util.ArrayList;
import java.util.Iterator;




public class Composite {
	//This is the component
public abstract class Curriculum{
	String name;
	Curriculum(String n){
		this.name=n;
	}
	public abstract String getName();
	public abstract void displayAllCourses();
	public abstract void addPrerequisite(Curriculum course1); 
		
		
	
	 
		
		
	
	
}
//This is the leaf
public class course extends Curriculum{

	course(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void displayAllCourses() {
		System.out.println("Course Name :" +getName());
		System.out.println("No Prerequisites for this course ");
		
	}

	@Override
	public void addPrerequisite(Curriculum course1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

	

	
	
}
//This is the composite
public class courseWithPrerequisite extends Curriculum{
	ArrayList courses=new ArrayList();
	courseWithPrerequisite(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	
	public ArrayList getPrerequisites() {
		return this.courses;
		
	}

	
	public void addPrerequisite(Curriculum pre) {
		// TODO Auto-generated method stub
		courses.add(pre);		
	}
	public void displayAllCourses(){
		
		System.out.println("Course name : " + getName());
		System.out.println("Prerequisite :");
		Iterator courseIterator=courses.iterator(); //Iterate over all the courses in the arraylist
		while(courseIterator.hasNext()){
			Curriculum prerequisites =  (Curriculum)courseIterator.next();
			prerequisites.displayAllCourses();
			
		}
		
		
	}
}
}
