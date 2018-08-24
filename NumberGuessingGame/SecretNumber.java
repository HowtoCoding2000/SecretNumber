import java.util.Scanner;
public class SecretNumber
	{
		static Scanner userInput = new Scanner(System.in);
		static int secretNumberLimit = 10;
		static int numberOfGuesses = 0;
		static String userName = "Calvin";
		static boolean stillPlaying = true;
		static int difficulty = 0;
		static int userGuess = 0;
		static int secretNumber = 0;
		static int playAgain = 0;
		
		public static void main(String[] args)
			{
				greetUser();
				while (stillPlaying)
					{
						pickDifficulty();
						generateRandomNumber();
						askForUserGuessAndEvaluateGuess();
						askToPlayAgain();
					}
			}
		
		public static void greetUser()
			{
				System.out.println("What is your name?");
				String userName = userInput.nextLine();
				System.out.println("Welcome " + userName + "!");
			}
				
		public static void pickDifficulty()
			{
				System.out.println("Pick a difficulty, " + userName + ".");
				System.out.println("(1) Easy");
				System.out.println("(2) Medium");
				System.out.println("(3) Hard");
				System.out.println("(4) Expert");
				System.out.println("(5) I want to be here a while");
				difficulty = userInput.nextInt();
				if (difficulty == 1)
					{
						secretNumberLimit = 10;
					}
				else if (difficulty == 2)
					{
						secretNumberLimit = 50;
					}
				else if (difficulty == 3)
					{
						secretNumberLimit = 100;
					}
				else if (difficulty == 4)
					{
						secretNumberLimit = 1000;
					}
				else
					{
						secretNumberLimit = 10000;
					}
			}
		
			public static void generateRandomNumber()
				{
					secretNumber = (int)(Math.random() * secretNumberLimit) + 1;
					// System.out.println(secretNumber);
				}
			
			public static void askForUserGuessAndEvaluateGuess()
				{
						boolean stillGuessing = true;
						numberOfGuesses = 0;
						while (stillGuessing)
							{
								System.out.println(userName + ", pick a number between 1 and " + secretNumberLimit + ".");
								userGuess = userInput.nextInt();
								numberOfGuesses = numberOfGuesses + 1;
								if (userGuess >= 1 && userGuess <= secretNumberLimit)
									{
										if (userGuess == secretNumber)
											{
												
												if (numberOfGuesses == 1)
													{
														System.out.println("You guessed the number in " + numberOfGuesses + " guess, " + userName  + "!");
													}
												else
													{
														System.out.println("You guessed the number in " + numberOfGuesses + " guesses, " + userName  + "!");
													}
												
												if (secretNumberLimit == 10)
													{
														if (numberOfGuesses > 0 && numberOfGuesses < 3)
															{
																System.out.println("You're a great guesser!");
															}
														else if (numberOfGuesses >= 3 && numberOfGuesses < 5)
															{
																System.out.println("Not a bad!");
															}
														else
															{
																System.out.println("Did you just start at 1 and go up from there?");
															}
													}
												else if (secretNumberLimit == 50)
													{
														if (numberOfGuesses > 0 && numberOfGuesses <5)
															{
																System.out.println("Great job!");
															}
														else if (numberOfGuesses >= 5 && numberOfGuesses <10)
															{
																System.out.println("Not a bad number of guesses.");
															}
														else if (numberOfGuesses >= 10 && numberOfGuesses <15)
															{
																System.out.println("Nice. Try to take less guesses next time.");
															}
														else if (numberOfGuesses >= 15 && numberOfGuesses < 25)
															{
																System.out.println("You did it.");
															}
														else
															{
																System.out.println("Did you just start at 1 and go up from there?");
															}
													}
												else if (secretNumberLimit == 100)
													{
														if (numberOfGuesses > 0 && numberOfGuesses < 10)
															{
																System.out.println("That's a really impressive number of guesses!");
															}
														else if (numberOfGuesses >= 10 && numberOfGuesses < 15)
															{
																System.out.println("Good job guessing!");
															}
														else if (numberOfGuesses >= 15 && numberOfGuesses < 25)
															{
																System.out.println("Great! That was a hard one wasn't it?");
															}
														else if (numberOfGuesses >= 25 && numberOfGuesses < 50)
															{
																System.out.println("Not bad.");
															}
														else
															{
																System.out.println("Did you just start at 1 and go up from there?");
															}
													}
												else if (secretNumberLimit == 1000)
													{
														if (numberOfGuesses > 0 && numberOfGuesses < 10)
															{
																System.out.println("Wow! You know some tricks for this don't you?");
															}
														else if (numberOfGuesses >= 10 && numberOfGuesses < 15)
															{
																System.out.println("That was immpressive!");
															}
														else if (numberOfGuesses >= 15 && numberOfGuesses < 25)
															{
																System.out.println("Great Job!");
															}
														else if (numberOfGuesses >= 25 && numberOfGuesses < 50)
															{
																System.out.println("Good job guessing!");
															}
														else if (numberOfGuesses >= 50 && numberOfGuesses < 100)
															{
																System.out.println("That was a hard one wasn't it?");
															}
														else if (numberOfGuesses >= 100 && numberOfGuesses < 500)
															{
																System.out.println("Maybe try a different tactic next time.");
															}
														else
															{
																System.out.println("Did you just start at 1 and go up from there?");
															}
													}
												else
													{
														if (numberOfGuesses > 0 && numberOfGuesses < 15)
															{
																System.out.println("Let's just admit we both know that was a lucky guess.");
															}
														else if (numberOfGuesses >= 15 && numberOfGuesses < 25)
															{
																System.out.println("That's a crazy low number of guesses!");
															}
														else if (numberOfGuesses >= 25 && numberOfGuesses < 50)
															{
																System.out.println("Holy cow that was fast!");
															}
														else if (numberOfGuesses >= 50 && numberOfGuesses < 100)
															{
																System.out.println("That was great!");
															}
														else if (numberOfGuesses >= 100 && numberOfGuesses < 500)
															{
																System.out.println("You're really good at this!");
															}
														else if (numberOfGuesses >= 500 && numberOfGuesses < 1000)
															{
																System.out.println("I'm glad I could be here for that. NOT!");
															}
														else if (numberOfGuesses >= 1000 && numberOfGuesses < 5000)
															{
																System.out.println("At this point I'm just impressed you even kept guessing.");
															}
														else
															{
																System.out.println("Did you just start at 1 and go up from there?");
															}
													}
										
												stillGuessing = false;
												
											}
										else if (userGuess < secretNumber)
											{
												System.out.println("Too low, " + userName + ".");
											}
										else if (userGuess > secretNumber)
											{
												System.out.println("Too high, " + userName + ".");
											}
									}
								else
									{
										System.out.println("Please pick a number between 1 and " + secretNumberLimit + ", " + userName + ".");
									}
							}
				}
			
			public static void askToPlayAgain()
				{
						System.out.println("Would you like to play again, " + userName + "?");
						System.out.println("(1) Yes");
						System.out.println("(2) No");
						playAgain = userInput.nextInt();
						if (playAgain == 1)
							{
								stillPlaying = true;
							}
						else if (playAgain == 2)
							{
								System.out.println("Come play again later, " + userName + "!");
								stillPlaying = false;
							}
					
							
				}
	}
