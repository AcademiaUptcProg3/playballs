package co.edu.uptc.models;

import java.awt.Image;

import co.edu.uptc.pojos.ElementPojo;
import co.edu.uptc.views.DashBoard.DirectionEnum;

public class ElementModel  {
    private int speed = 100;
    private DirectionEnum direction = DirectionEnum.LEFT;
    private ElementPojo elementPojo = new ElementPojo();
    private Boolean running = false;

    public ElementModel() {
        elementPojo.setX(100);
        elementPojo.setY(100);
        elementPojo.setPadding(10);
        elementPojo.setHeight(20);
        elementPojo.setWidth(20);
    }

   
    public void stopElement() {
        this.running = false;
    }

    public ElementPojo getElementPojo() {
        return elementPojo;
    }

    public void setImage(Image image) {
        elementPojo.setImage(image);
    }

    public int getX() {
        return elementPojo.getX();
    }

    public int getY() {
        return elementPojo.getY();

    }

    public int getWidth() {
        return elementPojo.getWidth();
    }

    public int getHeight() {
        return elementPojo.getHeight();
    }

    
    public void startElement() {
        this.running = true;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (running) {
                    try {
                        Thread.sleep(speed);
                        move();
                    } catch (InterruptedException e) {
        
                    }
                }
            }
            
        });

        thread.start();
       
    }

    public void move() {
        if (direction == DirectionEnum.LEFT) {
            left();
        }
        if (direction == DirectionEnum.RIGHT) {
            right();
        }
        if (direction == DirectionEnum.UP) {
            up();
        }
        if (direction == DirectionEnum.DOWN) {
            down();
        }
    }

    public void left() {
        elementPojo.setX(elementPojo.getX() - 10);
        if (elementPojo.getX() <= 1) {
            direction = DirectionEnum.RIGHT;
        }
    }

    public void right() {
        elementPojo.setX(elementPojo.getX() + 10);
        if (elementPojo.getX() >= 450) {
            direction = DirectionEnum.LEFT;
        }
    }

    public void up() {
        elementPojo.setY(elementPojo.getY() - 10);
        if (elementPojo.getY() <= 1) {
            direction = DirectionEnum.DOWN;
        }
    }

    public void down() {
        elementPojo.setY(elementPojo.getY() + 10);
        if (elementPojo.getY() >= 450) {
            direction = DirectionEnum.UP;
        }
    }

}
