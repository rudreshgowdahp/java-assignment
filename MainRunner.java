class MainRunner{
	public static void main(String[]args){
	  Book book = new Book(1.5f,"Anupama",100);
	  Employee employee = new Employee(6,7,8);
	  StudentAccount studentAccount =  new StudentAccount(12345678,"Rudresh","Admin");
	  Customer customer = new Customer('A',3,(short)5);
	  Product product = new Product('A',7.6f,2);
	  Order order = new Order(true,34.4f,6.7d);
	  Hospital hospital = new Hospital("Laggere","rd@gmail.com","User");
	  Patient patient = new Patient(1,2,'B');
	  Movie movie = new Movie(100,"Anupama",98);
	  Library library = new Library("rudresh",2.3f,10);
	  
	  if(product!=null){
		   product.display();
		     System.out.println(product.grade);
		  System.out.println(product.marks);
		  System.out.println(product.semester);
	  }else{
		  System.out.println("Your object is not created");
	  }
	  if (customer!=null){
		  customer.buy();
		    System.out.println(customer.section);
		  System.out.println(customer.id);
		  System.out.println(customer.age);
	  }else{
		  System.out.println("Your object is not created");
	  }
	  if(studentAccount!=null){
		  studentAccount.deposit();
		    System.out.println(studentAccount.phoneNumber);
		  System.out.println(studentAccount.name);
		  System.out.println(studentAccount.department);
	  }else{
		  System.out.println("Your object is not created");
	  }
	  if(patient!=null){
		  patient.takeMedicine();
		    System.out.println(patient.age);
		  System.out.println(patient.id);
		  System.out.println(patient.section);
	  }else{
		  System.out.println("Your object is not created");
	  }
	  if(employee!=null){
		  employee.work();
		  System.out.println(employee.id);
		  System.out.println(employee.age);
		  System.out.println(employee.number);
	  }else{
		  System.out.println("Your object is not created");
	  }
	  if(book!=null){
		  book.read();
		  System.out.println(book.height);
		  System.out.println(book.collegeName);
		  System.out.println(book.number);
	  }else{
		  System.out.println("Your object is not created");
	  }
	  
	  if(hospital!=null){
		  hospital.admitPatient();
		    System.out.println(hospital.address);
		  System.out.println(hospital.email);
		  System.out.println(hospital.department);
	  }else{
		  System.out.println("Your object is not created");
	  }
	  
	  
	  if(movie!=null){
		  movie.play();
		    System.out.println(movie.marks);
		  System.out.println(movie.collegeName);
		  System.out.println(movie.phoneNumber);
	  }else{
		  System.out.println("Your object is not created");
	  }
	  if(library!=null){
		  library.issueBook();
		  System.out.println(library.userName);
		  System.out.println(library.height);
		  System.out.println(library.id);
		  
	  }else{
		  System.out.println("Your object is not created");
		  
	  }
	  if(order!=null){
		  order.placeOrder();
		  System.out.println(order.ispassed);
		  System.out.println(order.height);
		  System.out.println(order.weight);
		  
	  }else{
		  System.out.println("Your object is not created");
		  
	  }
	  
		  
	  	 
	  
	}
}