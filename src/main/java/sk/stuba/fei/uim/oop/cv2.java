package sk.stuba.fei.uim.oop;
import java.util.Scanner;

public class cv2 {
    public static void main(String[] args){
        int[] pole = new int[10];
        System.out.println("Zadavajte cisla:");
        for(int i=0;i<pole.length;i++){
            pole[i]= Zklavesnice.readInt();
        }
        System.out.println("Vypis pola:");
        for (int i=0;i<pole.length;i++){
            System.out.println(pole[i]);
        }
            }
}
