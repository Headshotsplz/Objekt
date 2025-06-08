
public class Termometer {
    
    private double tempCelsius;

    private void validateTempCelsius(double temp){
        if (temp < -273.15) {
            throw new IllegalArgumentException("Celsius cannot be lower than 273.15");
        }
    }

    public void setTempCelsius(double temp) {
        validateTempCelsius(temp);
        this.tempCelsius = temp;
    }

    public void setTemperatureFahrenheit(double tempFahrenheit){
        tempFahrenheit = (tempCelsius * 9 / 5) + 32;
    }

    public double getTempCelsius() {
        return tempCelsius;
    }

    public double getTempFahrenheit() {
        return (tempCelsius * 9 / 5) + 32;
    }



}
