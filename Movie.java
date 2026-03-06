class Movie{
String play(){
	System.out.println("Movie is Playing");
	return "Playing";
}
double marks;
String collegeName;
long phoneNumber;
Movie(double marks,String collegeName,long phoneNumber){
	this.marks = marks;
	this.collegeName = collegeName;
	this.phoneNumber = phoneNumber;
	System.out.println("Constructor is Movie ");
}
}