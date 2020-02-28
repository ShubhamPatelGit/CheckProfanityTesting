package com.shu.checkProfanity;

import java.util.ArrayList;
import com.shu.textFileReader.TextFileReader;;

public class CheckProfanity {
	
	public static void main(String[] args) {
		String cm= "C:/comments.txt";	//Path to the comments.txt file
		String pf= "C:/profanity.txt";	//Path to the profanity.txt file
		
		ArrayList <String> comments = null;
		ArrayList <String> profanity = null;
		TextFileReader reader = new TextFileReader();

		try {
			comments = reader.fileReader(cm);	//All comments must be written in a new line.
			profanity = reader.fileReader(pf);	//All profanity must be written in a new line.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		CountProfanity cp = new CountProfanity();
		for(String cmt: comments) {
			int count = cp.count(cmt, profanity);
			System.out.println("Comment -> ("+cmt+ ") have "+count+" Profanity");
		}
	}
}