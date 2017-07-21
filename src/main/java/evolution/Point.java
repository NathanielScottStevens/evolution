package evolution;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x(){
        return x;
    }

    public int y(){
        return y;
    }

    public static Point Right(){
        return new Point(1, 0);
    }

    public static Point Left(){
        return new Point(-1, 0);
    }

    public static Point Up(){
        return new Point(0, 1);
    }

    public static Point Down(){
        return new Point(0, -1);
    }

    public static Point UpRight(){
        return new Point(1, 1);
    }

    public static Point UpLeft(){
        return new Point(-1, 1);
    }

    public static Point DownRight(){
        return new Point(1, -1);
    }

    public static Point DownLeft(){
        return new Point(-1, -1);
    }

    public static Point Zero(){
        return new Point(0, 0);
    }

    public Point add(int x, int y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point add(Point point) {
        return new Point(this.x + point.x, this.y + point.y);
    }

    public Point sub(int x, int y) {
        return new Point(this.x - x, this.y - y);
    }

    public Point sub(Point point) {
        return new Point(this.x - point.x, this.y - point.y);
    }

    public Point mult(int scalar) {
        return new Point(this.x * scalar, this.y * scalar);
    }

    public Point div(int scalar) {
        return new Point(this.x / scalar, this.y / scalar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

