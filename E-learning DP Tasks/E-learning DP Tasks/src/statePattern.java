
public class statePattern {
public class Student{
	private State[] states  = { new prospectiveStudent(), new readyStudent(), new graduatingStudent() };
	int current=0;
	
	public void Start(){
	states[current].apply(this);
		
	}
	public void setInitialState(int x){
		this.current=x;
	}
}
public abstract class State{
	public abstract void  apply(Student S);
		
}
public class prospectiveStudent extends State{

	@Override
	public void apply(Student S) {
		System.out.println("Accepted Terms ");
		S.current=1;
		S.Start();
		
	}}
public class readyStudent extends State{

	@Override
	public void apply(Student S) {
		System.out.println("Passed Assessment");
		S.current=2;
		S.Start();
	}}
public class graduatingStudent extends State{

	@Override
	public void apply(Student S) {
		System.out.println("Completed Course");
		
	}}
}
