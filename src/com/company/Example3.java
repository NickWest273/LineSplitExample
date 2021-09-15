package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        var studentNames = new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponse = "";
        while (!userResponse.equals("done")){
            System.out.print("Type in the next student name or 'done to exit:");
            userResponse = reader.nextLine();
            if (userResponse.equals("done")){
                break;
            }
            studentNames.add(userResponse);
        }
        System.out.println("All of your students in the class are below");
        for (var studentName : studentNames){
            System.out.println(studentName);
        }
    }
}
