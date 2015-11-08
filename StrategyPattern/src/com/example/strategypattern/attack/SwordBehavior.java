package com.example.strategypattern.attack;

import com.example.startegypattern.interfaces.IAttackBehavior;

public class SwordBehavior implements IAttackBehavior {

	@Override
	public String attack() {
		return " is fighting with sword";
	}

}
