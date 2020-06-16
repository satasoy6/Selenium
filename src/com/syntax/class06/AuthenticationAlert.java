package com.syntax.class06;

import com.syntax.utils.drivers;

public class AuthenticationAlert extends drivers{

	public static void main(String[] args) {
		/*actual url="http://abcdatabase.com/basicauth";
		 * username=test
		 * password=test
		 */
		//Some web applications asks for the username and password as soon as you open
			drivers("chrome");
			driver.get("http://test:test@abcdatabase.com/basicauth");
			//When i run it i won't be able to log in.
			//type after // username:password@ that will handle the pop up.
			
	}
}
