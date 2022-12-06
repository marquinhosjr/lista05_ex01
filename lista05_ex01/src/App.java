import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

         Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        sc.close();

        int i, y;

        for (i = 1; i <= n; i++) {
            for(y = 0; y < i; y++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
   
    }   
}
    
