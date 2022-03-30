package application;

import entities.AnnalynsInfiltration;

public class Program {

	public static void main(String[] args) {
		var annalyns = new AnnalynsInfiltration();
		
		System.out.println(annalyns.canFastAttack(true));		
		System.out.println(annalyns.canSpy(false, true, false));
		System.out.println(annalyns.canSignalPrisoner(false, true));
		System.out.println(annalyns.canFreePrisoner(false, true, false, false));

	}

}
