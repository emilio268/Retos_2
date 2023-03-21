import java.util.Scanner;

public class Reto_1 {

    public static void main(String[] args) {
        
            String palabra, palarbaas;

            Scanner Entrada = new Scanner(System.in);

            System.out.println("Ingrese una palabra "); palarbaas = Entrada.next();

            StringBuilder reverso = new StringBuilder(palarbaas);

            palabra = reverso.reverse().toString().toLowerCase();

            System.out.println(palarbaas);


            if(palarbaas.equals(palabra)){
                System.out.println("Su palabra es palindroma");
            }else{
                System.out.println("Su palabra no es palindroma");
            }



}

    }
    


