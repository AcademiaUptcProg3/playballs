package co.edu.uptc.presenters;


import co.edu.uptc.models.ManagerElementModel;
import co.edu.uptc.pojos.ElementPojo;
import co.edu.uptc.views.DashBoard.DashBoard;

public class Presenter implements ContractPlay.Presenter {
    
    private ContractPlay.View view;
    private ContractPlay.Model model;
    
    @Override
    public void setView(ContractPlay.View view) {
        this.view = view;
    }
    
    @Override
    public void setModel(ContractPlay.Model model) {
        this.model = model;
    }

    public void makeMVP() {
        ManagerElementModel managerElementModel = new ManagerElementModel();
        managerElementModel.setPresenter(this);

        DashBoard dashBoard = new DashBoard();
        dashBoard.setPresenter(this);

        setModel(managerElementModel);
        setView(dashBoard);
        
    }

    @Override
    public void begin() {
        makeMVP();
        view.begin();
    }


    // from model
    @Override
    public ElementPojo getElementPojo() {
       return model.getElementsPojo();
    }

    @Override
    public void start() {
      model.start();
    }

    @Override
    public void stop() {
       model.stop();
    }


    
}
