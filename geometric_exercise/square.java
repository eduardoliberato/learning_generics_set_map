package geometric_exercise;

public class square implements interfacee {

    private Double side;

    public square() {

    }

    public square(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override

    public Double getArea() {
        return side * side;
    }

}
