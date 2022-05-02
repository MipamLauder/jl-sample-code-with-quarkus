package org.acme;

public class TestData {

    private int id;
    private int age;
    private double lat;
    private double lon;
    private String name;
    private double owing;

    public TestData(int id,int age, double lat, double lon, String name, double owing){
        this.id=id;this.age = age; this.lat = lat; this.lon = lon; this.name=name; this.owing = owing;
    }
    public int getId(){ return id; }
    public int getAge() {
        return age;
    }

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }

    public String getName() {
        return name;
    }

    public double getOwing() {
        return owing;
    }

}
