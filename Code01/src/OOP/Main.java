package OOP;

/**
 * className:       Main
 * author:          wenhao2002
 * date:            2023/10/30 19:35
 */
public class Main {
    public static void main() {
        Input input = new Input();
        input.input("./Text/input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("./Text/output.txt");

    }
}
