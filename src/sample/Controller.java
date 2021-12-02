package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public List<Integer> veletlenLista = new ArrayList<>();
    public List<Integer> sorsoltLista = new ArrayList<>();
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

    @FXML
    public void initialize() {
        feltoltLista();
    }

    public void feltoltLista() {
        for (int i = 1; i < 91; i++) {
            veletlenLista.add(i);
        }
    }

    public void randomSzamGeneralas() {
        randomSzam = (int)(Math.random() * (veletlenLista.size() - 1)) + 1;
        veletlenLista.remove(randomSzam);
        sorsoltLista.add(veletlenLista.get(randomSzam));
    }

    @FXML
    public void sorsolRendez() {
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
        if (hanyadikSzam < 4) {
            hanyadikSzam++;
        } else {
            sorsolE = false;
            btnSorsol.setText("Rendez");
            hanyadikSzam = 0;
        }
        if (!sorsolE) {

        }
    }
}
