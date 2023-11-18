package datastructures.maps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Database {
    public HashMap<String,User> dataTable = new HashMap<>();
    public static void main(String[] args) throws IOException {
        Database db = new Database();
        db.generateData();
        System.out.println(db.dataTable.get("T315730").firstName);
    }
    public void generateData() throws IOException {
        //HashMap<String,User> userdata = new HashMap<>();
        String sep = File.separator;
        String path = sep + "Users" + sep + "mac" + sep + "Desktop" + sep + "Data";
        File dataFile = new File(path);
        if(dataFile.exists()){
            //System.out.println("File exists");
            FileReader fr = new FileReader(dataFile);
            BufferedReader bf = new BufferedReader(fr);
            for(String line = bf.readLine(); line!=null; line = bf.readLine()){
                String[] data = line.split("_");
                String firstName = data[0];
                String lastName = data[1];
                int age = Integer.parseInt(data[2]);
                String id = data[3];
                User user = new User(firstName,lastName,age,id);
                this.dataTable.put(user.ID, user);
            }

        }else{
            System.out.println("File does not exist");
        }
    }
}
