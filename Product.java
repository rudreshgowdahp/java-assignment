class Product{
short display(){
	System.out.println("Product  details is Displayed");
	return 1;
}
char grade;
double marks;
int semester;
Product(char grade,double marks, int semester){
	this.grade = grade;
	this.marks = marks;
	this.semester = semester;
	System.out.println("constructor is Product");
}
}