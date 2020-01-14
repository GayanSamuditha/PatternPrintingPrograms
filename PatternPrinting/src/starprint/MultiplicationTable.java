package starprint;

/**
 * @author Gayan Samuditha
 */

public class MultiplicationTable {
    public static void main(String[] args) {

            System.out.print("\n");
            for(int i=1; i<=9; i++){
                for(int j=1; j<=9; j++){

                    System.out.print( i*j + "\t");

                }

                System.out.println();
            }
        }


}
