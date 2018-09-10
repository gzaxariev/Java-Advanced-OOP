package box_tasks;

public class CamparableBox<T extends Comparable<T>> implements Comparable<CamparableBox<T>> {
    private T value;

    public CamparableBox() {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",this.value.getClass().getName(), this.value);
    }

    @Override
    public int compareTo(CamparableBox<T> other) {
        return this.value.compareTo(other.value);
    }


}
