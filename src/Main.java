public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        boolean[] state = {false, false, false, true, true, true, true, true, false, false, false, false};
        //PostMachine machine = new PostMachine(state, 3);

        boolean[] state6 = {false, true, true, true, true, false, true, true, true, false};

//        System.out.println();
//        machine.print();

        v1(new PostMachine(state, 3));
        v2(new PostMachine(state, 7));
        v3(new PostMachine(state, 5));
        v4(new PostMachine(state, 11));
        v5(new PostMachine(state, 0));


        v6(new PostMachine(state6, 1));
        //machine.print();
    }


    private void v1(PostMachine machine) {
        System.out.println("======================\n1 variant");
        machine.print();
        machine.left();
        machine.mark();
        machine.print();
    }

    private void v2(PostMachine machine) {
        System.out.println("======================\n2 variant");
        machine.print();
        machine.right();
        machine.mark();
        machine.print();
    }

    private void v3(PostMachine machine) {
        System.out.println("======================\n3 variant");
        machine.print();
        do {
            //двигаемся в любую из сторон до конца
            machine.right();
        } while ( machine.isMarked() );
        machine.mark();
        machine.print();
    }

    private void v4(PostMachine machine) {
        System.out.println("======================\n4 variant");
        machine.print();
        do {
            machine.left();
        } while ( ! machine.isMarked() );
        machine.right();
        machine.mark();
        machine.print();
    }

    private void v5(PostMachine machine) {
        System.out.println("======================\n5 variant");
        machine.print();
        do {
            machine.right();
        } while ( ! machine.isMarked() );
        machine.left();
        machine.mark();
        machine.print();
    }

    private void v6(PostMachine machine) {
        System.out.println("======================\n6 variant");
        machine.print();

        do {
            machine.right();
        } while ( machine.isMarked() );
        machine.mark();

        do {
            machine.right();
        } while ( machine.isMarked() );
        machine.left();
        machine.erase();
        machine.left();
        machine.erase();
        machine.print();
    }

}