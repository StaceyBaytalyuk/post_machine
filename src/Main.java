public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private PostMachine machine;

    private void run() {
        boolean[] state = {false, false, false, true, true, true, true, true, false, false, false, false};
        machine = new PostMachine(state, 3);
        Program1 variant1 = new Program1(machine);
        variant1.run();
    }

    private class Program1 {
        PostMachine machine;

        Program1(PostMachine machine) {
            this.machine = machine;
        }

        void run() {
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

}