package pl.javastart.task;

abstract class OverclockableComponent extends Component {
    private int temperature;
    private int clockParametr;

    public OverclockableComponent(String modelName, String manufacturer, String serialNumber, int temperature, int clockParametr) {
        super(modelName, manufacturer, serialNumber);
        this.temperature = temperature;
        this.clockParametr = clockParametr;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getClockParametr() {
        return clockParametr;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setClockParametr(int clockParametr) {
        this.clockParametr = clockParametr;
    }

    public abstract void overclock() throws ComponentOverheatingException;

    @Override
    public String toString() {
        return "OverclockableComponent{" +
                "temperature=" + temperature +
                ", clockParametr=" + clockParametr +
                '}';
    }
}


