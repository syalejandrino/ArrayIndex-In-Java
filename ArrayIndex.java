
public class Index
{
    public int maxIndexArray(int[] a){
        int b = a[0];
        int index = 0;
        
        for (int i = 0; i<a.length; i++){
            if (a[i] > b) {
                b = a[i];
                index = i;
            }
        } return index;
    } 
    
     public int minIndexArray(int[] a){
        int b = a[0];
        int index = 0;
        
        for (int i = 0; i<a.length; i++){
            if (a[i] < b) {
                b = a[i];
                index = i;
            }
        } return index;
    } 
    
    public boolean isPositive(int[] a){
        for (int i = 0; i<a.length; i++){
            if (a[i] < 0)
                return false;
        }return true;
    }
    
    public void numberOfPositive(int[] a){
        int pos = 0;
        int neg = 0;
        
        for (int i=0; i<a.length; i++){
            if (a[i] > 0)
                pos++;
            else if (a[i] < 0)
                neg++;
        }
        System.out.println("Number of Positive Integers: " + pos);
        System.out.println("Number of Negative Integers: " + neg);
    }
    
    //final int ROWS = 3
    //final int COL = 3;
    //String[][]board = new String[ROWS][COL]
    
    /*final int r = 10;
    final int c = 2;
    String[][] a = new String[r][c];*/
    
    /*final int q = 10;
    final int w = 2;
    String[][] b = new String[q][w];*/
    
    public void arrays(int rows, int col){    
        int[][] a = new int[rows][col];
    
        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                a[i][j] = i+j;
            }
        }
    }
    
    public void arrays2(){
        final int ROWS = 2;
        final int COL = 3;
        int counter = 0;
        
        int[][] a = new int[ROWS][COL];
        
        for (int r=0; r<ROWS; r++){
            for(int c=0; c<COL; c++){
                a[r][c] = counter;
                counter++;
            }
        }
    }
    
    public void sum2D(int[][] a, int ROWS, int COL){
        int sum = 0;
        
        for (int r=0; r<ROWS; r++){
            for (int c=0; c<COL; c++){
                a[r][c] += sum;
            }
        }
    }
}
