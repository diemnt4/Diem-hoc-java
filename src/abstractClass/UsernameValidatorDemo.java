package abstractClass;

public class UsernameValidatorDemo {

	public static void main(String[] args) {
		 UsernameValidator validator = new UsernameValidator(); 
	        //true
	        System.out.println(validator.validate("Absherzad")); 
	        System.out.println(validator.validate("ab.sherzad")); 
	        System.out.println(validator.validate("ab-sherzad")); 
	        System.out.println(validator.validate("ab_sherzad")); 
	        System.out.println(validator.validate("oxus20")); 
	        System.out.println(validator.validate("ars"));  
	        //false
	        System.out.println(validator.validate("Absherzad")); 
	        System.out.println(validator.validate("ab sherzad")); 
	        System.out.println(validator.validate("ab"));  
	        System.out.println(validator.validate("abdulrahmansherzad")); 

	}

}
