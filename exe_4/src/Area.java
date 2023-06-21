public class Area {
    private Double radius;
    private Double length;
    private Double width;
    private Double area;

    public double area(Double radius){
        System.out.print("The area of a circle: ");
        return (3.142 * radius * radius);
    }

    public double area(Double length, Double width){
        System.out.print("The area of a rectangle: ");
        return (3.142 * length * width);
    }
}

