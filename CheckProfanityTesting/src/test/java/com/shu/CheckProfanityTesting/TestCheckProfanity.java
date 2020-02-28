package com.shu.CheckProfanityTesting;

import java.util.ArrayList;
import com.shu.checkProfanity.CountProfanity;
import junit.framework.TestCase;

public class TestCheckProfanity extends TestCase {
	
	public void test() {
		String comment = "Hello, How are you";
		String[] profanity = {"hello", "are"};
		int result = 2;
		
		ArrayList<String> pf = new ArrayList<String>();
		for(String pfy: profanity) 
			pf.add(pfy);
			
		int output = new CountProfanity().count(comment, pf);
		assertEquals(result, output);
	}

}
