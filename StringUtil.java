package merkletree;
import java.security.MessageDigest;
//generate a digital fingerprint to use a SHA256 hushing algorithm
public class StringUtil {
	// This method calculates and returns the SHA-256 hash of the input string.
	public static String applySha256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			
			// Compute the hash by applying the algorithm to the input bytes.
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			
			// Create a StringBuffer to store the hash as a hexadecimal string.
			StringBuffer hexString = new StringBuffer(); //this will contain hash as a hexadecimal
			
			// Convert each byte of the hash to its hexadecimal representation.
			for (int i = 0; i<hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				
				// Ensure that each byte is represented by two hexadecimal digits
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			} 
			return hexString.toString(); //it takes the a string => 
			//applies SHA 256 algorithm => returns the generated signature as a string
		}
		catch (Exception e) {
			throw new RuntimeException(e);			// In case of any exceptions, throw a runtime exception.

		}
	}

}
