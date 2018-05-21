
package by.bntu.fitr.povt.jit.coursework.model;

public class Teacher {
    
    private String name;
    private String status;

    public Teacher(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Teacher() {
        name = "name";
        status = "docent";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", status=" + status + '}';
    }
}
