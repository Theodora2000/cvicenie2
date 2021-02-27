package sk.stuba.fei.uim.oop;
import java.util.Scanner;

public class cv2 {
    public static void main(String[] args){
        int[] pole = new int[10];
        System.out.println("Zadavajte cisla:");
        for(int i=0;i<pole.length;i++){
            pole[i]= Zklavesnice.readInt();
        }
        //System.out.println("Vypis pola:");
        for (int i=0;i<pole.length-1;i++){
            int zapamti_index = i;
            for (int j=i+1;j<pole.length;j++){
                if(pole[zapamti_index]>pole[j]) {
                    zapamti_index = j;
                }
            }
            if(i != zapamti_index){
                int temp = pole[i];
                pole[i]=pole[zapamti_index];
                pole[zapamti_index]=temp;
            }


        }
        for (int i=0;i<pole.length;i++){
            System.out.println(pole[i]);
        }
    }

    public static void zameni(int []pole, int i , int j){
        int pomoc = pole[i];
        pole[i] = pole[j];
        pole[j] = pomoc;
    }

    public static int particion(int []niz , int an1 ,int an2){
        int i,j;
        j = an1;
        for(i = an1+1;i<=an2;i++){
            if(niz[i] <= niz[an1] ){
                j++;
                zameni(niz , j , i);
            }
        }
        zameni(niz , an1 , j);
        return j;
    }
    public static void quicksort(int []niz , int an1 ,int an2){
        if(an1 >= an2){
            return ;
        }
        if(an1 + 1 == an2){
            if(niz[an1] <  niz[an2]){
                zameni(niz , an1 , an2);
            }
            return;
        }

        int zapamti = particion(niz , an1 , an2);
        quicksort(niz , an1 ,zapamti-1);
        quicksort(niz , zapamti+1 , an2);
    }
    public static void quick(int []niz){
        quicksort(niz , 0 , niz.length - 1);
    }
}

