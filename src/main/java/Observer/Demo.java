package Observer;

public class Demo {
    public static void main(String[] args) {
        WeatherInfo weatherInfo = new WeatherInfo();

        Statistics statistics = new Statistics(weatherInfo);
        CurrentWeather currentWeather = new CurrentWeather(weatherInfo);
        Forecast forecast = new Forecast(weatherInfo);

        // Імітація зміни даних про погоду
        weatherInfo.setData(19, 65, 30.4f);
        System.out.println("\n");
        weatherInfo.setData(21, 70, 29.2f);
        System.out.println("\n");
        weatherInfo.setData(15, 90, 29.2f);
    }
}