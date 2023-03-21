import java.util.Scanner;

public class Reto_3 {

    public static void main(String[] args) {
        
        String[][] nombre = new String[4][4];
        String[][] precio = new String[4][4];


        Scanner Entrada = new Scanner(System.in);


        System.out.println("Favor ingresar el precio y nombre del producto");


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Nombre: ");
                nombre[i][j] = Entrada.next(); 
            }
        }

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Precio: ");
                precio[i][j] = Entrada.next(); 
            }
        }
        
        System.out.println(" ");

        for (int i = 0; i < 4; i++) {
                System.out.print("|");
            for (int j = 0; j < 4; j++) {
               System.out.print("| "+nombre[i][j]+" "+precio[i][j]+"|");
            }

            System.out.println("|");

        }
Entrada.close();
}

    }
    

