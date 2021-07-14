package cards8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class RealCards {
public static void main(String[] args) {
 input();
}

private static void input() {
	Map<String,Set<String>> player_card =new LinkedHashMap<String,Set<String>>();
	Map<String,Integer> card_score =new HashMap<String,Integer>();
	
	Scanner sc=new Scanner(System.in);
	String line=sc.nextLine();
	int score=0;
	int p;
	int t = 0;
	while(!line.equals("JOKER")) {
		String name= line.substring(0,line.indexOf(':'));
if(player_card.containsKey(name)) {
	Set<String> set=new HashSet<String>();
	set.addAll(player_card.get(name));
	set.addAll(Arrays.asList(line.substring(line.indexOf(':')+2).replace(",", "").split(" ")));
player_card.put(name,set);
}
else {
player_card.put(name, new HashSet<String>(Arrays.asList(line.substring(line.indexOf(':')+2).replace(",", "").split(" "))));
}
line=sc.nextLine();
	}//end of while


for(Entry<String,Set<String>> entry:player_card.entrySet()) {
	
for(String card:entry.getValue()) {
	if(card_score.containsKey(card)) {
		score+=card_score.get(card);
	}
	else {
	if(card.length()==3) {
		p = Integer.parseInt(card.substring(0, 2));
	}
	else {
	switch (card.charAt(0)) {
		case 'J': p=11; break;
		case 'Q': p=12; break;
		case 'K': p=13; break;
		case 'A': p=14; break;
		default: p = Integer.parseInt(card.substring(0, 1));
	} //switch
}
	switch(card.charAt(card.length()-1)) {
	case 'S': t=4; break;
	case 'H': t=3; break;
	case 'D': t=2; break;
	case 'C': t=1; break;
	}
	card_score.put(card,p*t);
	score+=p*t;
	t=0;
	p=0;
}
	}
	System.out.println(entry.getKey()+": "+score);
	score=0;
} // for set
} // for map

}


