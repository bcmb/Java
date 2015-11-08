package com.example.strategypattern.attack;

import com.example.startegypattern.interfaces.IDefenceBehavior;

public class NoAttackBehavior implements IDefenceBehavior {

	@Override
	public String defend() {
		return " just defending";
	}

}
