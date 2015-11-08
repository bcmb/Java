package com.example.strategypattern;

import com.example.startegypattern.interfaces.IAttackBehavior;
import com.example.startegypattern.interfaces.IDefenceBehavior;

public class Character {
	private IAttackBehavior behavior;
	private IDefenceBehavior defBehavior;

	public void setBehavior(IAttackBehavior behavior) {//question
		this.behavior = behavior;
	}
	
	public void setBehavior(IDefenceBehavior defBehavior) {//question
		this.defBehavior = defBehavior;
	}

	public void walk() {
		System.out.println(toString() + " is walking");
	}
	
	public void run() {
		System.out.println(toString() + " is running");
	}
	
	public void attack(boolean fight) {
		if (fight) {
			System.out.println(toString() +  behavior.attack());
		} else {
			System.out.println(toString() +  defBehavior.defend());
		}
	}

}
