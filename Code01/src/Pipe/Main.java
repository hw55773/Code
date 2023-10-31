package Pipe;

import java.io.File;
import java.io.IOException;

/**
 * className:       Main
 * author:          wenhao2002
 * date:            2023/10/30 21:03
 */
public class Main {
    public static void main() throws IOException {
        File inFile = new File("./Text/input.txt");
        File outFile = new File("./Text/output.txt");
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();

    }
}

