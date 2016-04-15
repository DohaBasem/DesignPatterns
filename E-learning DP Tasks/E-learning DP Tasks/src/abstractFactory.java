/*An abstract factory design pattern in which different universities contribute to the online learning system
 * by providing courses and online meetups to some course*/
public class abstractFactory {
//Abstract factory
abstract class universityAbstractFactory{
	public abstract void contribute();
}
public class stanfordUniversityFactory extends universityAbstractFactory{
abstractCourse MLCourse=new MachineLearningCourse();
abstractMeetup MLMeetup=new MachineLearningMeetUp();
	@Override
	public void contribute() {
		MLCourse.provideCourse();
		MLMeetup.coordinateMeetup();
		
	}
		
	}
class columbiaUniversityFactory extends universityAbstractFactory{
	abstractCourse VisCourse=new VisualizationCourse();
	abstractMeetup VisMeetup=new VisualizationMeetup();
	@Override
	public void contribute() {
		VisCourse.provideCourse();
		VisMeetup.coordinateMeetup();
		// TODO Auto-generated method stub
		
	}}
//Abstract productA
abstract class abstractMeetup{
	public abstract void coordinateMeetup();
}
class MachineLearningMeetUp extends abstractMeetup{

	@Override
	public void coordinateMeetup() {
		System.out.println("Co-ordinate a meetup for machine learning topics");
		
	}}
class VisualizationMeetup extends abstractMeetup{

	@Override
	public void coordinateMeetup() {
		System.out.println("Co-ordinate a meetup for visualization topics");
		
	}}
//Abstract productB
abstract class abstractCourse{
	public abstract void provideCourse();
}
class MachineLearningCourse extends abstractCourse{

	@Override
	public void provideCourse() {
		System.out.println("provide machine learning course");
		
	}
public class VisualizationCourse extends abstractCourse{

		@Override
		public void provideCourse() {
			System.out.println("provide machine learning course");
			
		}
		
}
}
class VisualizationCourse extends abstractCourse{

	@Override
	public void provideCourse() {
		System.out.println("Provide Visualization course ");
		
	}
	
}
}