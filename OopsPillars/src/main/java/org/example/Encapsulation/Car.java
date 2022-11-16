package org.example.Encapsulation;
// how to achieve Encapsulation? -> private + Getters and Setters, to control over data
public class Car {
    private String name;
    private int id;

    public Car(String name, int id, String company) {
        this.name = name;
        this.id = id;
        this.company = company;
    }

    private String company;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
