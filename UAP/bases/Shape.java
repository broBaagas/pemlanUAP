package bases;

public abstract class Shape {
    private String name;

    public Shape () {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printInfo();

}
