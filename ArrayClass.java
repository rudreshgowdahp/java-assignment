class ArrayClass{
	public static void main(String[]args){
		int[] numbers ={1,2,3,4,5};
		int[] names = new int[5];
        names[0]=1;
        names[1]=2;
        names[2]=3;
		names[3]=4;
		names[4]=5;
		for(int number:numbers){
			System.out.println(number);
		}
		for(int name: names){
		System.out.println(name);
		}
		String [] personNames={"rudresh","harsha","pavan","manoj"};
		String [] carNames = new String[3];
		 carNames[0]="Innova";
		 carNames[1]="fortuner";
		 carNames[2]="swift";
		 for(String personName:personNames){
			 System.out.println(personName);
		 }
		 for(String carName:carNames){
			 System.out.println(carName);
		 }
		 long[] phoneNumber ={123,1234567,6778};
		 long[] carNumber=new long[3];
		 carNumber[0]=1234;
		 carNumber[1]=7890;
		 carNumber[2]=7654;
		 for(long phoneNumbers:phoneNumber){
			 System.out.println(phoneNumbers);
		 }
		 for(long carNumbers:carNumber){
			 System.out.println(carNumbers);
		 }
		 
	}



}