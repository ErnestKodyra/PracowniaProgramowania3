
public class counter
{
    int currentValue = 0;
    int initialValue = currentValue;
    
    void incrementOne(){
        ++currentValue;
    }
    void decrementOne(){
        --currentValue;
    }
    void incrementTen(){
        currentValue += 10;
    }
    void decrementTen(){
        currentValue -= 10;
    }
    void reset(){
        currentValue = initialValue;
    }
    void display(){
        System.out.println(currentValue);
    }
}
