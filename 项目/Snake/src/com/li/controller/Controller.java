package com.li.controller;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import com.li.listener.SnakeListener;
import com.li.snake.entities.Food;
import com.li.snake.entities.Ground;
import com.li.snake.entities.Snake;
import com.li.snake.view.GamePanel;
import com.li.util.Global;

/**
 * 事件对象
 * 
 * @author sentry
 *处理按键
 *处理逻辑
 */
public class Controller extends KeyAdapter implements SnakeListener{
	
	private Snake snake;
	private Food food;
	private Ground ground;
	private GamePanel gamepanel;

	public Controller(Snake snake, Food food, Ground ground, GamePanel gamepanel) {
		super();
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.gamepanel = gamepanel;
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			snake.changeDirection(Snake.UP);
		break;
		case KeyEvent.VK_DOWN:
			snake.changeDirection(Snake.DOWN);
		break;
		case KeyEvent.VK_LEFT:
			snake.changeDirection(Snake.LEFT);
		break;
		case KeyEvent.VK_RIGHT:
			snake.changeDirection(Snake.RIGHT);
		break;
		}
	}

	@Override
	public void snakeMoved(Snake snake) {
		// TODO Auto-generated method stub
		
		if(food.isSnakeEatFood(snake)) {
			snake.eatFood();
			food.newFood(ground.getPoint());
		}
		
		if(ground.isSnakeEatRock(snake)) {
			snake.die();
		}
		
		if(snake.isEatBody()) {
			snake.die();
		}
		gamepanel.display(snake, food, ground);
	}
	
	
	public void newGame() {
		snake.start();
		food.newFood(ground.getPoint());
	}


}
