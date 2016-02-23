package ua.sputilov.collapsiblepanel.entities.humans;

/**
 * Created by sergey_putilov on 22.02.2016.
 */
public class Child extends Human {

    private String childType;

    public Child(String firstName, String lastName, boolean female){
        this.setFirstName(firstName);
        this.setLastName(lastName);

        if (female) {
            setChildType("Girl");
        } else setChildType("Boy");
    }

    public String getChildType() {
        return childType;
    }

    private void setChildType(String childType) {
        this.childType = childType;
    }
}
