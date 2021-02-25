package sk.stuba.fei.uim.oop;
import java.util.Scanner;

public class cv2 {
    public static void main(String[] args){


            Scanner input = new Scanner(System.in);
            while(1==1){

                System.out.println("Zadajte 1 ak chcete pokracovat alebo 0 ak chcete skoncit:");
                int identifikator=0;
                identifikator=input.nextInt();
                if(identifikator==0){
                    break;
                }
                System.out.println("Zadaj datum a mesiac narodenia:");
                int a,b;
                a=input.nextInt();
                b=input.nextInt();

                System.out.println("Znak: " );
                zisti_znak(a,b);
            }

            }




        static void zisti_znak(int a, int b){
            if(b==1){
                if(a>=1 && a<=20){
                    System.out.println("kozorozec");
                }else{
                    System.out.println("vodnar");
                }
            }else if(b==2){
                if(a>=1 && a<=18){
                    System.out.println("vodnar");
                }else{
                    System.out.println("ryba");
                }
            }
            else if(b==3){
                if(a>=1 && a<=20){
                    System.out.println("ryba");
                }else{
                    System.out.println("baran");
                }
            }
            else if(b==4){
                if(a>=1 && a<=20){
                    System.out.println("baran");
                }else{
                    System.out.println("byk");
                }
            }
            else if(b==5){
                if(a>=1 && a<=21){
                    System.out.println("byk");
                }else{
                    System.out.println("blizenec");
                }
            }
            else if(b==6){
                if(a>=1 && a<=20){
                    System.out.println("blizenec");
                }else{
                    System.out.println("rak");
                }
            }
            else if(b==7){
                if(a>=1 && a<=22){
                    System.out.println("rak");
                }else{
                    System.out.println("lev");
                }
            }
            else if(b==8){
                if(a>=1 && a<=22){
                    System.out.println("lev");
                }else{
                    System.out.println("panna");
                }
            }
            else if(b==9){
                if(a>=1 && a<=22){
                    System.out.println("panna");
                }else{
                    System.out.println("vahy");
                }
            }
            else if(b==10){
                if(a>=1 && a<=23){
                    System.out.println("vahy");
                }else{
                    System.out.println("skorpion");
                }
            }
            else if(b==11){
                if(a>=1 && a<=21){
                    System.out.println("skorpion");
                }else{
                    System.out.println("strelec");
                }
            }
            else if(b==12){
                if(a>=1 && a<=21){
                    System.out.println("strelec");
                }else{
                    System.out.println("kozorozec");
                }
            }

        }



}
