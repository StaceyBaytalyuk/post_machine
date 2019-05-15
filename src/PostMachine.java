import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostMachine {
    private List<Boolean> tape;
    private int pointer;

    public PostMachine(boolean[] tapeState, int pointerPosition) {
        tape = new ArrayList<>(tapeState.length);
        pointer = pointerPosition;

        for (int i = 0; i < tapeState.length; i++) {
            tape.add(tapeState[i]);
        }
    }

    public void left() {
        System.out.println((pointer-1) + " <- " + pointer);
        pointer--;
    }

    public void right() {
        System.out.println(pointer + " -> " + (pointer+1));
        pointer++;
    }

    public void mark() {
        System.out.println(pointer+" marked");
        tape.set(pointer, true);
    }

    public void erase() {
        System.out.println(pointer+" erased");
        tape.set(pointer, false);
    }

    public boolean isMarked() {
        return tape.get(pointer);
    }

    public void print() {
        printIndexes();
        printTape();
        printPointer();
    }

    private void printPointer() {
        int n = 1 + pointer*3;
        char[] chars = new char[n];
        Arrays.fill(chars, ' ');
        System.out.println( new String(chars) + "∆" );
    }

    private void printTape() {
        for (Boolean box : tape) {
            if ( box ) {
                System.out.print("[v]");
            } else {
                System.out.print("[ ]");
            }
        }
        System.out.println();
    }

    private void printIndexes() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+i+" ");
        }
        for (int i = 10; i < tape.size(); i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}