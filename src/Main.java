public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        boolean[] state = {false, false, false, true, true, true, true, true, false, false, false, false};
        PostMachine machine = new PostMachine(state, 3);
        Program program = new Program(machine);
        program.run();
    }
}