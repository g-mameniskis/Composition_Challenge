package grayson.projects;

public class NightStand {

    private AlarmClock alarmClock;

    public NightStand(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    public AlarmClock getAlarmClock() {
        return alarmClock;
    }

    public void wakeUp(double time) {
        alarmClock.alarmRing(time);
    }
}
