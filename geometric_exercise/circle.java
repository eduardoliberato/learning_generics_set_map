package geometric_exercise;

public class circle implements interfacee{

    private Double radius;

    public circle() {
        
    }


    public circle(Double radius) {
        this.radius = radius;
    }


    public Double getRadius() {
        return radius;
    }


    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea(){
        return (radius * radius) * 3.14;
    }

    
    
}
