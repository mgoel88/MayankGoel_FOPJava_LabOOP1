package org.greatlearning.model;

import 	java.util.Random;

public class CredentialService {
	public String generateEmailAddress(String firstName,String lastName,String department)
	{
	return firstName+lastName+"@"+department+".javalearning.com";
	}
	public char[] generatePassword()
	{
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*()_+=";
		String values=capitalLetters+smallLetters+numbers+specialCharacters;
		Random random=new Random();
		char[] password=new char[8];
		for(int i=0;i<8;i++)
		{
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	public void showCredentials(Employee e,String email,char[] generatedPassword)
	{
		System.out.println("Dear "+e.getFirstName()+" please note the credentials below");
		System.out.println("Email address is -->"+email);
		System.out.println("Password is-->"+generatedPassword);
	}
}
