package demo.foods;

public abstract class Food {

    private int quantity;

    protected Food(int quantity) {
        this.setQuantity(quantity);
    }

    public final int getQuantity() {
        return this.quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}