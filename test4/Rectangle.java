public class Rectangle{
    private int length, width;

    //Constructor for inputting len and wid
    public Rectangle(int l, int w){
        length = l;
        width = w;
    }
    // for default values len = 0, wid = 0 (to abide by requirement 1)
    public Rectangle(){
        length = 0;
        width = 0;
    }

    // Accessor Method 1
    public int getLength(){
        return length;
    }

    //Accessor Method 2
    public int getWidth(){
        return width;
    }

    //Mutator Method 3
    public void setLength(int L){
        length = L;
    }

    //Mutator Method 4
    public void setWidth(int W){
        width = W;
    }

    //Area of Rectangle Method 5
    public double findArea(){
        return length * width;
    }

}