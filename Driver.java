 	 	package org.greatlearning.model;
 	 	import java.util.*;

public class Driver {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee("Mayank","Goel");
		CredentialService credentialService=new CredentialService();
		
		int ch;
		do
		{
			System.out.println("Please select the department of the Employee from below");
			System.out.println("1. Technical");
			System.out.println("2. Administration");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			ch=sc.nextInt();
			
			String email;
			char[] password;
			switch(ch) {
			case 1:
				String email1=credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"tech");
				char[] password1=credentialService.generatePassword();
				credentialService.showCredentials(e,email1,password1);
				break;
			case 2:
				String email2=credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"admin");
				char[] password2=credentialService.generatePassword();
				credentialService.showCredentials(e,email2,password2);
				break;
			case 3:
					String email3=credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"hr");
					char[] password3=credentialService.generatePassword();
					credentialService.showCredentials(e,email3,password3);
					break;
			case 4:
						String email4=credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"legal");
						char[] password4=credentialService.generatePassword();
						credentialService.showCredentials(e,email4,password4);
						break;
				default:
					break;
			
			}
		}while(ch<=4);		
	}
	}

	
	


