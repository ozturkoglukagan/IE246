package LESSON9N;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Problem {

	// use some random numbers

	// ensure replicability we use seed numbers!

	public Random randomGenerator = new Random();
	public double y, x, z;

	public Problem() {
		// set seed once
		this.randomGenerator.setSeed(212312);
	}

	public void setY() {
		// this.y = Math.random(); // similar to excel's RAND() -> Unif[0,1)
		this.x = this.randomGenerator.nextDouble();
		this.y = this.randomGenerator.nextDouble();
		this.z = this.randomGenerator.nextDouble();
		printAll();
	}

	private void printAll() {
		System.out.println("y: " + this.y);
		System.out.println("x: " + this.x);
		System.out.println("z: " + this.z);
	}

	private int rollDie(int numberofFaces) {
		// i need an integer from 1 to 6 for a typical dice
		// this method is more general, I can roll a die with a different number of
		// faces
		int outcome = this.randomGenerator.nextInt(numberofFaces); // 0, 1,2 ... 5
		// push them fwd by 1 -> 1, 2,3 ... 6
		outcome++;
		return outcome;
	}

	public void rollTwoDiceUntil(int target) {
		int die1 = 0, die2 = 0;
		int rounds = 0;
		// int[] values = new int[]; dynamic-sized array: arrayList
		ArrayList<Integer> values = new ArrayList<Integer>();
		ArrayList<Pair> valuePairs = new ArrayList<Pair>();

		while (die1 + die2 != target) {
			die1 = rollDie(6);
			die2 = rollDie(6);
			values.add(die1);
			values.add(die2);
			Pair p = new Pair(die1, die2);
			valuePairs.add(p);
			rounds++;
		}

		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i) + " ");
		}
		System.out.println();

		/*
		 * for(int i=0; i<valuePairs.size(); i++) {
		 * System.out.print(valuePairs.get(i).die1+","+valuePairs.get(i).die2+" "); }
		 */

		// you can use enhanced for loops on arraylists similar to arrays
		// for(Pair p : valuePairs) {
		// p.printoutPair();
		// }

		// System.out.println();

		System.out.println("It took " + rounds + " rounds to reach a " + target);

	}

	public void playThreeDiceGame(int lb, int ub) {
		int die1, die2, die3;
		int rounds = 0, product = 0;
		do {
			die1 = rollDie(6);
			die2 = rollDie(6);
			die3 = rollDie(6);
			rounds++;
			product = die1 * die2 * die3;
		} while (product >= lb && product <= ub);

		System.out.println("The 3-dice game ended after " + rounds + " rounds.");
	}

	public void randDiscrete(int lb, int ub) {
		int outcome = this.randomGenerator.nextInt(ub - lb);
		outcome += lb;
		System.out.println(outcome);
	}

	public boolean randBoolean(double successProb) {
		double d = this.randomGenerator.nextDouble();
		boolean outcome = false;
		if (d < successProb) {
			outcome = true;
		}
		return outcome;
	}

	public void exponential(double lambda) {
		// unif(0,1) can be transformed into any cont distribution
		double y0 = this.randomGenerator.nextDouble();
		double expoRV = (-1 / lambda) * Math.log(1 - y0);

	}

    public double randPMF(double[] data) {
		double random = this.randomGenerator.nextDouble();
		//double random = Math.random();
		int index=0;
		while (random>0) {
			if (data[index]>random) {
				return data[index+1];
			} else {
				random=random-data[index];
				index=index+2;
			}
			
		}
        return 0;
    }

    public double randPMF(double[] probabilities, double[] outcomes) {
		double random = this.randomGenerator.nextDouble();
	
		//double random = Math.random();
		int index=0;
		while (random>0) {
			if (probabilities[index]>random) {
				return outcomes[index];
			} else {
				random=random-probabilities[index];
				index++;
			}
			
		}
        return 0;
    }

	

}