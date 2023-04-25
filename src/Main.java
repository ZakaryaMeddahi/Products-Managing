
// #Computer Components:
//  Screen
//  #Processor Compnents:
//   ALU
//   Cache Memory
//  Keyboard

public class Main {
    public static void main(String[] args) {
        // Complex Product (Computer)
        ComplexProduct computer = new ComplexProduct(1, "Computer", 100);

        // Computer Components
        Product screen = new SimpleProduct(2, "Screen", 180);
        Product keyboard = new SimpleProduct(3, "Keyboard", 120);
        ComplexProduct processor = new ComplexProduct(4, "Processor", 100);
        // List of Computer Components
        Product[] computerComponents = {screen, keyboard, processor};

        // Processor Components
        Product ALU = new SimpleProduct(5, "Arithmetic Logic Unit", 120);
        Product cacheMemory = new SimpleProduct(6, "Cache Memory", 160);
        // List of Processor Components
        Product[] processorComponents = {ALU, cacheMemory};


        for(int i = 0; i < processorComponents.length; i++) {
            processor.addComponent(processorComponents[i]);
        }
        
        System.out.println("\nTime Needed to Produce a Processor: " + processor.fabricationTime() + " min");


        for(int i = 0; i < computerComponents.length; i++) {
            computer.addComponent(computerComponents[i]);
        }
        
        System.out.println("\nTime Needed to Produce a Computer: " + computer.fabricationTime() + " min\n");
    }
}
