
public class strategyPattern {
public abstract class course{}
public class Engineering extends course{
	practicalWork work;
	public void doTrialAndError(){
		work.trialError();
		
		
	}
	
	
}

public class medical extends course{}
public abstract class practicalWork{
	public  void trialError(){}
	public  void drillPractice(){};
}
public class TrialError extends practicalWork{

	@Override
	public void trialError() {
		System.out.println("Trial error");
		
	}

	}
public class drillPractice extends practicalWork{
	public void drillPractice(){System.out.println("drill practice");}
}
}
