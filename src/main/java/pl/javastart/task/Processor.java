package pl.javastart.task;

public class Processor extends OverclockableComponent {

    private static final int MAXTEMPERATURE = 120;
    private static final int TEMP = 10;
    private static final int CLOCK = 100;

    public Processor(String modelName, String manufacturer, String serialNumber, int temperature) {
        super(modelName, manufacturer, serialNumber, temperature);
    }

    @Override
    public void overclock() throws ComponentOverheatingException {
        if (getTemperature() + TEMP > MAXTEMPERATURE) {
            throw new ComponentOverheatingException("Podkręcenie procesora przekroczyłoby maksymalną temperaturę.");
        }
        setTemperature(getTemperature() + TEMP);
        setClockParametr(getClockParametr() + CLOCK);
    }
}





