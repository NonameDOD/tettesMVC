package controller;

import model.TettesModel;
import view.TettesView;

public class TettesController {
    private TettesModel model;
    private TettesView view;

    public TettesController(TettesModel model, TettesView view) {
        this.model = model;
        this.view = view;
    }

    public void ellenorzesBeallitassal(boolean annaNegalva, boolean belaNegalva) {
        model.setAnnaNegalva(annaNegalva);
        model.setBelaNegalva(belaNegalva);

        boolean eredmeny = model.ellenorzes();

        view.eredmenyMegjelenitese(eredmeny);
    }
}
