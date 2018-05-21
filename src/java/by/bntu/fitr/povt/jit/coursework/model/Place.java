
package by.bntu.fitr.povt.jit.coursework.model;

public class Place {
    private String name;

    public Place(String name) {
        this.name = name;
    }

    public Place() {
        name = "noname";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Place{" + "name=" + name + '}';
    }
}
