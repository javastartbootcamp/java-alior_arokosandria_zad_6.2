package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Chiny", "OOOO23345322");
        System.out.println(processor);
        Memory memory = new Memory("Samsung", "USA", "OOOO33454443", 1024);
        System.out.println(memory);
        HardDrive hardDrive = new HardDrive("Samsung", "Tajwan", "77775555", 1024);
        try {
            processor.setClockProcessorAdd(900);
            processor.overclock();
            memory.setClockMemoryAdd(100);
            memory.overclock();
        } catch (ComponentOverheating e) {
            System.err.println(e.getMessage());
        }
    }
}
