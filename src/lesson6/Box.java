package lesson6;

public class Box {

    double width;
    double heigth;
    double depth;

    public Box(double width, double heigth, double depth) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
    }

    double volume() {
        return width * heigth * depth;


    }

}

