package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    public List<Integer> veletlenLista = new ArrayList<>();
    public List<Integer> sorsoltLista = new ArrayList<>();
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
        veletlenLista.remove(randomSzam - 1);
        sorsoltLista.add(randomSzam);
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
        if (hanyadikSzam == 0) {
            masodikVeletlenSzam.setText("");
            harmadikVeletlenSzam.setText("");
            negyedikVeletlenSzam.setText("");
            otodikVeletlenSzam.setText("");
            hanyadikSzam++;
        } else if (hanyadikSzam > 0 && hanyadikSzam < 4) {
            hanyadikSzam++;
        } else if (hanyadikSzam == 4) {
            btnSorsol.setText("Rendez");
            hanyadikSzam++;
        } else if (hanyadikSzam == 5) {
            Collections.sort(sorsoltLista);
            elsoVeletlenSzam.setText(sorsoltLista.get(0) + "");
            masodikVeletlenSzam.setText(sorsoltLista.get(1) + "");
            harmadikVeletlenSzam.setText(sorsoltLista.get(2) + "");
            negyedikVeletlenSzam.setText(sorsoltLista.get(3) + "");
            otodikVeletlenSzam.setText(sorsoltLista.get(4) + "");
            sorsoltLista.clear();
            veletlenLista.clear();
            feltoltLista();
            hanyadikSzam++;
            btnSorsol.setText("Sorsol");
            hanyadikSzam = 0;
        }
    }
}
