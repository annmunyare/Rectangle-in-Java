public class Rectangle{
private int mLength;
private int mWidth;

  //creating a constructor
  public Rectangle(int length, int width){
    mLength = length;
    mWidth = width;
  }

  //creating the length getter method
  public int getLength(){
    return mLength;
  }
  //creating the width getter method
  public int getWidth(){
    return mWidth;
  }
//creating a method to check if the rectangle is square
public boolean isSquare(){
  return mLength ==mWidth;
}

}
