package ro.mirodone;

import java.util.stream.IntStream;

public class Not5Clever {

    public  long dontGiveMeFive(int start, int end)
    {
        return IntStream.rangeClosed(start, end).filter(x -> !String.valueOf(x).matches(".*5.*")).count();
    }

}
