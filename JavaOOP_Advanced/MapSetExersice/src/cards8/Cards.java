package cards8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Cards {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		
		Map<String,Integer> map_cards=new HashMap<>();
		Map<String,Integer> player_score=new LinkedHashMap<>();
		int score=0;
		int p;
		int t = 0;
		while(!line.equals("JOKER")) {
			String name= line.substring(0,line.indexOf(':'));
		
	
	Set<String> cards=new HashSet<String>(Arrays.asList(line.substring(line.indexOf(':')+2).replace(",", "").split(" ")));
	for(String x:cards) {
	if(map_cards.containsKey(x)) {
		score+=map_cards.get(x);
	}
	else {
		if(x.length()==3) {
			p = Integer.parseInt(x.substring(0, 2));
		}
		else {
		switch (x.charAt(0)) {
			case 'J':	p=11; break;
			case 'Q': p=12; break;
			case 'K': p=13; break;
			case 'A': p=14; break;
			default: p = Integer.parseInt(x.substring(0, 1));
		} //switch
	}
		switch(x.charAt(x.length()-1)) {
		case 'S': t=4; break;
		case 'H': t=2; break;
		case 'D': t=2; break;
		case 'C': t=1; break;
		}
		map_cards.put(x,p*t);
		score+=p*t;
		t=0;
		p=0;
		
	}//last else map
} //end of for
	
	if(player_score.containsKey(name)) {
		player_score.put(name,player_score.get(name)+score);
	}
	else {
		player_score.put(name,score);
	}	
	
		 line=sc.nextLine();
		 score=0;
		} // end of while
	for(Entry<String, Integer> entry:player_score.entrySet()) {
		System.out.println(entry.getKey()+": "+entry.getValue());
	}
		
	}

}
