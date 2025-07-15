package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String myChoice = "";
		while(true) {
		  System.out.println("自分のじゃんけんの手を入力しましょう");
		  System.out.println("グーはrockのrを入力しましょう");
		  System.out.println("チョキはscissorsのsを入力しましょう");
		  System.out.println("パーはpaperのpを入力しましょう");
		  
		  myChoice = scanner.nextLine();
		  
		  if(myChoice.equals("r")||myChoice.equals("s")||myChoice.equals("p")) {
			  break;
		  } else {
			  System.out.println("入力し直してください");
		  }
		}
		scanner.close();
		return myChoice;
	}
	
	public String getRandom() {
		String[] choices = {"r", "s", "p"};
	    int i = (int)(Math.floor(Math.random() * 3));
	    return choices[i];
	}
	
	public void playGame(String myChoice, String choices) {
		HashMap <String, String> game = new HashMap<>();
		game.put("r", "グー");
		game.put("s", "チョキ");
		game.put("p", "パー");
		System.out.println("自分の手は" + game.get(myChoice) +",対戦相手の手は" + game.get(choices));
		
		if(myChoice.equals(choices)) {
			System.out.println("あいこです");
		}else if(
				(myChoice.equals("r") && choices.equals("s")) ||
				(myChoice.equals("s") && choices.equals("p")) ||
				(myChoice.equals("p") && choices.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}
