package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(3),
    OLDER_KIDS(7),
    TEENS(12),
    MATURE(16);

    public final int minimumLeeftijd;

    private Rating(int leeftijd) {
        this.minimumLeeftijd = leeftijd;
    }

    public int getMinimumLeeftijd() {
        return minimumLeeftijd;
    }
}
