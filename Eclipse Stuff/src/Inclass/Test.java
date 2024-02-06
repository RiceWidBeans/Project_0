package Inclass;

import java.util.Scanner;
import java.util.Random;

public class Test {
	
	    public static void main(String[] args) {
	        final int ROCK = 0;
	        final int PAPER = 1;
	        final int SCISSORS = 2;
	        final int MAX_NAME = 40;

	        Scanner input = new Scanner(System.in);
	        Random rand = new Random();

	        int seed = input.nextInt();
	        rand.setSeed(seed);

	        String plyr1Name = input.next();
	        String plyr2Name = input.next();

	        int rounds;

	        while (true) {
	            rounds = input.nextInt();
	            if (rounds > 0) {
	                break;
	            } else {
	                System.out.println("Rounds must be > 0");
	            }
	        }

	        System.out.printf("%s vs %s for %d rounds\n", plyr1Name, plyr2Name, rounds);

	        int plyr1Move, plyr1Wins = 0;
	        int plyr2Move, plyr2Wins = 0;

	        for (int i = 0; i < rounds; ++i) {
	            while (true) {
	            	plyr1Move = rand.nextInt(3);
	            	plyr2Move = rand.nextInt(3);

	                if (plyr1Move != plyr2Move) {
	                    break;
	                }
	                System.out.println("Tie");
	            }

	            if (plyr1Move == ROCK) {
	                if (plyr2Move == PAPER) {
	                    System.out.printf("%s wins with paper\n", plyr2Name);
	                    ++plyr2Wins;
	                } else if (plyr2Move == SCISSORS) {
	                    System.out.printf("%s wins with rock\n", plyr1Name);
	                    ++plyr1Wins;
	                }
	            } else if (plyr1Move == PAPER) {
	                if (plyr2Move == SCISSORS) {
	                    System.out.printf("%s wins with scissors\n", plyr2Name);
	                    ++plyr2Wins;
	                } else if (plyr2Move == ROCK) {
	                    System.out.printf("%s wins with paper\n", plyr1Name);
	                    ++plyr1Wins;
	                }
	            } else if (plyr1Move == SCISSORS) {
	                if (plyr2Move == ROCK) {
	                    System.out.printf("%s wins with rock\n", plyr2Name);
	                    ++plyr2Wins;
	                } else if (plyr2Move == PAPER) {
	                    System.out.printf("%s wins with scissors\n", plyr1Name);
	                    ++plyr1Wins;
	                }
	            }
	        }

	        System.out.printf("%s wins %d and %s wins %d\n", plyr1Name, plyr1Wins, plyr2Name, plyr2Wins);

	        input.close();
	    }
	}