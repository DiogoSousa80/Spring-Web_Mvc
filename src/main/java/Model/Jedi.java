package Model;

public class Jedi {
    private String name;
    private String lastName;

    public Jedi(final String name, final String lastname) {
        this.name = name;
        this.lastName = lastname;
    }

    public Jedi(final String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}