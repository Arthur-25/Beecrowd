import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        while((n = sc.nextInt()) != 0){
            int[][] M = new int[n][n];
            for (int linhas = 0;linhas<n;linhas++){
                for (int colunas = 0;colunas<n;colunas++){


                    if (colunas==0 && linhas>0) M[linhas][0] = linhas + 1;
                    if (linhas == 0 && colunas>0) M[0][colunas] = colunas + 1;
                    if (linhas>0 && colunas>0) M[linhas][colunas] = M[linhas-1][colunas-1];
                    if (linhas == 0 && colunas == 0) M[linhas][colunas] = 1;


                }
            }//fim do for botando valor na matriz
            for (int linhas = 0;linhas<n;linhas++) {
                for (int colunas = 0; colunas < n; colunas++) {
                    System.out.printf("%d ", M[linhas][colunas]);
                }
                System.out.println();
            }
        }// fim do while
    }
}
