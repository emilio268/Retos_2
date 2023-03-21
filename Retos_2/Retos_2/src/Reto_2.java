import java.util.Scanner;

public class Reto_2 {

    public static void main(String[] args) {

        String palabra, letra;
        int i, j=1, perdidas =0;

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Mi pana el George");
        System.out.println(" 0   \0\n/|\\\n /\\");

        System.out.println("Favor ingrese una palabra: "); palabra = Entrada.next();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        String[] letras = new String[palabra.length()];

        
        System.out.print("La palabra es: ");

                for (i = 0; i < palabra.length(); i++){

                    System.out.print("_");

                }

                System.out.println("\n");

            char[] separacion = palabra.toCharArray();

            int oportunidades= 7;
	
        for (j = 0; j < 7; j++){


            System.out.println("Tiene: "+oportunidades+" Oportunidades para adivinar la palabra");
            
            System.out.println("Ingrese una letra o palabra: \n"); letra = Entrada.next();

            if(String.valueOf(separacion[j]).equals(letra)){

                System.out.println("Adivino una letra :)");
            
             }else if (letra.equals(palabra)){

                System.out.println("Felicidades adivino la palabra :)");
                break;
            
            }else{

                oportunidades--;

                perdidas++;

                    switch(perdidas){
    
                        case 1:
    
                    System.out.println("Colgo al pana george :(");
                    System.out.println("|\n|\n|\n|___ \n |0_| \0\n/ | \\\n / \\");
    
                        break;

                    case 2:
    
                    System.out.println("le quito una pierna al pana George :(");
                    System.out.println("|\n|\n|\n|___ \n |0_| \0\n/ | \\\n /");

                    break;

                    case 3:
    
                    System.out.println("le quito la otra pierna al pana George :(");
                    System.out.println("|\n|\n|\n|___ \n |0_| \0\n/ | \\\n ");

                    break;

                    case 4:
    
                    System.out.println("le quito un brazo al pana George :(");
                    System.out.println("|\n|\n|\n|___ \n |0_| \0\n/ | \n ");

                    break;

                    case 5:
    
                    System.out.println("le quito el otro brazo al pana George :(");
                    System.out.println("|\n|\n|\n|___ \n |0_| \0\n | \n ");

                    break;

                    case 6:
    
                    System.out.println("le quito el torso al pana George :(");
                    System.out.println("|\n|\n|\n|___ \n |0_| \0\n \n ");

                    break;

                    case 7:
    
                    System.out.println("Ya mato al pana George :(");
                    System.out.println("|\n|\n|\n|___ \n |_| \0\n \n ");
                    System.out.println("Asesino :()");

                    break;

                        default:

                        break;

                        

        }

        
    }

                }

            

        }

    }
    
    
