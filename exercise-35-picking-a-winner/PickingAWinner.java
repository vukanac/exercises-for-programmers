import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PickingAWinner {
  public static void main(String[] args) {
    var contestants = getContestants();
    if (contestants.size() > 0) {
      var winner = pickWinner(contestants);
      System.out.printf("The winner is...%s.%n", winner);
    }
  }
  
  private static List<String> getContestants() {
    var contestants = new ArrayList<String>();
    while (true) {
      var name = System.console().readLine("Enter a name: ");
      if (name.length() == 0) {
        break;
      }
      contestants.add(name);
    }
    return contestants;
  }

  private static String pickWinner(List<String> contestants) {
    var index = ThreadLocalRandom.current().nextInt(0, contestants.size());
    return contestants.get(index);
  }
}

