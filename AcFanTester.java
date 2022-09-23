class AcFanTester{
	
	public static void main (String  [] args)
	{
		System.out.println("Main Method Started");
		System.out.println("-------------------");
		//invoking onOrOff() method
		AcFan.onOrOff();
		//invoking increaseAir() method
		AcFan.increaseAir();
		AcFan.increaseAir();
		AcFan.increaseAir();
		AcFan.increaseAir();
		AcFan.increaseAir();
		
		AcFan.decreaseAir();
		AcFan.decreaseAir();
		AcFan.decreaseAir();
		
		
	}
	
}