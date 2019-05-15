public class Program {
    private PostMachine machine;

    public Program(PostMachine machine) {
        this.machine = machine;
    }

    public void run() {
        System.out.println("======================\n1 variant");
        machine.print();
        one();
        machine.print();
    }

    private void one() {
        machine.left();
        two();
    }

    private void two() {
        machine.mark();
    }
}