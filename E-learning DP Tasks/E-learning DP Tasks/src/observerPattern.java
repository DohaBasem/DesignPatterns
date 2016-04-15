import java.util.ArrayList;
import java.util.List;


public class observerPattern {
public abstract class Observer {
		  protected User subject;
		  String name;
		  public abstract void update();
		}
public class follower extends Observer{
	follower(String name,User subject){
		this.subject=subject;
		this.subject.attach(this);
		this.name=name;
		
	}

	@Override
	public void update() {
		System.out.println("To "+ this.name+" "+ this.subject.name+" "+"posted in the forum "+this.subject.post);
		
	}

	
}
public class User{
	
	private List<Observer> observers = new ArrayList<Observer>();
	   private String post;
	   private String name;
public User(String name){this.name=name;}
	   public String getState() {
	      return post;
	   }

	   public void setState(String state) {
	      this.post = state;
	      notifyAllObservers();
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   } 	
	
}
}
