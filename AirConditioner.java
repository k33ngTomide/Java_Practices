public class AirConditioner{
    private int temperature;
    
    public AirConditioner(int initialTemperature) {
        this.temperature = initialTemperature;
    }
    
    public void increaseTemperature(int increment) {
        temperature += increment;
        System.out.println("Increased temperature by " + increment + " degrees. Current temperature: " + temperature);
    }
    
    public void decreaseTemperature(int decrement) {
        temperature -= decrement;
        System.out.println("Decreased temperature by " + decrement + " degrees. Current temperature: " + temperature);
    }
    
    public int getCurrentTemperature() {
        return temperature;
    }
    
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner(25); // Initialize with initial temperature
        
        System.out.println("Initial temperature: " + ac.getCurrentTemperature());
        
        ac.increaseTemperature(3);
        ac.decreaseTemperature(2);
    }
}







