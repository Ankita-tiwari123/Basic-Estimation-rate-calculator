package amstechconstructionbasic;

public class Plot {
    private double length;
    private double breadth;
    public Plot(double length, double breadth){
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
    
    public double getPlotArea(){
        return length* breadth;
    }
    
}
