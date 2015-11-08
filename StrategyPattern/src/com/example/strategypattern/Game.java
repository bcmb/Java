package com.example.strategypattern;

import com.example.strategypattern.attack.MagicianBehavior;
import com.example.strategypattern.attack.NoAttackBehavior;
import com.example.strategypattern.attack.PeacefulBehavior;
import com.example.strategypattern.attack.SwordBehavior;

public class Game {

	public static void main(String[] args) {
		final boolean FIGHT = true;
		Character knightWillard = new Knight();
		Character paysanDrop = new Paysan();
		Character magicianBob = new Magician();
		Character womanJane = new Woman();
		knightWillard.setBehavior(new SwordBehavior());
		paysanDrop.setBehavior(new PeacefulBehavior());
		magicianBob.setBehavior(new MagicianBehavior());//question
		womanJane.setBehavior(new NoAttackBehavior());
		knightWillard.attack(FIGHT);
		paysanDrop.attack(FIGHT);
		magicianBob.attack(FIGHT);
		womanJane.attack(!FIGHT);
		
		
	}

}
