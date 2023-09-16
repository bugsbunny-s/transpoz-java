
public class App {
    public static void main(String[] args) {
        // patika.dev java 101 Matris Transpozunu ekrana yazdırma uygulaması. @bilalertugrul
        int[][] matris = {
                {3,6,9},
                {2,4,6},
                {1,3,5},
                {3,5,7}
        };

        System.out.println("Matris : ");
        for(int[] row: matris){
            for(int column: row){
                System.out.print(" " + column + " ");
            }
            System.out.println();
        }

        System.out.println("Transpozunu : ");
        int column = matris[0].length;
        for(int i=0; i < column; i++){
            for(int j=0; j < matris.length; j++){
                System.out.print(" " + matris[j][i] + " ");
            }
            System.out.println();
        }
    }
}