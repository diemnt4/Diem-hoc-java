package abstractClass;

import java.util.regex.Pattern;

public class PasswordValidator {
	private static Pattern pattern; 
    private static final String PASSWORD_PATTERN = "[^0-9]"; 
    public PasswordValidator() { 
        pattern = Pattern.compile(PASSWORD_PATTERN); 
    } 
    
    public static boolean validate(final String password) { 
        return pattern.matcher(password).matches(); 
    } 
}
