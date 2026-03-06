class Library{
void issueBook(){
	System.out.println("Issued from Library");
}
String userName;
float height;
int id;
Library(String userName,float height, int id){
	this.userName = userName;
	this.height = height;
	this.id = id;
	System.out.println("Constructor is Library");
	
}

}
