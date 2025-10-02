package entities;

public class Rectangle {
    public double width;
    public double height;


    public double Area(){
        return width * height;
    }

    public double Parameter(){
        return width + height + width + height ;
    }

    public double Diagonal(){
       double calculation = (width * width) + (height * height);

        return Math.sqrt(calculation);
    }
}
