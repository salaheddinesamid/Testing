package datastructures;

public class Arrays {
    public static void main(String[] args){
        //Single DimensionalArray
        int[] singleArr = new int[3];
        //singleArr[0] = 1;
        singleArr[1] = 2;
        singleArr[2] = 3;
        singleArr[0] = 999;
        System.out.println(singleArr[0]);
        //Multi DimensionalArray
        int[][] multiArr = {
                {2,4,6},
                {1,3,5}
        };
        //Add each element that have the same index
        for(int i = 0; i < multiArr.length;i++){
            for(int j = 0; i < multiArr[i].length; i++){

            }
        }

    }
}
