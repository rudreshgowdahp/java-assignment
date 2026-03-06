class Customer{
long buy(){
	System.out.println("Customer is buying");
	return 10000;
}
char section;
int id;
short age;
Customer(char section,int id,short age){
	this.section = section;
	this.id = id;
	this.age = (short)age;
	System.out.println("Constructor is Customer");
}
}