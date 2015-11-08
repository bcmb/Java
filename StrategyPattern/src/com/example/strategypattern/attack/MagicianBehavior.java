package com.example.strategypattern.attack;

import com.example.startegypattern.interfaces.IAttackBehavior;

public class MagicianBehavior implements IAttackBehavior {
	
	@Override
	public String attack() {
		return " is using his magic to fight";
	}
	
}
