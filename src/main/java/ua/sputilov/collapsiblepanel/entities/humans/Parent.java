package ua.sputilov.collapsiblepanel.entities.humans;

/**
 * Created by sergey_putilov on 22.02.2016.
 */
public class Parent extends Human {

    private String parentType;

    public Parent(String firstName, String lastName, boolean female){
        this.setFirstName(firstName);
        this.setLastName(lastName);

        if(female) {
            setParentType("Mother");
        } else {
            setParentType("Father");
        }
    }

    public String getParentType() {
        return parentType;
    }

    private void setParentType(String parentType) {
        this.parentType = parentType;
    }
}
