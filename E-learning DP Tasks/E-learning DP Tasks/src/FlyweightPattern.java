import java.util.HashMap;


public class FlyweightPattern {
public   class panelsFactory{
	//A hashmap that contains the panels already created
	private    HashMap<Integer,MsgPanel> panelMap = new HashMap();
	

	public  MsgPanel createPanel(int dimensions,String Type){
		MsgPanel MP=(MsgPanel)panelMap.get(dimensions);
		if(MP==null)	//There is no panel with the required dimensions
		{if(Type.equals("Welcome")){
			MP=new WelcomeMsg(dimensions);
			 panelMap.put(dimensions,MP);
		System.out.println("Panel added to the list");}	
		else if(Type.equals("Warning")){
			MP=new WarningMsg(dimensions);
			 panelMap.put(dimensions,MP);
		System.out.println("Panel added to the list");
			
		}
		}
		return MP;
		
		
	}
	
}
public abstract class MsgPanel{
	int dim;
	public MsgPanel(int x){this.dim=x;}
	public abstract void diplayPanel();
}
public class WelcomeMsg extends MsgPanel{
String content;

public WelcomeMsg(int d){
	super(d);
}
	@Override
	public void diplayPanel() {
		this.content=content	;	
	}
	}
public class WarningMsg extends MsgPanel{

	public WarningMsg(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void diplayPanel() {
		System.out.println("Display warning Msg");
		// TODO Auto-generated method stub
		
	}
	
	
}
}
