package custam_list;

public interface MyList<T extends Comparable<T>> {

    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int fisrtIndex, int secondIndex);

    int countGreaterThan(T element);

    T getMax();

    T getMin();

    Iterable<T> getElements();

    void sort();
}
