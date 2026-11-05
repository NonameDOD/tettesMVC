package model;

public class TettesModel {

    private boolean annaNegalva;
    private boolean belaNegalva;

    public void setAnnaNegalva(boolean annaNegalva) {
        this.annaNegalva = annaNegalva;
    }

    public void setBelaNegalva(boolean belaNegalva) {
        this.belaNegalva = belaNegalva;
    }

    public String anna() {
        return annaNegalva ? "nem Béla volt" : "Béla volt";
    }

    public String bela() {
        return belaNegalva ? "nem Csaba volt" : "Csaba volt";
    }

    public String csaba() {
        return "nem Béla volt";
    }

    public String david() {
        return "nem Csaba volt";
    }

    public boolean ellenorzes() {

        String[] eredmenyek = {
            anna(),
            bela(),
            csaba(),
            david()
        };

        boolean vanEgyezes = false;
        int i = 0;

        while (i < eredmenyek.length && !vanEgyezes) {

            int j = i + 1;

            while (j < eredmenyek.length && !vanEgyezes) {

                if (eredmenyek[i].equals(eredmenyek[j])) {
                    vanEgyezes = true;
                }

                j++;
            }

            i++;
        }

        return !vanEgyezes;
    }
}