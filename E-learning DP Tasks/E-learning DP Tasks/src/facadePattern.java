
public class facadePattern {
	builder builder=new builder();
	AdapterPattern adapter=new AdapterPattern();
	
	
	public void createSocialClass(){
		builder.ClassBuilder BD=builder.new socialClass();
		builder.CourseDirector CD=builder.new CourseDirector(BD);
		CD.createElearningClass();
	}
	public void modifyCoursePlatform(){
		
	}

}
