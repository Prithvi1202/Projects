class CT{
	public static void main(String a[]){
			long startTime = System.currentTimeMillis();
			StringBuffer sb = new StringBuffer("Java");
			for(int i = 0; i<100;i++){
				sb.append(" Programming");
				System.out.println(sb);
			}
			System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime));
			
			startTime = System.currentTimeMillis();
			StringBuilder sb1 = new StringBuilder("Java");
			for(int i = 0; i<100;i++){
				sb1.append(" Programming");
				System.out.println(sb1);
			}
			
			System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime));
			
	}
}

