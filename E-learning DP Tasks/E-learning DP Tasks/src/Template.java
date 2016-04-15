/*The template pattern is used for the registeration process
 *For graduates and undergraduates the process is similar except at some points 
 *as that of getting the recommendation letter and that of applying to the tests */  
 
public class Template {
public abstract class RegTemplate{	
public void register(){
	 fillPersonalInfo();
	 specifyAvailableTimeSlots();
	 getRecommendation();
	 motivationLetter();
	 applyToTest();
}
public void  fillPersonalInfo(){
	System.out.println("Fill your personal Info");
}
public void  specifyAvailableTimeSlots(){
	System.out.println("Specify your available time slots ");
}
public void motivationLetter(){
	System.out.println("Writa a motivation letter ");
}
//Abstract what differ
public abstract void getRecommendation();
public abstract void applyToTest();
}
public class graduateReg extends RegTemplate{

	@Override
	public void getRecommendation() {
		System.out.println("Get recommendation from an internship or real working experience");
		
	}

	@Override
	public void applyToTest() {
		System.out.println("Apply to the test as a grad ");
		
	}
	
}
public class underGradReg extends RegTemplate{

	@Override
	public void getRecommendation() {
		System.out.println("Get a recommendation from an academic instructor");
		
	}

	@Override
	public void applyToTest() {
		System.out.println("Apply to the test as an undergrad ");
		
	}
	
}

}
