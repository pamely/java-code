public class Point{
    private int x;
    private int y;

    Point(){}

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    // Accesseurs
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }

    // Mutateurs
    void setX(int x){
        this.x = x;
    }

    void setY(int y){
        this.y=y;
    }
    public String toString(){
        return  "("+ x + "," + y + ")";
    }
}