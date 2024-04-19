package co.edu.uptc.views.DashBoard;

import javax.swing.JFrame;

import co.edu.uptc.presenters.ContractPlay;
import co.edu.uptc.views.WorkPanel;

import java.awt.BorderLayout;

public class DashBoard extends JFrame implements ContractPlay.View{
    private MenuPanel menuPanel;
    protected WorkPanel workPanel;

    public ContractPlay.Presenter presenter;
    
    public void setPresenter(ContractPlay.Presenter presenter) {
        this.presenter = presenter;
    }

    
    public DashBoard(){
        setLayout(new BorderLayout());
        initComponents();
    }
    
private DashBoard getInstance(){
    return this;
}

    public void initComponents(){
        setBounds(1, 1, 850, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuPanel = new MenuPanel();        
        menuPanel.setDashBoard(getInstance());
        add(menuPanel, BorderLayout.NORTH);
        workPanel = new WorkPanel(this);
        add(workPanel, BorderLayout.CENTER);
    }

    @Override
    public void begin() {
        workPanel.threadPaint();
        setVisible(true);
    }

}
