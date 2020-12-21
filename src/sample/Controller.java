package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class Controller {
    private String a, b;
    public TextField masuk_angka;
    public Label hasil;
    public TextField masuk_angka2;
    DecimalFormat df = new DecimalFormat("#.#");

    public void buttonKali(ActionEvent actionEvent) {
        a = masuk_angka.getText();
        b = masuk_angka2.getText();
        double angka_a = Double.parseDouble(a);
        double angka_b = Double.parseDouble(b);
        double hsl = angka_a * angka_b;
        String output = df.format(angka_a) + "x" + df.format(angka_b) + "=" + df.format(hsl);
        hasil.setText(output);
    }

    public void buttonClear(ActionEvent actionEvent) {
        masuk_angka.clear();
        masuk_angka2.clear();
        String output = "0";
        hasil.setText(output);
    }

    public void buttonKurang(ActionEvent actionEvent) {
        a = masuk_angka.getText();
        b = masuk_angka2.getText();
        double angka_a = Double.parseDouble(a);
        double angka_b = Double.parseDouble(b);
        double hsl = angka_a - angka_b;
        String output = df.format(angka_a) + "-" + df.format(angka_b) + "=" + df.format(hsl);
        hasil.setText(output);
    }

    public void buttonBagi(ActionEvent actionEvent) {
        a = masuk_angka.getText();
        b = masuk_angka2.getText();
        double angka_a = Double.parseDouble(a);
        double angka_b = Double.parseDouble(b);
        double hsl = angka_a / angka_b;
        String output = df.format(angka_a) + "/" + df.format(angka_b) + "=" + df.format(hsl);
        hasil.setText(output);
    }

    public void buttonTambah(ActionEvent actionEvent) {
        a = masuk_angka.getText();
        b = masuk_angka2.getText();
        double angka_a = Double.parseDouble(a);
        double angka_b = Double.parseDouble(b);
        double hsl = angka_a + angka_b;
        String output = df.format(angka_a) + "+" + df.format(angka_b) + "=" + df.format(hsl);
        hasil.setText(output);
    }
}
