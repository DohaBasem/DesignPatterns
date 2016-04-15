import java.util.ArrayList;
import java.util.Iterator;




public class interpreter {
	public abstract class MusicalNotation{
		String music;
	//Every note has its own music
		
		public abstract void interpret();
		
			
			
		
		 
			
			
		
		
	}
	//This is the leaf
	public class Note extends MusicalNotation{

		@Override
		public void interpret() {
			
			System.out.print(this.music); //Hearing the music
		}

	
	}
	//This is the composite
	public class signature extends MusicalNotation{
		ArrayList notes=new ArrayList();
		

		

		
		public ArrayList getNotes() {
			return this.notes;
			
		}

		
		
		public void interpret(){
			
			
			Iterator noteIterator=notes.iterator(); //Iterate over all the courses in the arraylist
			while(noteIterator.hasNext()){
				MusicalNotation musicalnotation =  (MusicalNotation)noteIterator.next();
				musicalnotation.interpret();
				
			}
			
			
		}
	}

}
