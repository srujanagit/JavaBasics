package comprable.comrator;

public class StudentCmprtr {

private	 String name;
private	 int num;
private	 String grade;
	
	public StudentCmprtr(String name,int num,String grade){
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

}