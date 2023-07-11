
public class TemperatureConverterApp {

	public static void main(String[] args) {
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double result = temperatureConverter.convertFahrenheitToCelsius(68.0);
		System.out.println(result);
	}

}
