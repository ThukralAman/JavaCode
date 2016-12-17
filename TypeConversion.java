/**
 * 
 */

/**
 * @author amthukra
 *
 */
public class TypeConversion {
	public static void main(String args[]){
		
		/** TYPE PROMOTION  * */
		int n=5;
		double x=n;
		System.out.println(x);
		
		/**  TYPE CASTING  **/
		double num=5.2;
		int k = (int)num;
		System.out.println(k);
		
		/** Type Promotion of int to long **/
		long p = 2147483647; //(max range of integer is type promoted to long )
		//long p = 2147483648; //(exceeding integer range so inorder to accommodate number need to add l after it [2147483648l WORKS] )
		System.out.println(p);
		
		/** Type promotion of bigger double to smaller floatnot possible  **/
		//float f = 3.27; // gives Error: cannot convert from double to float
		float f = 3.27f;
		System.out.println(f);
		
		/** Type conversion of double to float **/
		float d = (float)3.27;
		System.out.println(d);
		
		
		/**  SUM is typecasted to higher datatype **/
		double s=1.2;
		int q = 2;
		System.out.println(s+q);
		
		/** **/
		char ch=65+2;
		//ch = ch+2; // Error cannot type promote int to char [result of ( ch (char) + 2(int) ) is of type int  ]
		System.out.println(ch+2);
		System.out.println(ch);
	}
}
