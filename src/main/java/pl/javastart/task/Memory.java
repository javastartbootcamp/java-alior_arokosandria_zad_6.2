package pl.javastart.task;

public class Memory extends OverclockableComponent {

    private int capacity;
    private static final int MAXTEMPERATURE = 140;
    private static final int TEMP = 15;
    private static final int CLOCK = 100;

    public Memory(String modelName, String manufacturer, String serialNumber, int temperature) {
        super(modelName, manufacturer, serialNumber, temperature);
    }

    @Override
    public void overclock() throws ComponentOverheatingException {
        if (getTemperature() + TEMP > MAXTEMPERATURE) {
            throw new ComponentOverheatingException("Podkręcenie pamięci przekroczyłoby maksymalną temperaturę.");
        }
        setTemperature(getTemperature() + TEMP);
        setClockParametr(getClockParametr() + CLOCK);
    }
}