package datastructures.maps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class MAP {
    public static void main(String[] args){

    }
    public void generateData(){
        HashMap<String,User> data = new HashMap<String, User>();
    }
    public void getCiviliansInfo(String ID) throws FileNotFoundException {
        String sep = File.separator;
        String path = "Users" + sep + "mac" + sep + "Desktop" + sep + "Data";
        File dataFile = new File(path);
        if(dataFile.exists()){
            FileReader fr = new FileReader(dataFile);
            BufferedReader bf = new BufferedReader(fr);
            for(String line = bf.readLine();)

        }
    }
}
