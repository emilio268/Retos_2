public class Reto_4 {

    public static void main(String[] args) {
        
        String matriz[][] = new String[5][4];		
        matriz[0][0] = " % |";
        matriz[0][1] = " CE|";
        matriz[0][2] = " C |";
        matriz[0][3] = "<xl ";
        matriz[1][0] = " 7 |";
        matriz[1][1] = " 8 |";
        matriz[1][2] = " 9 |";
        matriz[1][3] = " X  ";
        matriz[2][0] = " 4 |";
        matriz[2][1] = " 5 |";
        matriz[2][2] = " 6 |";
        matriz[2][3] = " -  ";
        matriz[3][0] = " 1 |";
        matriz[3][1] = " 2 |";
        matriz[3][2] = " 3 |";
        matriz[3][3] = " +  ";
        matriz[4][0] = "+/-|";
        matriz[4][1] = " 0 |";
        matriz[4][2] = " , |";
        matriz[4][3] = " =  ";

        System.out.println(" ________________");
        System.out.print("|");
        System.out.print("________________");
        System.out.println("|");

        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
            }
            System.out.println("|");
            
          }
          System.out.print("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

          
    
}
 }
