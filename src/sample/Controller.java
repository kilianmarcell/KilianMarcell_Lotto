package sample;

import javafx.fxml.FXML;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public List<Integer> sorsolLista = new ArrayList<Integer>();
    public boolean sorsolE;
    public int randomSzam = 0;

    @FXML
    private Button btnSorsol;

    public void feltoltLista() {
        for (int i = 1; i < 91; i++) {
            sorsolLista.add(i);
        }
    }

    public void randomSzamGeneralas() {
        randomSzam = (int)(Math.random() * (sorsolLista.size() - 1)) + 1;
    }
}
