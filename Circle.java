public class Circle{

  private double radius;

  //The setLength method sets the value of the field length the the value len passed by the method.
  public void setRadius(double rad){

    if(rad >= 0){
    
      radius = rad;

    }

    else{

      radius = 0;

    }

  }

  //The getLength method returns the value in the length field.
  public double getRadius(){

    return radius;

  }


  //The getArea method returns the value for the rectangle's area by multiplying the length by the width.
  public double getArea(){

    double area = radius*radius*3.14159;
    return area;

  }



}