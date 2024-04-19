package co.edu.uptc.views;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import co.edu.uptc.pojos.ElementPojo;
import co.edu.uptc.views.DashBoard.DashBoard;

public class WorkPanel extends JPanel {
    private int speed = 80;
   

    private ElementPojo element = new ElementPojo();
    private DashBoard dashBoard;
    

    public WorkPanel(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);  
        g.drawOval(element.getX(),element.getY(),element.getWidth(),element.getHeight());    
    }


   public void threadPaint(){
       Thread thread = new Thread(new Runnable() {
           @Override
           public void run() {
           
            while (true) {
               try {
                   Thread.sleep(speed);
                   element = dashBoard.presenter.getElementPojo();
               } catch (InterruptedException e) {
                  
               }
               repaint();
           }
        }
       });
       thread.start();
   }

   

}
