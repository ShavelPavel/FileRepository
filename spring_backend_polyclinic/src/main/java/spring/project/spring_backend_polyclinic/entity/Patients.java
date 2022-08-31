package spring.project.spring_backend_polyclinic.entity;

import javax.persistence.*;

@Entity(name="patients")
@Table(name="patients")
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="date_of_Years")
    private int date_of_Birth;

    @Column(name="city")
    private String city;

    @Column(name="insurance_policy")
    private int insurance_policy;

    @Column(name="procedures")
    private String procedures;

    @Column(name="analyzes")
    private String analyzes;

    public Patients(int id, String name, String surname, int date_of_Birth, String city, int insurance_policy, String procedures, String analyzes) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.date_of_Birth = date_of_Birth;
        this.city = city;
        this.insurance_policy = insurance_policy;
        this.procedures = procedures;
        this.analyzes = analyzes;
    }

    public Patients() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDate_of_Birth() {
        return date_of_Birth;
    }

    public void setDate_of_Birth(int date_of_Birth) {
        this.date_of_Birth = date_of_Birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getInsurance_policy() {
        return insurance_policy;
    }

    public void setInsurance_policy(int insurance_policy) {
        this.insurance_policy = insurance_policy;
    }

    public String getProcedures() {
        return procedures;
    }

    public void setProcedures(String procedures) {
        this.procedures = procedures;
    }

    public String getAnalyzes() {
        return analyzes;
    }

    public void setAnalyzes(String analyzes) {
        this.analyzes = analyzes;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date_of_Birth=" + date_of_Birth +
                ", city='" + city + '\'' +
                ", insurance_policy=" + insurance_policy +
                ", procedures='" + procedures + '\'' +
                ", analyzes='" + analyzes + '\'' +
                '}';
    }
}
