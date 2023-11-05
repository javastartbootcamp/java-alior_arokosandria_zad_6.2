package pl.javastart.task;

abstract class Component {
    protected String modelName;
    protected String manufacturer;
    protected String serialNumber;

    public Component(String modelName, String manufacturer, String serialNumber) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }
}
