public class Quad {
    public Quad(int aValue, int bValue, int cValue){
        a = aValue;
        b = bValue;
        c = cValue;
        root = Math.sqrt((b * b) - 4 * a * c);
    }
    public double getSolution1(){
        return (-b + root ) / (2 * a);
    }
    public double getSolution2(){
        return (-b - root ) / (2 * a);
    }
    private double a;
    private double b;
    private double c;
    private double root;
    
}
