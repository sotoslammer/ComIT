package july3;

public class Coin {
    private final String name;
    private final int value;

    public Coin(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int coinsNeeded(int total) {
        return total / this.value;
    }

    public int totalAfterValue(int total) {
        return total % this.value;
    }
}
