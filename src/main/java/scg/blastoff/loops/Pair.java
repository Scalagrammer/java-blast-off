package scg.blastoff.loops;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Pair<T> implements Iterable<T> {

    final T first;
    final T second;

    private Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Iterator<T> iterator() {
        return new PairIterator<>(this);
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", first, second);
    }

    public static <T> Pair<T> pairOf(T first, T second) {
        return new Pair<>(first, second);
    }

}

final class PairIterator<T> implements Iterator<T> {

    final Pair<T> pair;

    int currentPosition = 0;

    PairIterator(Pair<T> pair) {
        this.pair = pair;
    }

    @Override
    public boolean hasNext() {
        currentPosition += 1;
        return currentPosition < 2;
    }

    @Override
    public T next() {
        return switch (currentPosition) {
            case 1 -> pair.first;
            case 2 -> pair.second;
            default -> {
                throw new NoSuchElementException();
            }
        };
    }
}
