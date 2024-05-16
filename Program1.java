class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author: A E-S
  */
  
  public void run() {
    // your code goes here
    
    String[] names = new String[8];
    int[] scores = new int[8];

    // Players names;
    names[0] = "A";
    names[1] = "B";
    names[2] = "C";
    names[3] = "D";
    names[4] = "E";
    names[5] = "F";
    names[6] = "G";
    names[7] = "H";

    // Players scores
    scores[0] = 1;
    scores[1] = 2;
    scores[2] = 3;
    scores[3] = 4;
    scores[4] = 5;
    scores[5] = 6;
    scores[6] = 7;
    scores[7] = 8;

    // Make the chart
    System.out.println("------------------");
    System.out.println("| Names | Scores |");
    System.out.println("------------------");

    for (int i = 0; i < names.length; i++){
      System.out.printf("| %-5s | %-6S | %n", names[i], scores[i]);
    }

    System.out.println("------------------");

    // FIND PLAYER WITH THE HIGHEST SCORE
    int highestscore = 0;
    String bestPlayer = "";

    for (int i = 0; i < scores.length; i++){
      if (scores[i] > highestscore){
        highestscore = scores[i];
      }
    }
    
    for (int i = 0; i < names.length; i++){
      if (highestscore == scores[i]){
        bestPlayer = names[i];
      }
    }

    System.out.println("The player with the highest score is " + bestPlayer + " they had a score of " + highestscore + ".");

  }
}
