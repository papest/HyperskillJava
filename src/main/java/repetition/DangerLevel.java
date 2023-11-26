package repetition;

public enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private final int level;

    DangerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

class Main2 {

    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;

        System.out.println(high.getLevel() > medium.getLevel());
    }
}
