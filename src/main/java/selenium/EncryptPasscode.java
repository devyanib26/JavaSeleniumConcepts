package selenium;

import java.util.Base64;

public class EncryptPasscode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Devyani";
		String code  ="UGFzc3dvcmQ=";
		
		EncryptPasscode ep = new EncryptPasscode();
		ep.encryptData(input);
		ep.decryptData(code);
	}
	
	public byte[] encryptData(String input) {
		byte[] encodedBytes = Base64.getEncoder().encode(input.getBytes());
		System.out.println("Encoded Bytes --------------->" + new String(encodedBytes));
		return encodedBytes;
	}
	
	public byte[] decryptData(String code) {
		byte[] decodeBytes = Base64.getDecoder().decode(code.getBytes());
		System.out.println("Decoded Text --------------->" + new String(decodeBytes));
		return decodeBytes;
	}	

}
