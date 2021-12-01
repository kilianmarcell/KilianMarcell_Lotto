package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public List<Integer> sorsolLista = new ArrayList<>();
    public boolean sorsolE;
    public int hanyadikSzam = 0;
    public int randomSzam = 0;

    @FXML
    public Button btnSorsol;
    @FXML
    public Label jelenGeneraltSzam;
    @FXML
    public Label elsoVeletlenSzam;
    @FXML
    public Label masodikVeletlenSzam;
    @FXML
    public Label harmadikVeletlenSzam;
    @FXML
    public Label negyedikVeletlenSzam;
    @FXML
    public Label otodikVeletlenSzam;

    public void feltoltLista() {
        for (int i = 1; i < 91; i++) {
            sorsolLista.add(i);
        }
    }

    public void randomSzamGeneralas() {
        randomSzam = (int)(Math.random() * (sorsolLista.size() - 1)) + 1;
    }

    @FXML
    public void sorsolRendez() {
        if (hanyadikSzam < 4) {
            hanyadikSzam++;
        } else {
            hanyadikSzam = 0;
        }
        randomSzamGeneralas();
        switch (hanyadikSzam) {
            case 0:
                elsoVeletlenSzam.setText(randomSzam + "");
                break;
            case 1:
                masodikVeletlenSzam.setText(randomSzam + "");
                break;
            case 2:
                harmadikVeletlenSzam.setText(randomSzam + "");
                break;
            case 3:
                negyedikVeletlenSzam.setText(randomSzam + "");
                break;
            case 4:
                otodikVeletlenSzam.setText(randomSzam + "");
                break;
        }
    }
}
