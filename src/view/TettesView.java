package view;

public class TettesView {

    public void eredmenyMegjelenitese(boolean megoldhato) {

        if (megoldhato) {
            System.out.println("Meg lehet oldani!");
        } else {
            System.out.println("Nem lehet megoldani!");
        }
    }
}