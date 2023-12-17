package datastructures.maps;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.*;

public class MAP {
    public static void main(String[] args) throws IOException {
        MAP mp = new MAP();
        Scanner sc = new Scanner(System.in);
        //String userInput = sc.nextLine();
        //System.out.println("Please Enter your ID: ");
        //String id = sc.nextLine();
        //mp.getCiviliansInfo(id);
       // userInput = sc.nextLine();
        //mp.listAllUsers();
        mp.addCivilians();
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
    public void addCivilians() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter an ID");
        String ID = sc.nextLine();
        User user = new User(firstName,lastName,age,ID);
        Database db = new Database();
        db.addUser(user);
    }
    public void listAllUsers() throws IOException {
        Database db = new Database();
        db.generateData();
        HashMap<String,User> d = db.dataTable;
        for(Map.Entry<String,User> m : d.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue().firstName);
        }
    }
}
