package Common;

/**
 * Created by Thomas Hickman on 04/03/2016.
 */
public class Matrix2 {
    public final int [][] values;

    public Matrix2(int[][] values){
        this.values = values;
    }

    public Matrix2(int[] topRow, int[] bottomRow){
        this(new int[][]{
            topRow,
            bottomRow
        });
    }

    public Matrix2(int a, int b, int c, int d){
        this(new int[][]{
                new int[]{a, b},
                new int[]{c, d}
        });
    }
}
