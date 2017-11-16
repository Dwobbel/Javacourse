package exercises.chapter7;

/**
 * Created by KristofB on 15/11/2017.
 */
public class Ex3_2dArrays {
    public static void main(String[] args) {
        int [][] table = new int [4][6];
        for(int i=0; i < table.length; i++) {
            for (int j=0; j<table[i].length; j++){
                table[i][j]=i*j;
            }
        }
        for(int[] row: table){
            for(int column: row){
                System.out.print(column +"\t");
            }
            System.out.println();
        }
    }
}
