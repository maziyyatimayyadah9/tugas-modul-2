package matriks;
public class nomor2_pengurangan_matriks {
     public static void main(String[] args){
     int[][] matriks_a = { //matriks 3x2
            {6,7},
            {8,9},
            {10,11}
        };
        int[][] matriks_b = { //matriks 3x2
            {1,2},
            {3,4},
            {5,6}
        };
        int[][] hasilkurang = new int[matriks_a.length][matriks_a[0].length];
        if (matriks_a.length == matriks_b.length && matriks_a[0].length == matriks_b[0].length){
            for (int i=0; i<matriks_a.length; i++){
                for (int j=0; j<matriks_a[0].length; j++){
                hasilkurang[i][j] = matriks_a[i][j] - matriks_b[i][j];
                System.out.print(hasilkurang[i][j]+" ");
                }
            System.out.println();
            }
            System.out.println();
            System.out.println("Maziyyati Mayyadah - 20090095");
            System.out.println("2D DIV TEKNIK INFORMATIKA");

        }
        else{
            System.out.print("Baris dan kolom matriks sama");
                }
    }
}