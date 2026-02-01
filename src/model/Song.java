package model;

public class Song extends MediaContentBase {

    private int duration;
    private Category category;

    public Song(int id, String name, int duration, Category category) {
        super(id, name);
        this.duration = duration;
        this.category = category;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getType() {
        return "Song";
    }

    public Category getCategory() {
        return category;
    }
}