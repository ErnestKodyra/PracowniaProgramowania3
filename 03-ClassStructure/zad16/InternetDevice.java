
public class InternetDevice
{
    String name;
    boolean connected;
    static int connectedDevices = 0;
    
    InternetDevice(String name){
        this.name = name;
        connected = true;
        connectedDevices += 1;
    }
    
    void connect(){
        if(connected = false){
            connectedDevices += 1;
        }
        connected = true;
    }
    
    void disconnect(){
        if(connected == true){
            connectedDevices -= 1;
        }
        connected = false;
    }
    boolean isConnected(){
        return connected;
    }
    void displayStatus(){     
        if(connected == true){
            System.out.println("Device is connected");
        }
        else{
            System.out.println("Device is disconnected");
        }
    }
    static void displayConnections(){
        System.out.println("The number of connected devices is " + connectedDevices);
    }
}
