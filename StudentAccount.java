class StudentAccount{
double deposit(){
	System.out.println("Money is deposited");
	return 6.6d;
}
long phoneNumber;
String name;
String department;
StudentAccount(long phoneNumber,String name,String department){
	this.phoneNumber = phoneNumber;
	this.name = name;
	this.department = department;
	System.out.println("Constructor is StudentAccount");
}
}