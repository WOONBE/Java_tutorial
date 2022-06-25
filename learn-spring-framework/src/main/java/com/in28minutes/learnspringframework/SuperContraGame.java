package com.in28minutes.learnspringframework;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GamingConsole;


@SpringBootApplication
@Component

public class SuperContraGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("up");
	}

	@Override
	public void down() {
		System.out.println("just go");
	}

	@Override
	public void left() {
		System.out.println("left");
	}

	@Override
	public void right() {
		System.out.println("down");
	}


}