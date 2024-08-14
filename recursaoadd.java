import java.util.ArrayList;

public class recursaoadd {
    public static void main(String[] args) {
        
    boolean res = isPal("tenet");
    System.out.println(res);

    res = isPal("ee");
    System.out.println(res);


    System.out.println("Resultado convBase2: " + convBase2(25));

    ArrayList<Integer> array = new ArrayList<>();
    array.add(10);
    array.add(1);
    array.add(1);
    array.add(100);
    array.add(170);
    System.out.println(array);
    //System.out.println("Resultado de somaArray: " + somaArray(array));
    System.out.println("Resultado de findBiggest: " + findBiggest(array));

    System.out.println("Resultado de findSubStr: " + findSubStr("array","aaarraylist"));
    System.out.println("Resultado de nrmDigit: " + nroDigit(0));


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
   // Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.
    public static int somaArray(ArrayList<Integer> array){
        if(array.size() > 1){
            int a = array.get(0);
            int b = array.get(1);
            array.remove(0);
            array.remove(0);
            array.add(0, a + b);
            return somaArray(array);
        }
        else {
            return array.get(0);
        }
    }
    // Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
    public static int findBiggest(ArrayList<Integer> ar) {
        if(ar.size() > 1){
            if(ar.get(0) >= ar.get(1)){
                ar.remove(1);
            }
            else{
                ar.remove(0);
            }
            return findBiggest(ar);
        }
        else{
            return ar.get(0);
        }
    }

    // Implemente um método recursivo para determinar se um string ocorre dentro de outro.
    public static boolean findSubStr(String str, String match){
        //System.out.println("str: " + str + ". match: " + match);
        if (str.length()< match.length()){
            if(str.equals(match.substring(0, str.length()))){
                return true;
            }
            return findSubStr(str, match.substring(1,match.length()-1));
        }
        return false;
    }
    //Faça um método recursivo que determina o número de dígitos de um inteiro.
    public static int nroDigit(int n){
        if(n < 10){
            return 1;
        }
        else {
            return 1 + nroDigit(n/10);
        }
    }

    // Implemente um métodos que recebe um String e retorna um ArrayList com todas as permutações deste String.
    public static ArrayList<String> permutations(String s){
        
        return new ArrayList<>();
    }
}