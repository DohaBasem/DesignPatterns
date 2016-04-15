
public class classCreator {
abstract class courseCompletion{
	protected abstract void getDescription();
	protected abstract double cost();
}
//For the completion of engineering courses
 public class EngineeringCompletion extends courseCompletion{

	@Override
	protected void getDescription() {
		System.out.println("Congrats for completing the engineering course ");
		
	}

	@Override
	protected double cost() {
		return 30;
		
	}

 }
 public class MedicalCompletion extends courseCompletion{

	@Override
	protected void getDescription() {
		System.out.println("Congrats for completing the medical course ");
		
	}

	@Override
	protected double cost() {
		// TODO Auto-generated method stub
		return 40;
	}
	}
 public class HumanityCompletion extends courseCompletion{

	@Override
	protected void getDescription() {
		System.out.println("Congrats for completing the humanity course ");
		
	}

	@Override
	protected double cost() {
		// TODO Auto-generated method stub
		return 20;
	}
	}
abstract class Priviliges extends courseCompletion{
	courseCompletion completionStatement;
	protected abstract void getDescription();
	protected abstract double cost();

}
public class badge extends Priviliges{
badge(courseCompletion completion){
	this.completionStatement= completion;
	
}
	@Override
	protected void getDescription() {
		// TODO Auto-generated method stub
		this.completionStatement.getDescription();
		System.out.println("With badge");
		
	}

	@Override
	protected double cost() {
		// TODO Auto-generated method stub
		double cost=this.completionStatement.cost()+10;
		return cost;
	}}
public class internship extends Priviliges{
internship(courseCompletion completion){
	this.completionStatement= completion;
	
}
	@Override
	protected void getDescription() {
		// TODO Auto-generated method stub
		this.completionStatement.getDescription();
		System.out.println("With internship");
		
	}

	@Override
	protected double cost() {
		// TODO Auto-generated method stub
		double cost=this.completionStatement.cost()+50;
		return cost;
	}}
}
