package junit_test;

public class PasswordValidator {
 
    public boolean isValid(String password) {
        if (password == null) {
          return false;
        }
 
        if (password.length() < 8) {
          return false;
        }    
                            
        if (!password.matches(".*[0-9].*")) { 
          return false;
        }
                          
        return true;
    }
}
