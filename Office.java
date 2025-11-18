package amstechconstructionbasic;

public class Office {
    private double length;
    private double breadth;
    public Office(double length, double breadth){
        this.breadth = breadth;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    
    public double getOfficeArea(){
        return length* breadth;
    }
    
}
