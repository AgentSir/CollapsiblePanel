package ua.sputilov.collapsiblepanel.utils;

import javafx.scene.text.Font;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by sergey_putilov on 22.02.2016.
 */
public class FontLoader {

    public void loadFestusFont(){

        Font festusFont = null;

        try {
            festusFont = Font.loadFont(new FileInputStream(new File(getClass().getResource("/fonts/festus.ttf").getFile())), 10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
