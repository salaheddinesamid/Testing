package datastructures.maps;

import javax.swing.text.html.parser.TagElement;

public class User {
    String firstName;
    String lastName;
    int age;
    String ID;
    Boolean isSingle;
    public User(String firstName, String lastName, int age, String ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ID = ID;
    }
    public void setData(String id){
        this.ID = id;
    }
}
