class AcFan{
	
	static String brand = "Mi";
	static String colour = "Black";
	static String material = "Fiber with Metal Body";
	static double price = 12345.99;
	static boolean isConnected;
	static int minAir;
	static int maxAir=10;
	static int currentAir;
	
	public  static  boolean onOrOff()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Inside the onOrOff () method : ");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The AcFan is turned ON ::");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("The AcFan is turned OFF ::");
		}
		System.out.println("End of  the onOrOff () method : ");
		System.out.println("-----------------------------------------------");
		return isConnected;
	}
	//System.out.println("This currentAir is : "+currentAir);
	//System.out.println("-----------------------------------------------");
	public  static void increaseAir()
	{
		System.out.println("Inside the increase Air () method : ");
		System.out.println("");
		if(isConnected){
			if(currentAir<maxAir)
			{
				currentAir=currentAir+1;
				System.out.println("The current Air Increased to : "+currentAir);
			}
			else {
				System.out.println("Max  Air is reached!!!!!!! :" );
			}
		}
		else{
			System.out.println("Hey Stupid first turn on the AcFan :" );
		}
		System.out.println("THIS  IS End of increaseAir() Method  ");
		System.out.println("-----------------------------------------------");
		System.out.println("");
	}
	
	public static void decreaseAir()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("THIS  IS inside the decreaseAir() Method  ");
		System.out.println("");
		if(isConnected){
			if (currentAir>minAir){
				currentAir=currentAir-1;
				System.out.println("The Air is Decreased to : "+currentAir);
			}
			else{
				System.out.println("Min Air is reached!!!!!!! :" );
			}
		}
		else{
			System.out.println("Hey Stupid first turn on the AcFan :" );
		}
		System.out.println("THIS  Is End of decreaseAir() Method  ");
		System.out.println("-----------------------------------------------");
		System.out.println("");
	
	}
	
}