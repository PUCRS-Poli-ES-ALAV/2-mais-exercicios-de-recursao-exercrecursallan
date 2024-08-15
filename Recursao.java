import java.util.List;

public class Recursao {
    public static void main(String[] args) {
        
    }

    /* 
     * Fatorial de 0 é assumido como 1.
     */
    public static int fat(int n) throws Exception {
        if (n < 0) 
            throw new Exception();
        if (n <= 1) 
            return 1;
        return n * fat(n-1);
    }

    /*
     * A soma é assumida de 0 até n, nessa ordem. Números negativos não são assumidos então a soma de -8 a 0 não produz resultado, por exemplo. 
     */
    public static int soma(int n) throws Exception {
        if (n == 0) 
            return 0;
        if (n < 0)
            throw new Exception();
        return n + soma(n-1);
    } 

    /*
     * O fibonacci na 0-ésima posição não faz sentido. Apenas n>=1 é aceito.
     */
    public static int fib(int n) throws Exception {
        if (n <= 0)
            throw new Exception();
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return fib(n-1) + fib(n-2);
    }

    /*
     * Apenas a soma de K a J é aceita. J deve ser maior que K. Adotamos uma solução não inclusiva, então na soma entre 3 e 3, o resultado é 0.
     * A soma é feita incrementalmente, até que J diminua a ponto de se igualar a K.
     */
    public static int soma2(int k, int j) throws Exception{
        if (k < 0 | j < 0 | j < k)
            throw new Exception();
        if (j == k) 
            return 0;
        return 1 + soma2(k, j-1);
    }

    /*
     * compara ultimo e primeiro caractere, se sao iguais, compara o segundo com o penultimo, assim por diante.
     */
    public static boolean isPal(String s) {
        int l = s.length();
    
        if (l == 0 || l == 1) 
            return true;
        if (s.charAt(0) != s.charAt(l - 1)) 
            return false;
    
        return isPal(s.substring(1, l - 1));
    }

    /*
     * na recursao, vai dividindo sucessivamente por 2 ate chegar em 0 ou 1. Concatena o resto da divisao com o retorno da funcao.
     */
    public static String convBase2(int n) {
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        return convBase2(n / 2) + (n % 2);
    }

    /*
     * O primeiro item da lista é somado, cada nova iteracao é considerada uma lista com todos exceto o primeiro item.
     */
    public static int soma3(List<Integer> a) {
        if (a.size() == 1) 
            return a.get(0);

        return a.get(0) + soma3(a.subList(1, a.size()));
    }


    /*
     * Parecido com um quicksort. Compara cada metade e vai pegando o maior entre elas.
     */
    public static int findBiggest(List<Integer> a) {
        return findBiggest(a, 0, a.size() - 1);
    }

    private static int findBiggest(List<Integer> a, int start, int end) {
        if (start == end) 
            return a.get(start);
        
        int mid = (start + end) / 2;

        int leftMax = findBiggest(a, start, mid);
        int rightMax = findBiggest(a, mid + 1, end);

        if (leftMax > rightMax) 
            return leftMax;
       
        return rightMax;
    }
    

    /*
     * Verifica se str contém match. String vazia esta contida em qualquer outra.
     */
    public static boolean findSubStr(String str, String match) {
        if (str.length() < match.length()) 
            return false;
        if (match.equals("")) 
            return true;
        if (str.startsWith(match))
            return true;

        return findSubStr(str.substring(1), match);
    }

    /*
     * menores que 10^1: 1
     * entre 10^1 e 10^2: 2
     * entre 10^2 e 10^3: 3
     * entre 10^(n-1) e 10^n: n
     * A missao fica em encontrar a potencia de 10 mais proxima (por cima) q o numero em questao, para encontrar n.
     * para 10^n, dividir por 10 n vezes reduz o numero a um outro de apenas 1 algarismo
     */
    public static int nroDigit(int n){
        n = Math.abs(n);  

        if (n < 10) 
            return 1;
    
        return 1 + nroDigit(n/10);
    }



    // public static ArrayList<String> permutations(String s) {
        
    // }

    
}