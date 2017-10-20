package comprable.comrator;

public class Student implements Comparable<Student> {

private	 String name;
private	 int num;
private	 String grade;
	
	public Student(String name,int num,String grade){
	this.name=name;
	this.num=num;
	this.grade=grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int compareTo(Student s) {
		if(num==s.num)
		return 0;
		else if(num> s.num)
			return 1;
		else
			return -1;
	}
	
}
/*1.implement comparable<classname>
  2.write comparision code in compareTo(cls obj)
  3.collection.sort(list)
*/