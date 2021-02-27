package sk.stuba.fei.uim.oop;
import java.util.Scanner;

public class cv2 {
    public static void main(String[] args){
        int[] pole = new int[5];
        System.out.println("Zadavajte cisla:");
        for(int i=0;i<pole.length;i++){
            pole[i]= Zklavesnice.readInt();
        }

        boolean imalijos ;
        int smanji= 1;
        do{
            imalijos = false;
            for(int i=0;i<(pole.length-smanji);i++){
                if(pole[i]>pole[i+1]){
                    int temp = pole[i];
                    pole[i]=pole[i+1];
                    pole[i+1]=temp;
                    imalijos = true;
                }
            }
            smanji++;
        }while(imalijos);


        for (int i=0;i<pole.length;i++){
            System.out.println(pole[i]);
        }

            }
}
