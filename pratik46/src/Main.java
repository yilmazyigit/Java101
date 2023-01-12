import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int s,i,j;
        System.out.println("Oluşturulacak satır ve sutun sayısını gir");
        s = oku.nextInt();
        int[][] matris = new int[s][s];
        int[][] transpoz = new int[s][s];
        for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) {
                System.out.println((i + 1) + "x" + (j + 1) + "sayıyı gir");
                matris[i][j] = oku.nextInt();
                transpoz[i][j] = matris[i][j];
            }
        }
        for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) {
                System.out.print(transpoz[j][i] + "\t");
            }
            System.out.println("");
        }
        System.out.println("asimmisirli06.blogspot.com");
    }
}



/*
2 3 4
5 6 4

2 5
3 6
4 4





 */