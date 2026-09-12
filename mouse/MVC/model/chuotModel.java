package mouse.MVC.model;
public class chuotModel{
    private int x,y;
    private int count;
    private String checkIn;  // yes or no;
    public chuotModel(){
        this.x=0;
        this.y=0;
        this.count=0;
        this.checkIn="no";
    }
    

    // Getter và Setter cho x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Getter và Setter cho y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Getter và Setter cho count
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // Getter và Setter cho checkIn
    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    public void click(){
        this.count++;
    }
    public void enter(){
        this.checkIn="yes";
    }
    public void exit(){
        this.checkIn="NO";

    }

}