package sk.stuba.fei.uim.oop;
import java.util.Arrays;


public class cv2 {
    public static void main(String[] args){

            int [][] pole =  new int[3][3];
            for (int i=0;i<pole.length;i++){
                //pole[i]=new int [i+1];
                for (int j=0;j<pole[i].length;j++){
                    pole[i][j]=Zklavesnice.readInt();
                }
            }

            for(int i=0;i<pole.length;i++){
                for (int j=0;j<pole[i].length;j++){
                    System.out.print(pole[i][j]+ " ");
                }
                System.out.println();
            }
    }
}



