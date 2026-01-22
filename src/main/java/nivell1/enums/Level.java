package nivell1.enums;

public enum Level {
    LOW("Yellow"), MEDIUM("Orange"), HIGH("Red");

    private final String colorLevel;

    Level(String colorLevel) {
        this.colorLevel = colorLevel;
    }

    public String getColorLevel() {
        return this.colorLevel;
    }
}
