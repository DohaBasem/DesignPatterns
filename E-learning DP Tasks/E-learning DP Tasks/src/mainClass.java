




public class mainClass {
	public static void main(String [] args) throws Exception{
		classCreator x=new classCreator();
		IteratorCreator it=new IteratorCreator();
		factoryCreator FT=new factoryCreator();
		Composite compositePattern=new Composite();
		Template template=new Template();
		builder build=new builder();
		prototype Prototype=new prototype();
		classCreator.courseCompletion C= x.new EngineeringCompletion();
		abstractFactory abstractF=new abstractFactory();
		FlyweightPattern fly=new FlyweightPattern();
		commandPattern command=new commandPattern();
		MementoPattern memento=new MementoPattern();
		observerPattern ObsPattern=new observerPattern();
		statePattern StatePat=new statePattern();
		bridgePattern bridge=new bridgePattern();
		C=x.new badge(C);
		C=x.new internship(C);
		C.getDescription();
		System.out.println(C.cost());
		//For the factory pattern
		System.out.println("For the factory pattern");
		factoryCreator.factory fact=FT.new coursePublisher();
		fact.publishCourse("Engineering");
		//Testing the composite pattern
		System.out.println("Testing Composite Design Pattern ");
		Composite.Curriculum course1 =compositePattern.new course("Machine Learning I");
		Composite.Curriculum course2 =compositePattern.new courseWithPrerequisite("Machine Learning II");
		Composite.Curriculum course3 =compositePattern.new course("Statistics");
		Composite.Curriculum course4 =compositePattern.new courseWithPrerequisite("Advanced Machine Learning");
		Composite.Curriculum course5 =compositePattern.new course("Economy");
		course2.addPrerequisite(course1);
		course4.addPrerequisite(course2);
		course4.addPrerequisite(course3);
		course4.displayAllCourses();
		//Testing the template pattern
		System.out.println("Testing the template design pattern ");
		System.out.println("A graduate applying ");
		Template.RegTemplate regTemplate =template.new graduateReg();
		regTemplate.register();
		
		System.out.println("An Undergraduate applying ");
		Template.RegTemplate regTemplate2 =template.new underGradReg();
		regTemplate2.register();
		//Testing builder design pattern
		System.out.println("Testing Builder Design Pattern ");
		System.out.println("Social eLearning");
		builder.ClassBuilder b1 =build.new socialClass();
		builder.CourseDirector director=build.new CourseDirector(b1);
		director.createElearningClass();
		System.out.println("Self Paced eLearning");
		builder.ClassBuilder b2 =build.new selfPacedClass();
		builder.CourseDirector director2=build.new CourseDirector(b2);
		director2.createElearningClass();
		System.out.println("Test abstract Factory Design pattern");
		abstractFactory.universityAbstractFactory F1=abstractF.new stanfordUniversityFactory();
		F1.contribute();
		//Testing prototype Design pattern
		System.out.println("Testing prototype Design pattern");
		prototype.cloningCreator cloner=Prototype.new cloningCreator(); 
		prototype.studentUserProfile SP =Prototype.new studentUserProfile();
		prototype.userProfile SP2=SP.cloneProfile();
	SP.setName("Doha");
	SP.checkCloning();
	SP2.setName("Mariam");
	SP2.checkCloning();
		System.out.println("Testing command design pattern");
		commandPattern.profile user=command.new profile("Doha");
		
		commandPattern.invoker invoke=command.new invoker();
		commandPattern.promoteProfile promote=command.new promoteProfile();
		promote.setProfile(user);
		invoke.setCommand(promote);
		invoke.invokeCommand();
		System.out.println("Testing Memento design pattern");
		MementoPattern.illustration board=memento.new illustration();
		board.set("state 1");
		//Save this state
		MementoPattern.careTaker caretaker=memento.new careTaker();
		caretaker.addMemento( board.saveToMemento() );
		board.set("State 2");
		board.set("state 3");
		board.restoreFromMemento( caretaker.getMemento(0) );
		System.out.println("Testing the observer design pattern ");
		observerPattern.User u=ObsPattern.new User("Doaa");
		observerPattern.Observer follower1=ObsPattern.new follower("Doha",u);
		observerPattern.Observer follower2=ObsPattern.new follower("Roba",u);
		observerPattern.Observer follower3=ObsPattern.new follower("Hana",u);
		u.setState("Hello people My First Post");
		System.out.println("Testing the state design pattern");
		statePattern.Student S=StatePat.new Student();
		S.setInitialState(0);
		S.Start();
		System.out.println("Testing bridge pattern");
		bridgePattern.UICreator creator=bridge.new HomePage();
		bridgePattern.UIDesigner designer=bridge.new UIDesigner(creator);
		designer.design();
		System.out.println("Testing flyweight design pattern");
		FlyweightPattern.panelsFactory factory=fly.new panelsFactory();
		FlyweightPattern.MsgPanel panel;
		panel=factory.createPanel(7,"Welcome");
		panel.diplayPanel();
		
	}
}
