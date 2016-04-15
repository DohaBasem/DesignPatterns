
public class factoryCreator {
public abstract class factory{
	abstract void publishCourse(String courseName);

	void publishCourse() {
		// TODO Auto-generated method stub
		
	}
	
}
public abstract class Course{
	abstract void describe();
	
}
public class Engineering extends Course{

	@Override
	void describe() {
		System.out.println("Publish Engineering course");
		
	}}
public class Medical extends Course{

	@Override
	void describe() {
		// TODO Auto-generated method stub
		System.out.println("Publish Medical course");
	}}
public class Humanity extends Course{

	@Override
	void describe() {
		// TODO Auto-generated method stub
		System.out.println("Publish Humanity course");
	}}

public class coursePublisher extends factory{
Course course;
	@Override
	void publishCourse(String courseName) {
		// TODO Auto-generated method stub
		if(courseName=="Engineering")
		{
			course=new Engineering();
			course.describe();}
		else if (courseName=="Medical")
			{course=new Medical();
			course.describe();}
		else if (courseName=="Humanity")
			{course=new Humanity();
			course.describe();}
	}

	
		
	}
	
	
} 

