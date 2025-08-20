package com.inheritance;


class College {
	int collageid  = 123 ;
	String collagename  = "SMBST college, Sangamaner";
	String collageemail = "smbst234@mail.com";
	String collageAddress = "Sangamaner tal:- Sangamner";
	
	void display(){
		System.out.println("Collage id is:" + collageid);
		System.out.println("Collage Name is:" + collagename);
		System.out.println("collage Email is:" + collageemail);
		System.out.println("Collage Address is :" + collageAddress);
	}
}
	
	class Courses extends College {
		int courseid ;
		String coursename;
		String HODname;
		Courses( int courseid, String coursename, String HODname) {
			this.courseid = courseid;
			this.coursename = coursename;
			this.HODname = HODname;
			
		}
		void display1() {
			System.out.println(" Course id is:" + courseid);
			System.out.println("Course name is:" + coursename);
			System.out.println("HOD name is:" + HODname);
			
		}
	}
	class Student extends Courses{
			String Studname;
			String StudAddress;
			int Studid;
			int StudABCid;
Student(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid) {
	super(courseid, coursename, HODname);
			this.Studname =Studname;
			this.StudAddress = StudAddress;
			this.Studid = Studid;
			this.StudABCid = StudABCid;
			}	
void display2() {
	System.out.println("Student name is" + Studname);
	System.out.println("Student Address is: " + StudAddress);
    System.out.println("Student id is: " + Studid);
    System.out.println("Student ABC id is: " + StudABCid);
}


}
			
			
			class Class  extends Student{
				String Classname;
				String Classteachername;
				String Subname;
				Class (int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname) {
					super (courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid );
					this.Classname = Classname;
					this.Classteachername = Classteachername;
					this.Subname = Subname;}
			
				void display3() {
			        System.out.println("Class name is: " + Classname);
			        System.out.println("Class teacher is: " + Classteachername);
			        System.out.println("Subject name is: " + Subname);}
		
			}
			
			class BCS extends Class{
				BCS(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname){
					super(courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid, Classname, Classteachername, Subname);
				}
				void display4() {
					System.out.println("I am BCS student");
				}
				
			}
			class BCA extends Class{
				BCA(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname){
					super(courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid, Classname, Classteachername, Subname);}
				void display5() {
					System.out.println("I am BCA student");
				}
			
			}
			class BBA extends Class{
				BBA(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname){
					super(courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid, Classname, Classteachername, Subname);
			
			}
			
				void display6 () {
					System.out.println("I am BBA student");
				}
			}
			class Bcom extends Class{
				Bcom(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname){
					super(courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid, Classname, Classteachername, Subname);}
				void display7() {
					System.out.println("I am Bcom student");
				}
			}
			class BA extends Class{
				BA(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname){
					super(courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid, Classname, Classteachername, Subname);}
				void display8() {
					System.out.println("I am BA student");
				}
			}
			class BSC extends Class{
				BSC(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname){
					super(courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid, Classname, Classteachername, Subname);}
				void display9() {
					System.out.println("I am Bsc student");
				}
			}

			class FY extends BCS{
				FY(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname){
					super(courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid, Classname, Classteachername, Subname);
			}
			}
			class SY extends BCS{
				SY(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname){
					super(courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid, Classname, Classteachername, Subname);}
			}
			class TY extends BCS{
				TY(int courseid, String coursename, String HODname,String Studname, String StudAddress, int Studid, int StudABCid,String Classname, String Classteachername, String Subname){
					super(courseid, coursename, HODname, Studname, StudAddress, Studid, StudABCid, Classname, Classteachername, Subname);}
			}
			
			  
public class Demo1 {
	public static void main(String[] args) {
		FY f1 = new FY(234,"BCS","Thakare M.V","Ram", "Akole", 23, 1234,"FY.BCS", "Dalvi L,D", "Electronic");
		f1.display();
		f1.display1();
		f1.display2();
		f1.display3();
		f1.display4();
		System.out.println("");
		SY s1 = new SY(342, "BCS", "Thakare M.V","Sham","Sangamaner", 12, 6675,"SY BCS", "Tambe P.S", "Data structure");
		s1.display();
		s1.display1();
		s1.display2();
		s1.display3();
		s1.display4();
		System.out.println("");
		TY t1 = new TY(234, "BCS", "Thakare M.V","Sita", "Ganore", 34, 75684,"TY BCS", "Satpute S.G", "Java");
		t1.display();
		t1.display1();
		t1.display2();
		t1.display3();
		t1.display4();
		
				
		}
		
			
	
}
			
			


Output: - Collage id is:123
Collage Name is:SMBST college, Sangamaner
collage Email is:smbst234@mail.com
Collage Address is :Sangamaner tal:- Sangamner
 Course id is:234
Course name is:BCS
HOD name is:Thakare M.V
Student name isRam
Student Address is: Akole
Student id is: 23
Student ABC id is: 1234
Class name is: FY.BCS
Class teacher is: Dalvi L,D
Subject name is: Electronic
I am BCS student

Collage id is:123
Collage Name is:SMBST college, Sangamaner
collage Email is:smbst234@mail.com
Collage Address is :Sangamaner tal:- Sangamner
 Course id is:342
Course name is:BCS
HOD name is:Thakare M.V
Student name isSham
Student Address is: Sangamaner
Student id is: 12
Student ABC id is: 6675
Class name is: SY BCS
Class teacher is: Tambe P.S
Subject name is: Data structure
I am BCS student

Collage id is:123
Collage Name is:SMBST college, Sangamaner
collage Email is:smbst234@mail.com
Collage Address is :Sangamaner tal:- Sangamner
 Course id is:234
Course name is:BCS
HOD name is:Thakare M.V
Student name isSita
Student Address is: Ganore
Student id is: 34
Student ABC id is: 75684
Class name is: TY BCS
Class teacher is: Satpute S.G
Subject name is: Java
I am BCS student
