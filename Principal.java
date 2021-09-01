/* Este Proyecto fue logrado gracias a APIs & Paqutes hechos por Programadores Expertos, sin embargo.
El Credito se lo lleva Netting por haber hecho funcionar de tal modo tales Paquetes & APIs.
© Prod Ryan 2021 - Coded by Prod Ryan [ Netting ] */

// ----- [ Package ] ----- //
package netting;

// ----- [ Importacion de APIs ] ----- //
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Principal {
	
	// ----- [ Menu ] ----- //
	
	public static void main(String[] args) {
		
		Scanner tipoHash = new Scanner(System.in);
		System.out.println("""		
		1 - MD5
		2 - MD2
		3 - SHA256
		4 - SHA1
		5 - SHA224
		6 - SHA384
		7 - SHA512""");
		System.out.println("¿Que tipo de Hash quieres realizar?: ");
		int hashes = tipoHash.nextInt();
		
		if (hashes == 1) {
			md5();
		} else if (hashes == 2) {
			md2();
		} else if (hashes == 3) {
			sha256();
		} else if (hashes == 4) {
			sha1();
		} else if (hashes == 5) {
			sha224();
		} else if (hashes == 6) {
			sha384();
		} else if (hashes == 7) {
			sha512();
		} else {
			System.out.println("No encontre lo que elegiste");
		}
		
	}
	
	// ----- [ Funciones ] ----- //
	
	public static void md5() {
		try {
			Scanner sc = new Scanner(System.in);
		    System.out.println("Ingrese un Mensaje para Encriptarlo en MD5: ");
		    String message = sc.nextLine();
			  
		    MessageDigest md = MessageDigest.getInstance("MD5");

		    md.update(message.getBytes());
		      
		    byte[] digest = md.digest();
		     
		    StringBuffer hexString = new StringBuffer();
		      
		    for (int i = 0;i<digest.length;i++) {
		       hexString.append(Integer.toHexString(0xFF & digest[i]));
		    }
		    System.out.println("MD5: " + hexString.toString());
		} catch (NoSuchAlgorithmException e) {
	        System.err.println("Lo siento, parece que ese mensaje no es valido y como tal no lo pude transformar en MD5. Contacta con Netting.");
	    }
	}
	
	public static void sha256() {
		try {
			Scanner sc = new Scanner(System.in);
		    System.out.println("Ingrese un Mensaje para Encriptarlo en SHA256: ");
		    String message = sc.nextLine();
			  
		    MessageDigest md = MessageDigest.getInstance("SHA-256");

		    md.update(message.getBytes());
		
		    byte[] digest = md.digest();
		     
		    StringBuffer hexString = new StringBuffer();
		      
		    for (int i = 0;i<digest.length;i++) {
		       hexString.append(Integer.toHexString(0xFF & digest[i]));
		    }
		    System.out.println("SHA256: " + hexString.toString());
		} catch (NoSuchAlgorithmException e) {
	        System.err.println("Lo siento, parece que ese mensaje no es valido y como tal no lo pude transformar en SHA256. Contacta con Netting.");
	    }
	}
	
	public static void sha1() {
		try {
			Scanner sc = new Scanner(System.in);
		    System.out.println("Ingrese un Mensaje para Encriptarlo en SHA1: ");
		    String message = sc.nextLine();
			  
		    MessageDigest md = MessageDigest.getInstance("SHA-1");

		    md.update(message.getBytes());
		
		    byte[] digest = md.digest();
		     
		    StringBuffer hexString = new StringBuffer();
		      
		    for (int i = 0;i<digest.length;i++) {
		       hexString.append(Integer.toHexString(0xFF & digest[i]));
		    }
		    System.out.println("SHA1: " + hexString.toString());
		} catch (NoSuchAlgorithmException e) {
	        System.err.println("Lo siento, parece que ese mensaje no es valido y como tal no lo pude transformar en SHA1. Contacta con Netting.");
	    }
	}
	
	public static void sha224() {
		try {
			Scanner sc = new Scanner(System.in);
		    System.out.println("Ingrese un Mensaje para Encriptarlo en SHA224: ");
		    String message = sc.nextLine();
			  
		    MessageDigest md = MessageDigest.getInstance("SHA-224");

		    md.update(message.getBytes());
		
		    byte[] digest = md.digest();
		     
		    StringBuffer hexString = new StringBuffer();
		      
		    for (int i = 0;i<digest.length;i++) {
		       hexString.append(Integer.toHexString(0xFF & digest[i]));
		    }
		    System.out.println("SHA224: " + hexString.toString());
		} catch (NoSuchAlgorithmException e) {
	        System.err.println("Lo siento, parece que ese mensaje no es valido y como tal no lo pude transformar en SHA224. Contacta con Netting.");
	    }
	}
	
	public static void md2() {
		try {
			Scanner sc = new Scanner(System.in);
		    System.out.println("Ingrese un Mensaje para Encriptarlo en MD2: ");
		    String message = sc.nextLine();
			  
		    MessageDigest md = MessageDigest.getInstance("MD2");

		    md.update(message.getBytes());
		
		    byte[] digest = md.digest();
		     
		    StringBuffer hexString = new StringBuffer();
		      
		    for (int i = 0;i<digest.length;i++) {
		       hexString.append(Integer.toHexString(0xFF & digest[i]));
		    }
		    System.out.println("MD2: " + hexString.toString());
		} catch (NoSuchAlgorithmException e) {
	        System.err.println("Lo siento, parece que ese mensaje no es valido y como tal no lo pude transformar en MD2. Contacta con Netting.");
	 }
	}
		
		public static void sha384() {
			try {
				Scanner sc = new Scanner(System.in);
			    System.out.println("Ingrese un Mensaje para Encriptarlo en SHA384: ");
			    String message = sc.nextLine();
				  
			    MessageDigest md = MessageDigest.getInstance("SHA-384");

			    md.update(message.getBytes());
			
			    byte[] digest = md.digest();
			     
			    StringBuffer hexString = new StringBuffer();
			      
			    for (int i = 0;i<digest.length;i++) {
			       hexString.append(Integer.toHexString(0xFF & digest[i]));
			    }
			    System.out.println("SHA384: " + hexString.toString());
			} catch (NoSuchAlgorithmException e) {
		        System.err.println("Lo siento, parece que ese mensaje no es valido y como tal no lo pude transformar en SHA384. Contacta con Netting.");
		    }
	}
		
		public static void sha512() {
			try {
				Scanner sc = new Scanner(System.in);
			    System.out.println("Ingrese un Mensaje para Encriptarlo en SHA512: ");
			    String message = sc.nextLine();
				  
			    MessageDigest md = MessageDigest.getInstance("SHA-512");

			    md.update(message.getBytes());
			
			    byte[] digest = md.digest();
			     
			    StringBuffer hexString = new StringBuffer();
			      
			    for (int i = 0;i<digest.length;i++) {
			       hexString.append(Integer.toHexString(0xFF & digest[i]));
			    }
			    System.out.println("SHA512: " + hexString.toString());
			} catch (NoSuchAlgorithmException e) {
		        System.err.println("Lo siento, parece que ese mensaje no es valido y como tal no lo pude transformar en SHA512. Contacta con Netting.");
		    }
	}

}
