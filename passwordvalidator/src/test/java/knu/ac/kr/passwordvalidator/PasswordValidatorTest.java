package knu.ac.kr.passwordvalidator;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void 미니멈랭쓰가_지정된값보타크면_테스트_성공(){
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }

    @Test
    public void 맥스랭쓰가_지정값보다_작으면_테스트_성공(){
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }

    @Test
    public void 맥스랭스가_지정값보다크면_테스트_실패(){
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void password가_null이면_테스트_실패(){
        String testPassword = null;
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void password가_emptyString이면_테스트_실패(){
        String testPassword = "";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void password가_ADMIN이면_테스트_실패(){
        String testPassword = "ADMIN";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }
}

