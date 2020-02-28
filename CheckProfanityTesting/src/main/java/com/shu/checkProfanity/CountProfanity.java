package com.shu.checkProfanity;

import java.util.ArrayList;

public class CountProfanity {
	
	public int count(String comment, ArrayList<String> profanity) {
		int temp = 0;
		for(String pfy: profanity) {
			if((comment.toLowerCase()).contains(pfy.toLowerCase()))
				temp++;
		}		
		return temp;
	}
}
