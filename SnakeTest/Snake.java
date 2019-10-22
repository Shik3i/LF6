public class Snake {

    public static void main(String[] args){

    }
}

public class MovingSnake {

}

public class Food {
    private int xPosition;
    private int yPosition;

    public Food(Board board){
        Random random = new Random();
		this.xPosition = random.nextInt(board.getRows()) + 1;
        this.yPosition = random.nextInt(board.getColumns()) + 1;
    }
}

public class Board {
    private int Rows;
    private int Columns;

    public Board(int rows, int columns){
        this.Rows = rows;
        this.Columns = columns;
    }

    public int getRows(){
        return this.Rows;
    }

    public int getColumns(){
        return this.Columns;
    }
}