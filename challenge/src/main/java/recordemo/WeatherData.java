package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {
//
//    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        double F= temperatureCelsius*9/5 + 32;     
    }
//
//    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %f°C (%f°F) and %s", 
                             temperatureCelsius, 
                             temperatureFahrenheit(), 
                             conditions);
    }
//
    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double tempCelsius = (tempFahrenheit - 32) * 5.0 / 9.0;
        return new WeatherData(tempCelsius, conditions);
    }
    public static void main(String[] args) {
        WeatherData W = new WeatherData(23.7,"sunny");
        WeatherData F = fromFahrenheit(50,"cloudy");
        System.out.println(W.getSummary());
        System.out.println(F.getSummary());

    }
}
