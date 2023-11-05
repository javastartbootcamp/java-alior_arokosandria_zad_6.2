package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Chiny", "OOOO23345322", 100, 1000);
        System.out.println(processor);
        Memory memory = new Memory("Samsung", "USA", "OOOO33454443", 105, 1000, 1024);
        System.out.println(memory);
        HardDrive hardDrive = new HardDrive("Samsung", "Tajwan", "77775555", 1024);
        try {
            memory.overclock();
            System.out.println(memory);
            memory.overclock();
            System.out.println(memory);
            memory.overclock();
            System.out.println(memory);
        } catch (ComponentOverheatingException e) {
            System.err.println(e.getMessage());
        }
    }
}
