package pl.javastart.task;

public class HardDrive extends Component {
    private int capacity;

    public HardDrive(String modelName, String manufacturer, String serialNumber, int capacity) {
        super(modelName, manufacturer, serialNumber);
        this.capacity = capacity;
    }
}
