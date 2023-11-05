package pl.javastart.task;

public class Memory extends Component implements Overclockable {
    private int temperature;
    private int clockMemory;
    private int clockMemoryAdd;
    private int capacity;
    private static final int MAXTEMPERATURE = 200;

    public Memory(String modelName, String manufacturer, String serialNumber, int capacity) {
        super(modelName, manufacturer, serialNumber);
        this.temperature = 150;
        this.clockMemory = 1066;
        this.capacity = capacity;
    }

    @Override
    public void overclock() throws ComponentOverheating {
        int temperatureIncrease = clockMemoryAdd / 100 * 15;
        if (temperature + temperatureIncrease > MAXTEMPERATURE) {
            throw new ComponentOverheating("Podkręcenie pamięci przekroczyłoby maksymalną temperaturę.");
        }
        clockMemory += clockMemoryAdd;
        temperature += temperatureIncrease;
    }

    public void setClockMemoryAdd(int clockMemoryAdd) {
        this.clockMemoryAdd = clockMemoryAdd;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "temperature=" + temperature +
                ", clockMemory=" + clockMemory +
                ", capacity=" + capacity +
                ", modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}

