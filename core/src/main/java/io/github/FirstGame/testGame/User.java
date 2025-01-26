package io.github.FirstGame.testGame;

import SpaceObject.DefaultNave;
import SpaceObject.Nave;

public class User {
	
	private static User instance;
	
	private int highScore;
	private int totalScore;
	private Nave choose;
	
	private User() {
		this.highScore = 0;
		this.totalScore = 0;
		this.choose = DefaultNave.getInstance();
	}

	public static User getInstance() {
		if(instance == null) {
			instance = new User();
		}
		return instance;
	}

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public Nave getChoose() {
		return choose;
	}

	public void setChoose(Nave choose) {
		this.choose = choose;
	}
	
	
}
