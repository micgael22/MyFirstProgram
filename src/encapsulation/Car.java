package encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;

    Car (String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getMake() {
        return make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}
