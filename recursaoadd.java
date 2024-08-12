public class recursaoadd {
    public static void main(String[] args) {
        
    boolean res = isPal("tenet");
    System.out.println(res);

    res = isPal("ee");
    System.out.println(res);


    System.out.println("Resultado convBase2: " + convBase2(25));

    }


    //Modelagem: compara a primeira letra com a ultima, se forem iguais pega a substring interna e chama recursivamente.
    // se a palavra for menor que 2, retorna true

    public static boolean isPal(String palavra) {
        if(palavra.length() < 2){
            return true;
        }
        else if(palavra.charAt(0) != palavra.charAt(palavra.length()-1)){
            return false;
        }
        else{
            return isPal(palavra.substring(1,palavra.length()-1));
        }
	}

    // Modelagem: divide por 2 até não conseguir mais, pegando o resto de cada
    // 13/2 = 6, resta 1
    // 6/2 = 3, resta 0
    // 3/2 = 1, resta 1
    // 1/2 = 1
    public static String convBase2(int n){
        if (n <= 1){
            return "" + n;
        }
        else {
            return "" + convBase2(n/2) + (n % 2);
        }
    } 

    
}