package com.inheritance;


class SMBST {
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
	
	class Courses extends SMBST {
		int courseid ;
		String coursename;
		String HODname;
		void display1( int courseid, String coursename, String HODname) {
			this.courseid = courseid;
			this.coursename = coursename;
			this.HODname = HODname;
			
		}
	}
	class Student extends Courses{
			String Studname;
			String StudAddress;
			int Studid;
			int StudABCid;
			void display2(String Studname, String StudAddress, int Studid, int StudABCid) {
				this.Studname =Studname;
				this.StudAddress = StudAddress;
				this.Studid = Studid;
				this.StudABCid = StudABCid;
			}	
			}
			class Class  extends Student{
				String Classname;
				String Classteachername;
				String Subname;
				void display3(String Classname, String Classteachername, String Subname) {
					this.Classname = Classname;
					this.Classteachername = Classteachername;
					this.Subname = Subname;
					
				}
			}
			class BCS extends Class{
				void display4() {
					System.out.println("I am BCS student");
				}
				
			}
			class BCA extends Class{
				void display5() {
					System.out.println("I am BCA student");
				}
			
			}
			class BBA extends Class{
				void display6 () {
					System.out.println("I am BBA student");
				}
			}
			class Bcom extends Class{
				void display7() {
					System.out.println("I am Bcom student");
				}
			}
			class BA extends Class{
				void display8() {
					System.out.println("I am BA student");
				}
			}
			class BSC extends Class{
				void display9() {
					System.out.println("I am Bsc student");
				}
			}

			class FY extends BCS{}
			class SY extends BCS{}
			class TY extends BCS{}
			  
public class Demo1 {
	public static void main(String[] args) {
		FY f1 = new FY();
		f1.display();
		f1.display1( 234, "BCS","Thakare M.V");
		f1.display2("Ram", "Akole", 23, 1234);
		f1.display3("FY.BCS", "Dalvi L,D", "Electronic");
		f1.display4();
		System.out.println("");
		SY s1 = new SY();
		s1.display();
		s1.display1(342, "BCS", "Thakare M.V");
		s1.display2("Sham","Sangamaner", 12, 6675);
		s1.display3("SY BCS", "Tambe P.S", "Data structure");
		s1.display4();
		System.out.println("");
		TY t1 = new TY();
		t1.display();
		t1.display1(234, "BCS", "Thakare M.V");
		t1.display2("Sita", "Ganore", 34, 60978);
		t1.display3("TY BCS", "Satpute S.G", "Java");
		t1.display4();
  }			
	
}


Output :- 

Collage id is:123
Collage Name is:SMBST college, Sangamaner
collage Email is:smbst234@mail.com
Collage Address is :Sangamaner tal:- Sangamner
I am BCS student

Collage id is:123
Collage Name is:SMBST college, Sangamaner
collage Email is:smbst234@mail.com
Collage Address is :Sangamaner tal:- Sangamner
I am BCS student

Collage id is:123
Collage Name is:SMBST college, Sangamaner
collage Email is:smbst234@mail.com
Collage Address is :Sangamaner tal:- Sangamner
I am BCS student

		
