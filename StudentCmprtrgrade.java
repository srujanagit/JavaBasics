package comprable.comrator;

import java.util.Comparator;

public class StudentCmprtrgrade implements Comparator {

	
	public int compare(Object o1,Object o2) {
		StudentCmprtr sc1=(StudentCmprtr)o1;  
		StudentCmprtr sc2=(StudentCmprtr)o2; 
		
		return sc1.getGrade().compareTo(sc2.getGrade());
	}

}