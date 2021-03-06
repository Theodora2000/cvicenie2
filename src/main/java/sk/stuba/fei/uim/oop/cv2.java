package sk.stuba.fei.uim.oop;

public class cv2 {
    public static void main(String[] args){

        int [][] matr =  new int[3][3];
        for (int i = 0; i< matr.length; i++){
            for (int j = 0; j< matr[i].length; j++){
                matr[i][j]=Zklavesnice.readInt();
            }
        }

        for(int i = 0; i< matr.length; i++){
            for (int j = 0; j< matr[i].length; j++){
                System.out.print(matr[i][j]+ " ");
            }
            System.out.println();
        }
        int x,y,z;
        int vysledok=0;
        x = (matr[1][1] * matr[2][2]) - (matr[2][1] * matr[1][2]);
        y = (matr[1][0] * matr[2][2]) - (matr[2][0] * matr[1][2]);
        z = (matr[1][0] * matr[2][1]) - (matr[2][0] * matr[1][1]);

        vysledok = (matr[0][0] * x)- (matr[0][1] * y) + (matr[0][2] * z);

        System.out.println("Vysledok: " +vysledok);


    }
}



