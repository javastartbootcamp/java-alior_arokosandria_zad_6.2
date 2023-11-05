package pl.javastart.task;

abstract class Component {
    private String modelName;
    private String manufacturer;
    private String serialNumber;

    public Component(String modelName, String manufacturer, String serialNumber) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }
}
