package co.edu.uptc.presenters;

import co.edu.uptc.pojos.ElementPojo;

public interface ContractPlay {
    public interface  Model {
        public void setPresenter(Presenter presenter);
        public void start();
        public void stop();
        public ElementPojo getElementsPojo();
        
    }
    public interface View {
        public void setPresenter(Presenter presenter);
        public void begin();
        
    }

    public interface Presenter {
        public void setModel(Model model);
        public void setView(View view);
        public void begin();

        // model
        public ElementPojo getElementPojo();
        public void start();
        public void stop();
        
    }


}
