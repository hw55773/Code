package Pipe;

import java.io.IOException;

/**
 * className:       Filter
 * author:          wenhao2002
 * date:            2023/10/30 21:01
 */
public abstract class Filter {
    protected Pipe input;
    protected Pipe output;

    public Filter(Pipe input, Pipe output) {
        this.input = input;
        this.output = output;
    }
    protected abstract void transform() throws IOException;
}

