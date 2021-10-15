
public class lamp
{
    boolean isLampOn = false;
    
    void switchOn(){
        isLampOn = true;
    }
    void switchOff(){
        isLampOn = false;
    }
    void displayInfo(){
        if(isLampOn == true){
            System.out.println("Lamp is on.");
        }
        else{
            System.out.println("Lamp is off.");
        }
    }
}
