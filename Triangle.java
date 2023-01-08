
public class Triangle{

  private double height;
  private double base;

  //The setLength method sets the value of the field length the the value len passed by the method.
  public void setBase(double b){

    if(b >= 0){
    
      base = b;

    }

    else{

      base = 0;

    }

  }

  //The getLength method returns the value in the length field.
  public double getBase(){

    return base;

  }

  //The setWidth method sets the value of the field width with the value wid passed by the method.
  public void setHeight(double hei){

    if(hei >= 0){
      height = hei;
    }
    else{
      height = 0;
    }

  }

  //The getWidth method returns the value of the width filed.
  public double getHeight(){

    return height;

  }

  //The getArea method returns the value for the rectangle's area by multiplying the length by the width.
  public double getArea(){

    double area = (base*height)/2;
    return area;

  }



}