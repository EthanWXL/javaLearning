package com.li.snake.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.li.snake.entities.Food;
import com.li.snake.entities.Ground;
import com.li.snake.entities.Snake;
import com.li.util.Global;

public class GamePanel extends JPanel{
	
	private Snake snake;
	private Food food;
	private Ground ground;
	
	public void display(Snake snake, Food food, Ground ground) {
		System.out.println("GamePanel's display");
		this.food = food;
		this.ground = ground;
		this.snake = snake;
		//repanit()方法最终会调用paintCompnent方法重新显示
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//重新显示
		g.setColor(new Color(0xcfcfcfcf));
		g.fillRect(0, 0, Global.WIDTH*Global.CELL_SIZE, Global.HEIGHT*Global.CELL_SIZE);
		
		if(snake != null && food != null && ground !=null) {
		this.food.drawMe(g);
		this.ground.drawMe(g);
		this.snake.drawMe(g);
		}
	}
}
