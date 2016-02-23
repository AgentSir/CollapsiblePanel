package ua.sputilov.collapsiblepanel.entities.humans;

/**
 * Created by sergey_putilov on 22.02.2016.
 */
public class GrandParent extends Human {

    private String grandParentType;

    public GrandParent(String firstName, String lastName, boolean female){
        this.setFirstName(firstName);
        this.setLastName(lastName);

        if (female) {
            setGrandParentType("Grandmother");
        } else {
            setGrandParentType("Grandfather");
        }
    }

    public String getGrandParentType() {
        return grandParentType;
    }

    private void setGrandParentType(String grandParentType) {
        this.grandParentType = grandParentType;
    }
}
