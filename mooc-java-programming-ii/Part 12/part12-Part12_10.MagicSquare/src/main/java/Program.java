
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare square = new MagicSquare(10);
        square = msFactory.createMagicSquare(9);
        //System.out.println(msFactory.createMagicSquare(5));
        System.out.println(square);
        System.out.println(square.sumsOfDiagonals());
        System.out.println(square.sumsOfColumns());
        System.out.println(square.sumsOfRows());
        System.out.println(square.allNumbersDifferent());
        System.out.println(square.isMagicSquare());
    }
}
