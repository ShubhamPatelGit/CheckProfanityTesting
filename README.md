# CheckProfanityTesting

This project is developed in the Java programming language and JUnit framework. JDK 8 or above required.

All the packages with classes of previous project 'CheckProfanity' are in source folder 'src/main/java'. The only change in this is the class who has the main method is broken into two parts: 'CountProfanity' class counts the number of profanity in a single comment and 'CheckProfanity' class runs the whole project as previous.

And the testing part of the project is in source folder 'src/test/java'.

How to run:
1. This is an Eclipse IDE project.
2. It can be cloned and imported directly into the Eclipse:
    1. Testing the project:
        1. Open the source folder 'src/test/java'.
        2. Open 'com.shu.CheckProfanityTesting' package.
        3. In class 'TestCheckProfanity', the tester can provide his own comment, profanity, and the number of profanity in the comment in the result variable.
        4. click on the 'TestCheckProfanity' class and select 'Run as', then select 'JUnit Test'.
    2. Running the project:
        1. Give the path of 'comment.txt' and 'profanity.txt' in 'CheckProfanity.java' file. By default, it is "C:/comments.txt" and "C:/profanity.txt".
        2. All comments and profanity must be written in a new line in the text file.
        3. Open the source folder 'src/main/java'. Then, open 'com.shu.CheckProfanityTesting' package.
        3. Click on the 'CheckProfanity' class and select 'Run as', then select the 'Java Application'.
