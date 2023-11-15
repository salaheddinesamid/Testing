package datastructures;

public class Strings {
    public static void main(String[] args){
        char[] c = {'H','e','l','l','o'};
        Strings s = new Strings();
        s.charactersToString(c);
        s.stringToInteger("333");
    }
    //Transforming array of characters into String
    public void charactersToString(char[] ch){
        String string = new String(ch);
        System.out.println(string);
    }
    // Transformation of String into primitive data type
    public void  stringToInteger(String s){
        int integer = Integer.parseInt(s);
        System.out.println(integer + 1);
    }
}
