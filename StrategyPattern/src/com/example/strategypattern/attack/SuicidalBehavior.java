package com.example.strategypattern.attack;

import com.example.startegypattern.interfaces.IAttackBehavior;

public class SuicidalBehavior implements IAttackBehavior {

	@Override
	public String attack() {
		return " is doing nothing to get killed";
	}

}
