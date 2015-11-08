package com.example.strategypattern.attack;

import com.example.startegypattern.interfaces.IAttackBehavior;

public class PeacefulBehavior implements IAttackBehavior {

	@Override
	public String attack() {
		return " is running away";
	}

}
