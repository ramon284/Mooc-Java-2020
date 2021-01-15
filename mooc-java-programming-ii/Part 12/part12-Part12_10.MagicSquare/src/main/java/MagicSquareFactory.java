
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int[][] magic = new int[size][size]; 
        int col = size / 2; //starting column
        int row = 0; // starting tow
        int iterator = 0;
        int end = (size)*(size);
        
        while(iterator < end){
            if(magic[row][col] == 0){
                magic[row][col] = iterator +1;
                iterator++;
                row = upRow(row, size);
                col = nextCol(col, size);
            }
            else {
                col = previousCol(col, size);
                row = downRow(row, size);
                row = downRow(row, size);
            }
        }
        square.setSquare(magic);
        return square;
    }
    
    public int downRow(int row, int size){
        row++;
        if(row >= size){
            return 0;
        }
        return row;
    }
    
    public int upRow(int row, int size){
        row--;
        if(row < 0){
            return size-1;
        }
        return row;
    }
    
    public int nextCol(int col, int size){
        col++;
        if(col >= size){
            return 0;
        }
        return col;
    }
    
    public int previousCol(int col, int size){
        col--;
        if(col < 0){
            return size-1;
        }
        return col;
    }
}
