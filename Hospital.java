class Hospital{
 int admitPatient(){
	 System.out.println("patient is admitted in hospital");
	 return 13;
 }
 String address;
 String email;
 String department;
 
 Hospital(String address,String email,String department){
	 this.address = address;
	 this.email = email;
	 this.department = department;
	 System.out.println("constructor is Hospital");
 }
}
