package datastructures.maps;

import java.io.*;
import java.util.HashMap;

public class Database {
    public HashMap<String,User> dataTable = new HashMap<>();
    public static void main(String[] args) throws IOException {
        Database db = new Database();
        db.generateData();
        System.out.println(db.dataTable.get("T315730").firstName);
    }
    public void addUser(User user) throws IOException {
        this.dataTable.put(user.ID,user);
        String firstname = user.firstName;
        String lastname = user.lastName;
        int age = user.age;
        String id = user.ID;
        String data = firstname+"_"+lastname+"_"+age+"_"+id;
        String sep = File.separator;
        String path = sep + "Users" + sep + "mac" + sep +"Desktop" + sep + "Data";
        File file = new File(path);
        try{
            FileWriter fw = new FileWriter(file);
            fw.write(data+"\n");
            fw.close();
        }catch(Exception ex){

        }
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
