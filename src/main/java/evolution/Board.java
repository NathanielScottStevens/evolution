package evolution;

public class Board {

    char[][] chars;
    int width;
    int height;

    public char[][] getChars() {
        return chars;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char getChar(int x, int y){
        return chars[y][x];
    }

    public void setChar(int x, int y, char c){
        chars[y][x] = c;
    }

    public char getChar(Point point) {
        return chars[point.y()][point.x()];
    }

    public void setChar(Point point, char c) {
        chars[point.y()][point.x()] = c;
    }

    public Board(int width, int height){
        this.width = width;
        this.height = height;
        chars = new char[width][height];

        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++) {
                chars[y][x] = '.';
            }
        }
    }
}
