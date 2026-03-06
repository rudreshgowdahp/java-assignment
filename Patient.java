class Patient{
 float takeMedicine(){
	 System.out.println("Patient is taking medicine");
	 return 10.0f;
 }
 int age;
 int id;
 char section;
 Patient( int age,int id,char section){
	 this.age = age;
	 this.id = id;
	 this.section = section;
	 System.out.println("constructor is Patient");
 }
 }