package com.li.listener;

import com.li.snake.entities.Snake;
/**
 * 
 * @author sentry
 * 
 * 事件监听器
 * 
 *事件监听，蛇每移动一次，就触发这个事件
 */
public interface SnakeListener {
	
	public void snakeMoved(Snake snake);

}
