
public class bridgePattern {
public class UIDesigner{
	protected UICreator creator;
	UIDesigner(UICreator C){
		creator=C;
		
	}
	public void design(){
		creator.createDesign();
		
	}	
	
}
public abstract class UICreator{
	public abstract void createDesign();
}
public class HomePage extends UICreator{

	@Override
	public void createDesign() {
		System.out.println("Design UI for HomePage");
		// TODO Auto-generated method stub
		
	}

}
public class CoursePage extends UICreator{

	@Override
	public void createDesign() {
	System.out.println("Design UI for Course page ");	
	}

	}

}
