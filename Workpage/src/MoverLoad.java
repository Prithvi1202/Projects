

class MoverLoad{
	void calc(float f1 , float f2){
		System.out.println("Ceil: " +Math.ceil(f1));
		System.out.println("Floor: " +Math.floor(f2));
	}
	void calc(float f1){
		System.out.println("Absolute: " +Math.abs(f1));
	}
	
	void calc(double d1, double d2){
		System.out.println("d1"+  " ^ "+  d2 +" = " + Math.pow(d1, d2));
	}
	
	public static void main(String [] args){
		MoverLoad m1 = new MoverLoad();
			m1.calc(4.1f, 8.9f);
			m1.calc(-22.10f);
			m1.calc(10.0, 4.0);
	}
}