package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTesting {

	
	 // Test case for First name, Last name, Email, Mobile number and Password.
	
	    @Test
	    public void givenFirstName_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.firstNameValidate("Maya");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.firstNameValidate("maya");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenLastName_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.lastNameValidate("Chandre");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenLastName_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.lastNameValidate("chandre");
	        Assert.assertFalse(result);
	    }


	    @Test
	    public void givenEmail_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenEmail_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPhone_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.phoneNumberValidate("91 8345662155");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPhone_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.phoneNumberValidate("919892132583");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPassword_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.passwordValidate("tdudAd21$");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPassword_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.passwordValidate("Jhjsh23#%");
	        Assert.assertFalse(result);
	    }

	}

