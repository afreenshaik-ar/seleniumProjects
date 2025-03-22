package seleniumClass;

public class encapsulation {

	private String name;
	private int age;
	private String idnum;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIdNum() {
		return idnum;
	}
	
	public  void setName(String newName) {
		name=newName;
	}
	
	public  void setAge(int newAge) {
		age=newAge;
	}
	
	public void  setIdNum(String newIdNum) {
		idnum=newIdNum;
	}

}
