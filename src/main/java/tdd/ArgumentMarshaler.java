package tdd;
import java.util.*;

public interface ArgumentMarshaler {

    void set(Iterator<String> currentArguement) throws ArgsException;
}
