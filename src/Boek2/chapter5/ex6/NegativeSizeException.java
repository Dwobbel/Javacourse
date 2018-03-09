package Boek2.chapter5.ex6;

import java.util.IllegalFormatCodePointException;

/**
 * Created by KristofB on 7/03/2018.
 */
public class NegativeSizeException extends IllegalArgumentException {

    public NegativeSizeException() {
        super();
    }

    public NegativeSizeException(String message) {
        super(message);
    }

    public NegativeSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeSizeException(Throwable cause) {
        super(cause);
    }
}
