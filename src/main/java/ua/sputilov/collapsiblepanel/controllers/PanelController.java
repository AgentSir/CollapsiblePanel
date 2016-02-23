package ua.sputilov.collapsiblepanel.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import ua.sputilov.collapsiblepanel.entities.humans.Child;
import ua.sputilov.collapsiblepanel.entities.humans.GrandParent;
import ua.sputilov.collapsiblepanel.entities.humans.Human;
import ua.sputilov.collapsiblepanel.entities.humans.Parent;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by sergey_putilov on 22.02.2016.
 */
public class PanelController implements Initializable {

    @FXML
    private CheckBox firstCheckBox;

    @FXML
    private CheckBox secondCheckBox;

    @FXML
    private CheckBox thirdCheckBox;

    @FXML
    private TextField resultField;

    @FXML
    private TreeView<String> treeView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        treeView = fillTreeView(treeView);
        treeView.getStyleClass().add("festusTree");

    }

    // The method shows calculated value of the selected check boxes
    public void calculateSum(ActionEvent actionEvent){

        int firstValue = 0;
        int secondValue = 0;
        int thirdValue = 0;

        if (firstCheckBox.isSelected()) {
            firstValue = Integer.parseInt(firstCheckBox.getText());
        }

        if (secondCheckBox.isSelected()) {
            secondValue = Integer.parseInt(secondCheckBox.getText());
        }

        if (thirdCheckBox.isSelected()) {
            thirdValue = Integer.parseInt(thirdCheckBox.getText());
        }

        Integer sum = firstValue + secondValue + thirdValue;

        if (sum != 0) {
            resultField.setText(sum.toString());
        } else {
            resultField.setText("");
        }

    }

    // The method gets simple TreeView object as param and returns the changed TreeView object with some nodes
    private TreeView fillTreeView(TreeView<String> treeView) {

        List<Human> humans = getFilledHumanList();
        TreeItem<String> rootNode = new TreeItem<>(new Human().getHumanType());

        for (Human human : humans) {

            TreeItem<String> itemChild = new TreeItem<>(human.getFullName());
            boolean found = false;

            for (TreeItem<String> secondNode : rootNode.getChildren()) {
                if (secondNode.getValue().contentEquals(human.getHumanType())) {
                    secondNode.getChildren().add(itemChild);
                    found = true;
                    break;
                }
            }
            if (!found) {
                TreeItem secondNode = new TreeItem(human.getHumanType());
                rootNode.getChildren().add(secondNode);
                secondNode.getChildren().add(itemChild);
            }
        }

        treeView.setRoot(rootNode);

        return treeView;
    }

    // The method returns filled list with some human objects
    private List<Human> getFilledHumanList() {

        List<Human> humans = new ArrayList<>();

        humans.add(new GrandParent("Moris", "Jonis", true));
        humans.add(new GrandParent("James", "Jonis", false));
        humans.add(new Parent("Jessica", "Jonis", true));
        humans.add(new Parent("Steve", "Jonis", false));
        humans.add(new Child("Nik", "Jonis", false));

        return humans;
    }

}
