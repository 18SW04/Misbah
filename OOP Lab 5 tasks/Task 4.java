//To create a Student class that stores student data and use method to display it
class Student{
	String name;
	String dept;
	String rollno;
	Student(String name,String dept,String rollno){
		this.name=name;
		this.dept=name;
		this.rollno=rollno;
		System.out.print(name+" "+dept+" "+rollno);


	}
	public static void main(String args[]){
    Student s1 = new Student("Misbah","Software-Engineering","18SW04");
}
	}