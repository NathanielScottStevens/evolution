package evolution;

import asciiPanel.AsciiPanel;

import java.util.LinkedList;

public class World {
    private Board board;
    private int width;
    private int height;
    private LinkedList<Agent> agents;
    private LinkedList<Agent> agentsToBeRemoved;

    public World(){
        this(24, 24);
    }

    public World(int width, int height){
        this.width = width;
        this.height = height;

        agents = new LinkedList<Agent>();
        agentsToBeRemoved = new LinkedList<Agent>();
        board = new Board(width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Board getBoard() {
        return board;
    }

    public char getChar(Point point) {
        return board.getChar(point);
    }

    public void update(){
        for(int i = 0; i < board.width; i++){
            for (int j = 0; j < board.height; j++){
                board.setChar(i, j, '.');
            }
        }
        for(Agent agent : agents){
            agent.update(this);
            board.setChar(agent.getPosition(), agent.getCharacter());
        }

        clearRemovedAgents();
    }

    public void draw(AsciiPanel terminal) {
        for(int i = 0; i < board.width; i++){
            for (int j = 0; j < board.height; j++){
                terminal.write(board.getChar(i, j), i, j);
            }
        }
    }

    public boolean isPositionOpen(Point point){
       if(point.x() <= 0 || point.x() >= this.width){
           return false;
       } else if (point.y() <= 0 || point.y() >= this.height) {
           return false;
       } else {
           return true;
       }
    }

    public void addAgent(Agent agent){
        agents.add(agent);
    }

    public void removeAgent(Agent agent){
        agentsToBeRemoved.add(agent);
    }

    private void clearRemovedAgents(){
        while(agentsToBeRemoved.isEmpty() == false){
            agents.remove(agentsToBeRemoved.remove());
        }
    }
}
