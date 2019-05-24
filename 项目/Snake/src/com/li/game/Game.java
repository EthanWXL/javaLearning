package com.li.game;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.li.controller.Controller;
import com.li.snake.entities.Food;
import com.li.snake.entities.Ground;
import com.li.snake.entities.Snake;
import com.li.snake.view.GamePanel;
import com.li.util.Global;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 Snake snake = new Snake();
			 Food food = new Food();  
			 Ground ground = new Ground();
			 GamePanel gamepanel = new GamePanel();
			 Controller controller = new Controller(snake,food,ground,gamepanel);
			 
			 JFrame frame = new JFrame();
			 
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 gamepanel.setSize(Global.WIDTH*Global.CELL_SIZE, 
					 Global.HEIGHT*Global.CELL_SIZE);
			 
			 frame.setSize(Global.WIDTH*Global.CELL_SIZE+10,
					 Global.HEIGHT*Global.CELL_SIZE+35);
			 frame.add(gamepanel,BorderLayout.CENTER);
			 
			 frame.addKeyListener(controller);
			 gamepanel.addKeyListener(controller);
			 snake.addSnakeListener(controller);
			 
			 frame.setVisible(true);
			 
			 controller.newGame();
	}

}
