
public class rectangle
{
    int width = 0;
    int height = 0;
    
    void displayDimensions(){
        System.out.println(width + "x" + height);
    }
    void displayPerimeter(){
        System.out.println("perimeter: " + 2*(width+height));
    }
    void displaySurfaceArea(){
        System.out.println("surface area: " + width*height);
    }
}
