package evolution;

public class Agent {
    private Point position;
    private char character;
    private int food;

    public Agent(){
        this('c', new Point());
    }

    public Agent(char character, Point position){
        this.character = character;
        this.position = position;
        this.food = 10;
    }

    public Point getPosition() {
       return position;
    }

    public char getCharacter() {
       return character;
    }

    public void moveRight() {
        position = position.add(Point.Right());
    }

    public void moveLeft() {
        position = position.add(Point.Left());
    }

    public void moveUp() {
        position = position.add(Point.Up());
    }

    public void moveDown() {
        position = position.add(Point.Down());
    }

    public void moveUpRight() {
        position = position.add(Point.UpRight());
    }

    public void moveUpLeft() {
        position = position.add(Point.UpLeft());
    }

    public void moveDownRight() {
        position = position.add(Point.DownRight());
    }

    public void moveDownLeft() {
        position = position.add(Point.DownLeft());
    }

    public void update(World world){
        food--;

        if (food <= 0){
            die(world);
        }

        if(world.isPositionOpen(position.add(Point.Right()))){
            moveRight();
        }
        else {
            moveLeft();
        }
    }

    private void die(World world){
        world.removeAgent(this);
    }
}
