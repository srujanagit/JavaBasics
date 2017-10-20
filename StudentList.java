package comprable.comrator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
		
		
	public static void main(String[] args) {
		
		 Student s1=new Student("Mounika",26,"A");  
		  Student s2=new Student("Ajay",28,"A");  
		  Student s3=new Student("Mani",24,"B");
		  Student s4=new Student("Chitanya",27,"A");  
		  Student s5=new Student("Abhinay",21,"C");
		  
		List<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
	
      Collections.sort(l);
      for(Student st:l){
    	  System.out.println(st.getNum()+ " "+st.getName());
      }

	}

}
