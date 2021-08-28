package com.login.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.login.exception.InvaildException;
import com.login.model.Login;
import com.login.service.LoginServiceImpl;
import com.login.service.LoginServiceIntf;

public class LoginClass {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter userId:");
		// int uId = scanner.nextInt();
		//
		// System.out.println("Enter userPassword:");
		// String pswd = scanner.nextLine();
		Login login1 = new Login(51358293, "rohinilakshmi", "grs1234");
		Login login2 = new Login(51358256, "ram", "gt12356");
		Set<Login> loginObj = new HashSet<Login>();
		loginObj.add(login1);
		loginObj.add(login2);
		LoginServiceIntf loginServiceIntf = new LoginServiceImpl();
		// Login login = new Login();
		// login.setUserId(uId);
		// login.setPassword(pswd);
		try {
			Login logins = loginServiceIntf.validateUser(loginObj);
			System.out.println("Welcome "+logins.getUserName());
		} catch (InvaildException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
