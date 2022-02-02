package Observer;

public class Demo {
    public static void main(String[] args) {
        WeatherInfo weatherInfo = new WeatherInfo();

        Statistics statistics = new Statistics();
        weatherInfo.addObserver(statistics);

        CurrentWeather currentWeather = new CurrentWeather();
        weatherInfo.addObserver(currentWeather);

        Forecast forecast = new Forecast();
        weatherInfo.addObserver(forecast);

        // Імітація зміни даних про погоду
        weatherInfo.setData(19, 65, 30.4f);
        System.out.println("\n");
        weatherInfo.setData(21, 70, 29.2f);
        System.out.println("\n");
        weatherInfo.setData(15, 90, 29.2f);
    }
}