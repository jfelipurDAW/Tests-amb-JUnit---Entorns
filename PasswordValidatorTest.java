package junit_test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

	@Test
	void nullPasswordShouldBeInvalid() {
		PasswordValidator pv = new PasswordValidator();
		assertFalse(pv.isValid(null));
	}

	@Test
	void shortPasswordShouldBeInvalid() {
		PasswordValidator pv = new PasswordValidator();
		assertFalse(pv.isValid("abc"));

	}

	@Test
	void passwordWithoutNumbersShouldBeInvalid() {
		PasswordValidator pv = new PasswordValidator();
		assertFalse(pv.isValid("Contrassenya"));

	}

	@Test
	void validPasswordShouldReturnTrue() {
		PasswordValidator pv = new PasswordValidator();
		assertTrue(pv.isValid("Passw0rd"));
	}
}
