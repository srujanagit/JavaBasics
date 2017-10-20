package comprable.comrator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentListcmprtr {
		
		
	public static void main(String[] args) {
		
		StudentCmprtr s1=new StudentCmprtr("Mounika",26,"A");  
		StudentCmprtr s2=new StudentCmprtr("Ajay",28,"A");  
		StudentCmprtr s3=new StudentCmprtr("Mani",24,"B");
		StudentCmprtr s4=new StudentCmprtr("Chitanya",27,"A");  
		StudentCmprtr s5=new StudentCmprtr("Abhinay",21,"C");
		  
		List<StudentCmprtr> l = new ArrayList<StudentCmprtr>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		 Collections.sort(l,new StudentCmprtrAge());
     
      for(StudentCmprtr st:l){
    	  System.out.println(st.getNum()+ " "+st.getName());
      }
     

      System.out.println("-------------------");
      
      
      Collections.sort(l,new StudentCmprtrgrade());
      for(StudentCmprtr st:l){
    	  System.out.println(st.getNum()+ " "+st.getName()+" "+st.getGrade());
      }
	}

}
