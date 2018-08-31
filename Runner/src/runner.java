
public class runner {

	public static void main(String[] args) {

		// String taring= tar.substring(,13);
		// System.out.println(taring);

//		String tar = "abc";
//		String taring = "";
//
//		for (int i = tar.length() - 1; i >= 0; i--) {
//			taring = taring + tar.charAt(i);
//
//		}
//
//		System.out.println(taring);
		
 		System.out.println(method(3));

	}

	public static int method(int i) {   
		

		if (i == 1) {

			return i;
			
		} else {

			return method(i - 1) +i;
		}

	}
		
}
