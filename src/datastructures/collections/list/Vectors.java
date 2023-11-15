package datastructures.collections.list;

import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args){
        List<String> vec = new Vector<>();
        vec.add("Vec1");
        System.out.println(vec.indexOf("Vec1"));
    }
}
