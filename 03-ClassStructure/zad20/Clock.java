public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock(){
       hour = 0;
       minute = 0;
    }
    Clock(int hour, int minute){
       this.hour = hour;
       this.minute = minute;
    }
    void setClock(int hr, int min){
        hour = hr;
        minute = min;
    }
    void setClock(){
        hour = 0;
        minute = 0;
    }
    void setAlarm(int hr, int min){
        alarmHour = hr;
        alarmMinute = min;
    }
    void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
    void displayTime(){
        System.out.println("The current time is " + hour + ":" + minute);
    }
    void addOneMinute(){
        minute += 1;
        if(alarmMinute == minute){
            if(alarmHour == hour){
                runAlarm();
            }
        }
    }

}
