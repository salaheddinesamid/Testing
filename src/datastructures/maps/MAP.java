package datastructures.maps;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MAP {

    public static void main(String[] args) throws IOException {
        MAP mp = new MAP();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Hello to Continue or Exit to end the program");
        String userInput = sc.nextLine();
        while(userInput != null){
        System.out.println("Please Enter your ID: ");
        String id = sc.nextLine();
        mp.getCiviliansInfo(id);
        userInput = sc.nextLine();
        }

    }
    public void getCiviliansInfo(String id) throws IOException {
        Database db = new Database();
        db.generateData();
        HashMap<String,User> d = db.dataTable;
        if(d.get(id)!=null){
            System.out.println("First Name: " + d.get(id).firstName);
            System.out.println("Last Name: " + d.get(id).lastName);
            System.out.println("Age:" + d.get(id).age);
        }else{
            System.out.println("Sorry there is no user registered by this ID");
        }
    }
}
