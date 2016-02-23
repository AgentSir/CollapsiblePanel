package ua.sputilov.collapsiblepanel.entities.humans;

/**
 * The class represents a human with first name and last name properties.
 */
public class Human {

    private String firstName;
    private String lastName;
    private boolean Female;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public boolean isFemale() {
        return Female;
    }

    public void setFemale(boolean female) {
        Female = female;
    }

    // The method returns name of the class.
    public String getHumanType() {
        return this.getClass().getSimpleName();
    }

}
