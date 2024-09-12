public class Car{
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car(){
        carName = "";
        milesDriven = 0.0;
        gallonsUsed = 0.0;
    }
    
    public Car(String name, double miles, double gallons){
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
    }
    
    public String getName(){
        return carName;
    }
    
    public double getMilesDriven(){
        return milesDriven;
    }
    
    public double getGallonsUsed(){
        return gallonsUsed;
    }
    
    public void setName(String name){
        carName = name;
    }
    
    public void setMilesDriven(double miles){
        milesDriven = miles;
    }
    
    public void setGallonsUsed(double gallons){
        gallonsUsed = gallons;
    }
    
    public double calculateAverage(){
        return Math.round(milesDriven / gallonsUsed * 10.0) / 10.0;
    }
    
    public String toString(){
        return carName + " averaged " + this.calculateAverage() + " m/g";
    }
}
