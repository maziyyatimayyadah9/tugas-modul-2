package matriks;
public class nomor3_perkalian_matriks {
    public static void main(String [] args) {
        int[][] matriksA = { //matriks 2x3
            {4,5,6},
            {7,8,9}
        };
       int[][] matriksB = { //matriks 3x2
           {1,2},
           {3,4},
           {5,6}
       };
       
       if(matriksA[0].length == matriksB.length) {
           int[][] hasilkali = new int [matriksA.length][matriksB[0].length];
           for(int i=0; i<matriksA.length; i++) {
               for(int j=0; j<matriksB[0].length; j++) {
                   for (int k=0; k<matriksA[0].length; k++) {
                      hasilkali[i][j] += matriksA[i][k] * matriksB[k][j];
                   }                                
               }
           }
        for (int[] x:hasilkali) {
            for(int i:x) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maziyyati Mayyadah - 20090095");
        System.out.println("2D DIV TEKNIK INFORMATIKA");

       }
       
       else{
           System.out.println(" kolom matriks A sama dengan baris matriks B ");
       }
    
    }
    
    
}