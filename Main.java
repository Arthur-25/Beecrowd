import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int M = sc.nextInt();
            if (M>0 && M<100) {
                int[][] matriz = new int[M][M];
                for (int linhas = 0; linhas < M; linhas++) {
                    for (int colunas = 0; colunas < M; colunas++) {
                        if (colunas == 0 || colunas == M - 1 || linhas == 0 || linhas == M - 1) {
                            matriz[linhas][colunas] = 1;
                        } else {
                            matriz[linhas][colunas] = 2;
                        }
                    }
                }//fim do for que coloca valores na matriz
                if (M % 2 != 0 && M > 3) matriz[(M / 2)][(M / 2)] = 3;
                for (int linhas = 0; linhas < M; linhas++) {
                    for (int colunas = 0; colunas < M; colunas++) {
                        System.out.printf("%d  ", matriz[linhas][colunas]);
                    }
                    System.out.println();
                }
            }
            if (M == 0) break;
        }//fim do while true
    }
}
