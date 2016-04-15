
public class AdapterPattern {
public interface OldInteractionInterface{
	public void viewCoursesCompletion();
	public void followUser();
	
}
public class conventionalInteraction implements OldInteractionInterface{

	@Override
	public void viewCoursesCompletion() {
		System.out.println("View the completed courses in the conventional manner ");
		
	}

	@Override
	public void followUser() {
		System.out.println("follow users in the conventional manner");
		
	}}
public interface NewInteractionMethod{
	public void viewProgressBar();
	public void addFriend();
	
}
public class gamifiedInteraction implements NewInteractionMethod{

	@Override
	public void viewProgressBar() {
		System.out.println("View the progress bar and add coins if target achieved");
		
	}

	@Override
	public void addFriend() {
		System.out.println("Socialize and be friends");
		
	}}
public class InteractionAdapter implements OldInteractionInterface{
public gamifiedInteraction game;
InteractionAdapter(gamifiedInteraction G){
	this.game=G;
}
	@Override
	public void viewCoursesCompletion() {
		game.viewProgressBar();
		
	}

	@Override
	public void followUser() {
		game.addFriend();
		
	}}
}
