package comprable.comrator;

import java.util.Comparator;

public class StudentCmprtrAge implements Comparator {

	
	public int compare(Object o1,Object o2) {
		StudentCmprtr sc1=(StudentCmprtr)o1;  
		StudentCmprtr sc2=(StudentCmprtr)o2; 
		
	if(sc1.getNum()==sc2.getNum())
		return 0;
	else if(sc1.getNum()> sc2.getNum())
		return 1;
	else 
		return -1;
	}

}