@Test
void nullPasswordShouldBeInvalid() {
    assertFalse(PasswordValidator.isValid());
}
 
 
@Test
void shortPasswordShouldBeInvalid() {
    assertFalse(PasswordValidator.isValid("abc"));

}
 
 
@Test
void passwordWithoutNumbersShouldBeInvalid() {
    assertFalse(PasswordValidator.isValid("Contrassenya"));

}
 
 
@Test
void validPasswordShouldReturnTrue() {
    assertTrue(PasswordValidator.isValid("Passw0rd"));
} 