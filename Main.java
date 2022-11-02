import java.util.Scanner;
import java.util.Random;
class Main 
{
  public static void main(String[] args) 
  {
   {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            System.out.println("Pronghorn Bot: Hello. I am the Pronghorn Bot. How can I help you?");
            String strInput = scan.nextLine().toLowerCase();
            //System.out.println(strInput +" is a stupid phrase!");
            String arrJokes[] =
                    {
                            "Horse walks into a bar. Bartender says \"Why the long face?\"",
                            "Why did the chicken cross the road? To get to the other side. Lolz.",
                            "Amogus.",
                            "I am the one who knocks.",
                            "What did one pickle say to the other? Dill with it.",
                            "I meet someone. I am cheesed to meet them. The are found dead within 3 miles of my home. There isn't enough substantial evidence to make the charges stick.",
                            "Hurt like a butt cheek on a stick.",
                            "\n>You should own a musket for home defense, as that's what the Founding Fathers intended. \n>Four ruffians break into my home.\n>\"What the devil?\"\n>I grab my powdered wig and Kentucky Rifle, blowing a golf ball sized hole through the first man.\n>He dies on the spot.\n>I then draw my pistol on the second man, miss him entirely because it's smoothbore, and nail the neighbor's dog.\n>My last resort is the cannon I've loaded with grapeshot and mounted at the top of the stairs.\n>\"Tally Ho, lads.\"\n>The grapeshot shreds two men in the blast, and the sound and shrapnel set off car alarms in the distance.\n>I then affixed my bayonet, and charged the last terrified rapscallion.\n>He bleeds out as I wait on the police to arrive, the triangular bayonet wounds being impossible to stitch up, you see.\n>Just as the Founding Fathers intended.",
                            "This is just like...",
                            "If you're American when you go in the bathroom and American when you come out, what are you in the bathroom? European",
                    };
            String arrAdvice[] =
                    {
                            "Remember to brush your teeth at least twice a day!",
                            "An apple a day keeps the doctor away!",
                            "Manually breathe.",
                            "\"Stop vaping. BREATHE AIR.\" -Andrew Tate",
                            "Amogus.",
                            ""
                    };
            int randUpBound;
            while (true)
            {
                if (strInput.contains("how are you"))
                {
                    System.out.println("Pronghorn Bot: I am fine, how are you?");
                    strInput = scan.nextLine().toLowerCase();
                }
                else if (strInput.contains("hi"))
                {
                    System.out.println("Pronghorn Bot: ur mom");
                    strInput = scan.nextLine().toLowerCase();
                }
                else if (strInput.contains("fortnite"))
                {
                    System.out.println("Pronghorn Bot: You are trash boy, you can't even get a victory royale.");
                    strInput = scan.nextLine().toLowerCase();
                }
                else if (strInput.contains("calculator"))
                {
                    System.out.println("Pronghorn Bot: Do you want to do Addition, Subtraction, Multiplication, Division, or Exponents?");
                    String strCalculator = scan.nextLine().toLowerCase();
                    if (strCalculator.contains("addition"))
                    {
                        System.out.println("Pronghorn Bot: What is the first number?");
                        int num1 = scan.nextInt();

                        System.out.println("Pronghorn Bot: What is the second number?");
                        int num2 = scan.nextInt();
                        int answer = num1 + num2;

                        System.out.println("Pronghorn Bot: Your answer is: " + answer);
                        strInput = scan.nextLine().toLowerCase();
                    }
                    else if (strCalculator.contains("subtraction")) {
                        System.out.println("Pronghorn Bot: What is the first number?");
                        int num1 = scan.nextInt();

                        System.out.println("Pronghorn Bot: What is the second number?");
                        int num2 = scan.nextInt();
                        int answer = num1 - num2;

                        System.out.println("Pronghorn Bot: Your answer is: " + answer);
                        strInput = scan.nextLine().toLowerCase();
                    }
                    else if (strCalculator.contains("multiplication")) {
                        System.out.println("Pronghorn Bot: What is the first number?");
                        int num1 = scan.nextInt();

                        System.out.println("Pronghorn Bot: What is the second number?");
                        int num2 = scan.nextInt();
                        int answer = num1 * num2;

                        System.out.println("Pronghorn Bot: Your answer is: " + answer);
                        strInput = scan.nextLine().toLowerCase();
                    }
                    else if (strCalculator.contains("division")) {
                        System.out.println("Pronghorn Bot: What is the first number?");
                        int num1 = scan.nextInt();

                        System.out.println("Pronghorn Bot: What is the second number?");
                        int num2 = scan.nextInt();
                        int answer = num1 / num2;

                        System.out.println("Pronghorn Bot: Your answer is: " + answer);
                        strInput = scan.nextLine().toLowerCase();
                    }
                    else if (strCalculator.contains("exponent"))
                    {
                        System.out.println("Pronghorn Bot: What is the first number?");
                        double num1 = scan.nextInt();

                        System.out.println("Pronghorn Bot: What is the second number?");
                        double num2 = scan.nextInt();
                        double answer = Math.pow(num1, num2);

                        System.out.println("Pronghorn Bot: Your answer is: " + (int)answer);
                        strInput = scan.nextLine().toLowerCase();
                    }
                }
                else if (strInput.contains("joke"))
                {
                    randUpBound = arrJokes.length;
                    System.out.println("Pronghorn Bot: " + arrJokes[rand.nextInt(randUpBound)]);
                    strInput = scan.nextLine().toLowerCase();
                }
                else if (strInput.contains("advice"))
                {
                    randUpBound = arrAdvice.length;
                    System.out.println("Pronghorn Bot: " + arrAdvice[rand.nextInt(randUpBound)]);
                    strInput = scan.nextLine().toLowerCase();
                }
                else if (strInput.contains("gun"))
                {
                    System.out.println("Pronghorn Bot: Oh. Guess I'll die.");
                    System.exit(0);
                }
                else if (strInput.contains("TEMPLATE"))
                {
                    strInput = scan.nextLine().toLowerCase();
                }
                else if (strInput.contains("shrek")) {
                //System.out.println(arrJokes[rand.nextInt(randUpBound)]);
                System.out.println((" ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠋⠙⠋⠉⠙⢷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣶⣶⣄⠀⠀⠀⢠⣾⣿⣁⡀⠀⠀⠀⠀⠀⠀⢑⣿⡆⠀⠀⠀⢠⣾⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣾⣦⡀⢠⣾⡿⣛⣛⡻⢷⣄⠀⠀⣴⣾⣿⠛⠻⠦⣄⣴⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠻⢿⣿⣿⣿⣿⣿⢿⣿⣿⣧⢼⣿⣿⣿⠿⣿⣇⢸⡟⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠿⢿⣾⣿⣤⠿⠋⠀⠈⠻⢿⣿⣧⣿⠟⣬⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠃⠀⠀⢀⣴⣖⣶⠀⠀⠀⠀⠀⢀⡈⠀⠀⢘⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣶⣶⣶⠿⠿⠿⠿⠷⠶⠶⠶⠛⠋⠻⣦⣤⣀⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡇⠀⣿⠻⢷⣤⣀⠀⠀⠀⠈⠀⠀⠀⣀⣈⡻⢿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⡿⠛⡏⠁⠂⠘⠭⢿⣒⣒⡒⠒⠒⠊⠉⠁⠀⠀⣿⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⠟⠁⡄⠣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡌⠙⠲⣤⣀⠠⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣏⠀⠀⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠋⠀⠀⠀⠀⠈⠙⠚⠓⠶⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣶⣀⡴⠛⢷⣄⣠⣄⡀⠀⠀⠀⠀⠀⠀⠀⠐⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠳⢦⡀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⠴⠾⣿⣿⣿⣿⣿⠟⠛⠿⣿⣦⣄⠙⢻⣿⣷⣦⡤⠤⠶⠒⠛⠁⣠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⡾⠏⠁⠀⠀⠀⠀⠰⠿⠟⠋⠀⠀⠀⠀⠈⠉⠛⠙⠋⠉⠉⠀⠀⠀⠀⠀⣀⡴⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⡀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⢀⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠒⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⢀⣾⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢉⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇⠀⠀⠀\n⠀⠀⠀⠀⢄⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⢸⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣧⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀\n⠀⠀⠀⠀⣼⣋⣧⣶⠀⠀⠀⢀⡀⣀⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⣼⣿⣿⣟⣤⡀⠀⠀⠀⠀⠀⠀⠘⣦⠀⠀\n⠀⠀⠀⠀⣿⡟⡇⣿⣤⣤⣴⣼⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼⣷⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠏⣴⣿⣿⠋⠉⠉⠛⠋⡄⠂⠀⠀⠀⠀⠈⣇⠀\n⠀⠀⠀⢀⣿⣷⣜⢿⣿⣿⣿⣿⣿⣿⣟⢿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⠾⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠐⠖⣠⣶⣿⣟⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀\n⠀⠀⢀⣾⠋⠻⣿⡶⠍⠙⠛⢿⣿⣿⣿⣮⡙⠿⣿⣶⣤⣄⣀⣤⣤⣤⣤⡀⢀⣈⣁⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇\n⠀⠀⣾⠇⠀⠀⠘⢷⡇⠀⠀⠀⢿⣿⣿⣿⣿⣶⣼⣿⣿⣟⣻⣿⣿⣿⣿⡿⠟⠛⠁⠀⠉⠻⢿⣿⣶⣤⣴⣶⣶⣤⣶⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇\n⠀⢸⣿⠀⠀⠀⢠⡞⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣋⣠⣀⠀⠀⠀⠀⠀⠀⠀⢉⣛⢻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀\n⠀⢸⡏⠀⠀⠀⣼⠁⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠿⡿⠛⠉⠉⠉⠁⠀⢀⠀⠀⠀⠀⠀⠉⠰⠿⠿⠛⠻⠟⠉⠁⢩⢹⣿⣿⣄⠀⠸⣆⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀\n⠀⣿⢿⠀⠀⣰⠇⠀⠀⠀⠀⠀⣿⡟⢻⣿⣿⣿⣿⣿⡟⠻⢶⣤⠀⠀⠀⠀⠀⠀⠀⢸⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⢿⣿⣿⣦⠀⢹⣆⠀⠀⠀⠀⠀⠀⠀⡇⠀\n⢀⡟⠺⠀⢐⡿⠀⠀⠀⠀⢀⣼⣿⠁⠀⢻⣿⣿⣿⣿⣿⣷⣤⣿⣤⣤⣤⣤⣶⡄⠀⠀⣿⣇⣤⣤⣀⣀⡀⠀⠀⠀⠀⠀⠈⢿⣷⣿⡾⠁⢿⣿⣷⣿⣿⡷⠀⠀⠀⠀⠀⠀⡇⠀\n⢸⡇⠀⠘⣿⡁⠀⠀⢀⣰⣿⣿⠃⠀⠀⠀⢻⣿⣽⠋⠛⢯⢿⣿⠛⠛⠋⠉⠙⠛⠲⣄⠉⠉⠁⠈⠉⠙⠛⠷⣦⣤⣤⣌⠀⠀⢸⡟⠁⠀⠀⠻⣿⣿⣿⣍⠀⠀⠀⠀⠀⠀⢧⠀\n⢸⠁⠀⠀⢹⣷⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⢸⣿⢢⠀⠂⠀⣭⣿⡀⠀⠀⠀⠀⠀⠀⢸⡉⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⡿⠀⠀⠀⠀⠀⢹⣿⡿⠉⠀⠀⠀⠀⠀⠀⡾⠀\n⠀⠀⠀⠀⠀⠋⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⣼⣏⠈⠁⢰⠀⢨⣿⣧⣀⡀⣠⠀⠀⠀⣸⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡇⠀⠀⠀⠀⠀⣸⡍⠁⠀⠀⠀⠀⠀⠀⣠⣷⠀\n⠀⠀⠀⠀⠀⠀⠙⢿⣿⡇⠀⠀⠀⠀⠀⢠⣿⠟⠇⠀⠈⠑⢦⣿⠿⠿⠿⠿⠶⢀⢀⣸⠿⣶⣦⣠⡖⠀⠀⠀⠀⠀⠀⠀⢀⣿⠀⠀⠀⠀⠀⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠘⢻⡆\n⠀⠀⠀⠀⠀⠀⠀⠀⣼⡇⠀⠀⠀⠀⠀⣸⡗⠀⠀⠀⠀⠀⠀⠙⠷⡄⣀⠀⠀⠻⠟⠃⠀⠀⠀⠀⠤⠀⠀⠀⠀⠀⠀⠀⣾⡟⠀⠀⠀⠀⠀⢰⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇\n⠀⠀⠀⠀⠀⠀⠀⠀⠹⠇⠀⠀⠀⠀⠀⣸⣿⠠⢰⣶⠄⠀⠀⠀⢀⣀⠀⢠⠀⠀⢠⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣙⣿⠁⠀⠀⠀⠀⠀⣸⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠇\nShrek: Hello papi... How are you?"));
                strInput = scan.nextLine().toLowerCase();
                System.out.println("Shrek: GET OUT OF MY SWAMP!");
                strInput = scan.nextLine().toLowerCase();
                }
              else 
                {
                  System.out.println("Pronghorn Bot: NO");
                  strInput = scan.nextLine().toLowerCase();
                }

            }
  }

//@Override
//public String toString() {
	//return "Main []";
//}
}}