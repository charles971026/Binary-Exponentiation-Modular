package bme;



public class BinaryModular {
	
	public static void main(String args[]){
		
		System.out.println(computeMod(9,3,5));
		
	}
	/**
	 * It takes long numbers for base, exponent, and modular, and calculates the result by
	 * using binary exponentiation modular algorithm 
	 * @param base - base of the exponentiation  
	 * @param exp - exponent of the exponentiation
	 * @param mod - modular number
	 * @return the result of modular 
	 */
	public static long computeMod(long base, long exp, long mod){
		long remainder = 1; //Starting remainder
		long power = base; //Starting number to get mod
		String binary = Long.toBinaryString(exp); //Convert the exponent to Binary string
		
		//Loop the binary string backward in order to access the binary from the power of 1
		for(int x = binary.length() - 1; x >= 0; x--){
			if(binary.charAt(x) == '1'){
				//if the binary is 1 at that specific digit, multiply the power to remainder and mod
				remainder = (remainder * power)%mod;
			}
			//Update power to square of power mod 
			power = (power*power)%mod;
		}
		
		return remainder;
	}

}
