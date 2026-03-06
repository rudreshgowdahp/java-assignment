class Book{
boolean read(){
	System.out.println("Book is Reading");
	return true;
}
float height;
String collegeName;
int number;
Book(float height,String collegeName,int number){
	this.height = height;
	this.collegeName = collegeName;
	this.number = number;
	
	System.out.println("Constructor is Book");
}
}