import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

//Interface implemented by each student's class iterators
public class IteratorCreator {
public interface StudentIterator { public Iterator createIterator(); }
//Class for creating a student

public class studentsOf2015 implements StudentIterator {
	ArrayList<String> students2015=new ArrayList();
	studentsOf2015(){
		students2015.add("doaa");
		students2015.add("Roba");
		students2015.add("Hana");
		students2015.add("kareem");
		
		
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return students2015.iterator();
	}
	
}

public class studentsOf2016 implements StudentIterator {
	String[] students2016 =new String[4];
	studentsOf2016(){
		students2016[0]="Doha";
		students2016[1]="Mai";
		students2016[2]="akram";
		students2016[3]="wael";
		
				
		
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(students2016).iterator();
	}
	
}
/**
public class studentViewer{
	StudentIterator S2015;
	StudentIterator S2016;
	Iterator I2015=S2015.createIterator();
	Iterator I2016=S2016.createIterator();
	
	
	
}
**/
public void printTheStudents(Iterator iterator){
	while(iterator.hasNext())
	{ String studentInfo = (String) iterator.next();
	  System.out.println(studentInfo);
    } 
	}

}
