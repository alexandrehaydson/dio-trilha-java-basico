import java.util.Scanner;

public class PrimeirasLinhasDeCodigo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n = sc.nextInt();
        // Limpa a saída do terminal utilizando caracteres de escape ANSI
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        
        System.out.println(n<1 ? "Número igual ou menor que zero" : n);
        //System.out.println(n);
        while (n > 0) {
            n = n - 2;
            System.out.println(n);
        } 
    }
}
