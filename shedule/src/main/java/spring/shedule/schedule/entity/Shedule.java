package spring.shedule.schedule.entity;

import javax.persistence.*;

@Entity(name="shedule")
@Table(name="shedule")
public class Shedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "dayOfTheWeek")
    private String dayOfTheWeek;

    @Column(name = "nameDoctor")
    private String nameDoctor;

    @Column(name = "surnameDoctor")
    private String surnameDoctor;

    @Column(name = "nameNurse")
    private String nameNurse;

    @Column(name = "surnameNurse")
    private String surnameNurse;

    @Column(name = "workingTime")
    private String workingTime;

    public Shedule(int id, String dayOfTheWeek, String nameDoctor, String surnameDoctor, String nameNurse, String surnameNurse, String workingTime) {
        this.id = id;
        this.dayOfTheWeek = dayOfTheWeek;
        this.nameDoctor = nameDoctor;
        this.surnameDoctor = surnameDoctor;
        this.nameNurse = nameNurse;
        this.surnameNurse = surnameNurse;
        this.workingTime = workingTime;
    }

    public Shedule() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getSurnameDoctor() {
        return surnameDoctor;
    }

    public void setSurnameDoctor(String surnameDoctor) {
        this.surnameDoctor = surnameDoctor;
    }

    public String getNameNurse() {
        return nameNurse;
    }

    public void setNameNurse(String nameNurse) {
        this.nameNurse = nameNurse;
    }

    public String getSurnameNurse() {
        return surnameNurse;
    }

    public void setSurnameNurse(String surnameNurse) {
        this.surnameNurse = surnameNurse;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    @Override
    public String toString() {
        return "Shedule{" +
                "id=" + id +
                ", dayOfTheWeek='" + dayOfTheWeek + '\'' +
                ", nameDoctor='" + nameDoctor + '\'' +
                ", surnameDoctor='" + surnameDoctor + '\'' +
                ", nameNurse='" + nameNurse + '\'' +
                ", surnameNurse='" + surnameNurse + '\'' +
                ", workingTime='" + workingTime + '\'' +
                '}';
    }
}