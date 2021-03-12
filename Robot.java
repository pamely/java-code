import java.lang.Math;

public class Robot{
    private String name;
    private Point location;

    Robot(String name, Point location){
        this.name = name;
        this.location = location;
    }

    // Accesseurs

    public String getName(){
        return this.name;
    }

    public Point getLocation(){
        return this.location;
    }

    // Mutateurs

    public void setName(String name){
        this.name = name;
    }

    public void setLocation(int x, int y){
        this.location.setX(x);  
        this.location.setY(y);  
    }

    public void display(){
        System.out.println("Robot: " + this.name);
        System.out.println("Location: " + this.location);
    }

    public void moveTo(int x, int y){
        this.location.setX(this.getLocation().getX() + x);
        this.location.setY(this.getLocation().getY() + y);

    }

    public double distance(Robot robot){
        int diff_x = this.getLocation().getX() - robot.getLocation().getX();
        int diff_y = this.getLocation().getY() - robot.getLocation().getY();
        return Math.sqrt(Math.pow(diff_x, 2) + Math.pow(diff_y, 2));
    }

    public static void main(String[] args){

        // Robot1
        Point location = new Point(0, 0);
        Point location2 = new Point(3, 4);
        Robot robot1 = new Robot("robot1", location);
        Robot robot2 = new Robot("robot2", location2);
        robot1.display();
        robot1.moveTo(1, 2);
        System.out.println("Distance entre les deux robots :" + robot1.distance(robot2));
    }
}