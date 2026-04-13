package ejercicio2;

import ejercicio1.Hour;
import ejercicio1.Date;
import java.util.ArrayList;

public class Reunion {
    private String meetingTopic;
    private String place;
    private Hour hour;
    private Date date;
    private ArrayList<Employee> participants;
    private Employee secretary;

    /*
     * Composición debil, la clase no es la responsable por crear los objetos hour y date
     */
    public Reunion(String meetingTopic, String place, Hour hour, Date date, Employee secretary, Employee participant) {
        this.meetingTopic = meetingTopic;
        this.place = place;
        this.hour = hour;
        this.date = date;
        this.participants = new ArrayList<>();
        this.secretary = secretary;
        addParticipant(secretary);
        addParticipant(participant);
    }

    public String getMeetingTopic() {
        return meetingTopic;
    }

    public String getPlace() {
        return place;
    }

    public Hour getHour() {
        return hour;
    }

    public Date getDate() {
        return date;
    }

    public void setMeetingTopic(String meetingTopic) {
        this.meetingTopic = meetingTopic;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setHour(Hour hour) {
        this.hour = hour;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSecretary(Employee newSecretary) {
        if (!participants.contains(newSecretary))
            throw new IllegalArgumentException("The secretary needs to be in the participants list!");

        this.secretary = newSecretary;
    }

    public void addParticipant(Employee newAsistent) {
        participants.add(newAsistent);
    }

    public void removeByPosition(int pos) {
        if (getParticipantByPosition(pos) == secretary)
            throw new IllegalArgumentException("The secretary can't be removed!");

        participants.remove(pos);
    }

    public int getNumberOfParticipants() {
        return participants.size();
    }

    public Employee getParticipantByPosition(int pos) {
        return participants.get(pos);
    }
}
