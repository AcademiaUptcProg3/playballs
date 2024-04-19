package co.edu.uptc.models;

import co.edu.uptc.pojos.ElementPojo;
import co.edu.uptc.presenters.ContractPlay;

public class ManagerElementModel implements ContractPlay.Model {

    private ElementModel elementModel = new ElementModel();
    private ContractPlay.Presenter presenter;
//    ElementModel elementModel;

    @Override
    public void setPresenter(ContractPlay.Presenter presenter) {
        this.presenter = presenter;
    }

    public ManagerElementModel() {
        createElement();
    }

    public ElementPojo getElementsPojo() {
        ElementPojo elementPojo = elementModel.getElementPojo();
        return elementPojo;
    }

    public void createElement() {
        elementModel = new ElementModel();
    }

    @Override
    public void start() {
        elementModel.startElement();
    }

    @Override
    public void stop() {
        elementModel.stopElement();
    }

}
