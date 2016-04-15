import java.util.List;


public class MediatorPattern {
public abstract class user{
	AbstractMediator Med;
	public user(AbstractMediator med){
		this.Med=med;
		
	}
	public abstract void send();
	public abstract void recieve();
	
}
public class Student extends user{

	public Student(AbstractMediator med) {
		super(med);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send() {
		this.med;
		
	}

	@Override
	public void recieve() {
		// TODO Auto-generated method stub
		
	}}
public class Instructor extends user{

	public Instructor(AbstractMediator med) {
		super(med);
		// TODO Auto-generated constructor stub
	}}
public abstract class AbstractMediator{
	public abstract void addUser(user u);
	public abstract void broadcast(user s,String msg);
	
}
public class AnnouncementMediator extends AbstractMediator{
	private List<user> usersList;
	@Override
	public void addUser(user u) {
		usersList.add(u);
		
	}

	@Override
	public void broadcast(user s, String msg) {
		 for(user u : this.usersList){
			 if(u!=s)
				 s.send(u);
		 }
		
	}}
}
