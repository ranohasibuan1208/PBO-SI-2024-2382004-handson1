public class TipeDataArray {
    public static void main(String[] args) {
        //Array adalah kumpulan dari sebuah dengan tipe data yang saama
        //Array one dimension
        int[] kumpulanAngka = new int[3];
        kumpulanAngka[0] = 10;
        kumpulanAngka[1] = 40;
        kumpulanAngka[2] = 50;
        System.out.println(kumpulanAngka[2]);

        //Array multi-dimension
        int[][] kumpulanAngkaMultiDimension = new int [3][3];
        kumpulanAngkaMultiDimension[0] = kumpulanAngka;
        System.out.println(kumpulanAngkaMultiDimension [0][2]);

    }
}