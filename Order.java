class Order{
byte placeOrder(){
	System.out.println("Order is placed");
	return 5;
}
boolean ispassed;
float height;
double weight;
Order(boolean ispassed,float height,double weight){
	this.ispassed = ispassed;
	this.height = height;
	this.weight = weight;
	System.out.println("Constructor is Order");
}
}