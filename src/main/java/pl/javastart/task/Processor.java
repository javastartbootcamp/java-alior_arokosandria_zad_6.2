package pl.javastart.task;

public class Processor extends Component implements Overclockable {
    private int temperature;
    private int clockProcessor;
    private int clockProcessorAdd;
    private static final int MAXTEMPERATURE = 300;

    public Processor(String modelName, String manufacturer, String serialNumber) {
        super(modelName, manufacturer, serialNumber);
        this.clockProcessor = 3000;
        this.temperature = 200;
    }

    public void setClockProcessorAdd(int clockProcessorAdd) {
        this.clockProcessorAdd = clockProcessorAdd;
    }

    public void overclock() throws ComponentOverheating {
        int temperatureIncrease = clockProcessorAdd / 100 * 10;

        if (temperature + temperatureIncrease > MAXTEMPERATURE) {
            throw new ComponentOverheating("Podkręcenie procesora przekroczyłoby maksymalną temperaturę.");
        }
        clockProcessor += clockProcessorAdd;
        temperature += temperatureIncrease;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "temperature=" + temperature +
                ", clockProcessor=" + clockProcessor +
                ", modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}


