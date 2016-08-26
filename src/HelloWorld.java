
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld myReview = new HelloWorld();
		myReview.exampleMethod("print this out using exampleMethod function");
		String[] interests = new String[5];
		interests[0] = "Houses";
		interests[1] = "New Technology";
		interests[2] = "Baked Goods";
		interests[3] = "Hockey";
		interests[4] = "Ireland";
		
		for(int i = 0; i < interests.length; i++) {
			System.out.println(interests[i]);
		}
	}
	
	public void exampleMethod(String message) {
		System.out.println(message);
	}
	
	
	

}


