package grayson.projects;

public class AlarmClock {

    private String setTime;

    public AlarmClock(String setTime) {
        this.setTime = setTime;
    }

    public String getSetTime() {
        return setTime;
    }

    public void alarmRing(double alarm) {
        if (alarm == 7.0D) {
            System.out.println("Buzz Buzz Buzz - Alarm is going off. Time to Wake up!");
        }
    }
}
