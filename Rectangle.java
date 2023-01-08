
public class Rectangle{

  private double length;
  private double width;

  //The setLength method sets the value of the field length the the value len passed by the method.
  public void setLength(double len){

    if(len >= 0){
    
      length = len;

    }

    else{

      length = 0;

    }

  }

  //The getLength method returns the value in the length field.
  public double getLength(){

    return length;

  }

  //The setWidth method sets the value of the field width with the value wid passed by the method.
  public void setWidth(double wid){

    if(wid >= 0){
      width = wid;
    }
    else{
      width = 0;
    }

  }

  //The getWidth method returns the value of the width filed.
  public double getWidth(){

    return width;

  }

  //The getArea method returns the value for the rectangle's area by multiplying the length by the width.
  public double getArea(){

    double area = length*width;
    return area;

  }



}