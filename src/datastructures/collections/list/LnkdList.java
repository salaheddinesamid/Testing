package datastructures.collections.list;
import java.util.LinkedList;
import java.util.List;

public class LnkdList {
    public static void main(String[] args){
        List<String> lnk = new LinkedList<>();
        lnk.add("JavaScript");
        if(lnk.remove("JavaScript")){
            System.out.println("Element Removed");
        }
        lnk.add("C#");
        System.out.println(lnk.get(0));
    }
}
