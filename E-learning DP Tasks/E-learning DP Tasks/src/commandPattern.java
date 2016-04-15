
public class commandPattern {
public abstract class profileCommand{
	
	public abstract void execute();
}
public class promoteProfile extends profileCommand{
	private profile P;
	public void setProfile(profile p){
		this.P=p;
	}
	@Override
	public void execute() {
		System.out.println("Promote the profile of "+ P.name);
		
	} 
	
}
public class banProfile extends profileCommand{
	private profile P;

	@Override
	public void execute() {
		System.out.println("ban the profiel of"+P.name);
		
	}
}
public class profile{	
	String name;
	profile(String N){
		this.name=N;
	}
}
public class invoker{
	public profileCommand command;
	public void setCommand(profileCommand command){
		this.command=command;		
	}
	public void invokeCommand(){
		this.command.execute();
		
	}
	
}
}
