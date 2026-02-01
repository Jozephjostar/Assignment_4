package model;

public abstract class MediaContentBase {

    private int id;
    private String name;

    protected MediaContentBase(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public abstract int getDuration();
    public abstract String getType();


    public String basicInfo() {
        return id + " | " + name + " | " + getType();
    }


    public int getId() { return id; }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}