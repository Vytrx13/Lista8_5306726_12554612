package ex1;

public class Controller {
    // calcula o fatorial de n, retorna -1 se n < 0
	// copiado do exercicio da lista 1 q fiz
    public static long factorial(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }
}
