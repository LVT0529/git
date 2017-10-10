package knu.ac.kr.passwordvalidator;

public class PasswordValidator {

    private int minLength;

    public PasswordValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    private int maxLength;

    public boolean validate(String password){

        if(password == null){
            return false;
        }
        int passwordLength = password.length();

        if(passwordLength < minLength) {
            return false;
        }
        else if (passwordLength > maxLength){
            return false;
        }
        else if(password == ""){
            return false;
        }
        else if(password.equals("ADMIN")){
            return true;
        }

        return true;
    }

    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate("abc");
        System.out.println(result);
    }

}
