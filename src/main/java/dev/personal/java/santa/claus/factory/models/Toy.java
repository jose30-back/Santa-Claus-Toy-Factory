package dev.personal.java.santa.claus.factory.models;

public class Toy {

    protected String id;
    protected String title;
    protected boolean isGoodToy;

    public Toy(String title, boolean isGoodToy) {
        this.title = title;
        this.isGoodToy = isGoodToy;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isGoodToy() {
        return isGoodToy;
    }

    public void setId(String id) {
        if (isGoodToy) {
            this.id = "B" + id;
        } else {
            this.id = "M" + id;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGoodToy(boolean isGoodToy) {
        this.isGoodToy = isGoodToy;
    }

}
