public class App {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s1=new Teacher();
		System.out.println("Hello");
		System.out.println("Hello -->"+s1.arraySchoolElement[0].idSchool); // first index
		System.out.println("Hello -->"+s1.arraySchoolElement[7].idSchool); // last index
	} 
}
abstract class Supeer { // abstract class CAN'T CREATE OBJECT --> AS TEMPLET
	int id;

	abstract void print();
}

class School extends Supeer { // Super Class --> Father
	School[] arraySchoolElement = new School[8];
	int countArray = 0;
	static int idSchool = 500;
	private int id;
	private String naemSchool;
	private double area;
	private int fullStudentCount;
	static int countSchool = 0;
	private int countStdSchool;
	private int countTeacherScho;

//	School(String _naemSchool , double _area , int _fullStudentCount ,int _countStdSchool , int _countTeacherScho){
//		id=idSchool;
//		idSchool++;
//		countSchool++;
//		naemSchool=_naemSchool;
//		area=_area;                                                    --->   ERRor Create Constructor from SuperClass
//		fullStudentCount=_fullStudentCount;
//		countStdSchool=_countStdSchool;
//		countTeacherScho=_countTeacherScho;
//	}
//	
	void print() { // Overraid --> function in Super Class
		System.out.println("Super Class");
	}

	// overloding
	void testArea(int countStu, double area) {
		if (countStu * 2 <= area) {
			System.out.println("1 fun True School -- > /");
		} else {
			System.out.println("1 fun Fasle School -- > /");
		}
	}

	// overloding
	void testArea(double area) {
		if (countStdSchool * 2 <= area) {
			System.out.println("2 fun True School -- > /");
		} else {
			System.out.println("2 fun Fasle School -- > /");
		}
	}
}

class Teacher extends School { // subClass --> extends --> inheritance to School class __ child
	private static int idTeacher = 1000;
	private int id;
	private String nameTeacher;
	private static int countTeacher = 0;
	private int age;
	private int yearWork;
	private double salare;
	private double extraSalare;

	Teacher() {

	}

	Teacher(String name, int _age, int _salare, int _yearWork) {
		idSchool++;
		countSchool++;
		id = idTeacher;
		idTeacher++;
		countTeacher++;
		age = _age;
		salare = _salare;
		yearWork = _yearWork;
		arraySchoolElement[countArray] = this; // ADD this object to arraySchoolElement array 
		countArray++; // ++
	}

	public static int getIdTeacher() {
		return idTeacher;
	}

	public int getId() {
		return id;
	}

	public String getNameTeacher() {
		return nameTeacher;
	}

	public static int getCountTeacher() {
		return countTeacher;
	}

	public int getAge() {
		return age;
	}

	public int getYearWork() {
		return yearWork;
	}

	public double getSalare() {
		return salare;
	}

	// overriding
	void print() {
		System.out.println("Teacher Class");
	}
}

class Student extends School { // subClass --> extends --> inheritance to School class __ child
	private static int idStudent = 400;
	private static int countStudent = 0;
	private int id;
	private String nameStudent;
	private int countSubject;
	private int age;

	Student(String name, int countSubject, int age) {
		idSchool++;
		countSchool++;
		id = idStudent;
		countStudent++;
		countStudent++;
		nameStudent = name;
		this.countSubject = countSubject;
		this.age = age;
		arraySchoolElement[countArray] = this; // ADD this object to arraySchoolElement array 
		countArray++; // ++
	} 

	// getter and setter
	public static int getCountStudent() {
		return countStudent;
	}

	public int getId() {
		return id;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public int getCountSubject() {
		return countSubject;
	}

	public int getAge() {
		return age;
	}

	// overriding
	void print() {
		System.out.println("Student Class");
	}
}
// 9/1/2023 9:42 AM in Lib JD