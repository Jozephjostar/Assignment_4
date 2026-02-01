package model;

public class Podcast extends MediaContentBase {

    private int duration;
    private String host;

    public Podcast(int id, String name, int duration, String host) {
        super(id, name);
        this.duration = duration;
        this.host = host;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getType() {
        return "Podcast";
    }
}