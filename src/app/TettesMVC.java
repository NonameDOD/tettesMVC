package app;

import controller.TettesController;
import model.TettesModel;
import view.TettesView;

public class TettesMVC {
     public static void main(String[] args) {
        TettesModel model = new TettesModel();
        TettesView view = new TettesView();
        TettesController controller = new TettesController(model, view);
        controller.ellenorzesBeallitassal(true, false);
        controller.ellenorzesBeallitassal(false, true);
    }
}
