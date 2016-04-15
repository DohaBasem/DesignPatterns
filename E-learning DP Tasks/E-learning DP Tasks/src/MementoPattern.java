import java.util.ArrayList;


public class MementoPattern {
	//Originator class
public class illustration{
	private String state;
	   

	   public void set(String state) { 
	       System.out.println("Illustration current state "+state);
	       this.state = state; 
	   }

	   public Memento saveToMemento() { 
	       System.out.println("Originator: Saving to Memento.");
	       return new Memento(state); 
	   }
	   public void restoreFromMemento(Memento m) {
	       state = m.getSavedState(); 
	       System.out.println("Originator: State after restoring from Memento: "+state);
	   }
}
public class Memento{
	String state;
	public Memento(String s){this.state=s;}
	public String getSavedState() { return state; }
}
public class careTaker{
	 private ArrayList<Memento> savedStates = new ArrayList<Memento>();

	   public void addMemento(Memento m) { savedStates.add(m); }
	   public Memento getMemento(int index) { return savedStates.get(index); }
}
}
