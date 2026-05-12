package ejercicio1;

public class Reunion {
    private String meetingTopic;
    private String place;
    private Date date;
    private Hour hour;

    /*
     * Composición fuerte, se pasan los atributos de Date y Hour por el constructor de Reunion y se crean las instancias desde ahi
     */

    public Reunion(String meetingTopic, String place, int day, int month, int year, int hour, int minuts) {
        this.meetingTopic = meetingTopic;
        this.place = place;
        this.date = new Date(day, month, year);
        this.hour = new Hour(hour, minuts);
    }

    public String getMeetingTopic() {
        return meetingTopic;
    }

    public void setMeetingTopic(String newMeetingTopic) {
        this.meetingTopic = newMeetingTopic;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String newPlace) {
        this.place = newPlace;
    }

    public Date getDate() {
        return new Date(date.getDay(), date.getMonth(), date.getYear());
    }

    public void setDate(int day, int month, int year) {
        this.date = new Date(day, month, year);
    }

    public Hour getHour() {
        return new Hour(hour.getHour(), hour.getMinuts());
    }

    public void setHour(int hour, int minuts) {
        this.hour = new Hour(hour, minuts);
    }
}
