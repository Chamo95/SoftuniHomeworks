package PokemonTrainer6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		boolean removal=false;
		Pokemon paki = null;
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		Map<String,Trainer> trainers=new LinkedHashMap<>();
		while(!command.equals("Tournament")) {
String data[]=command.split(" "); String trainer_name=data[0]; String pokemon_name=data[1];
String pokemon_Element=data[2]; int pokemon_health=Integer.parseInt(data[3]);
	if(!trainers.containsKey(trainer_name)) {
	List<Pokemon> pokemons=new ArrayList();
	pokemons.add(new Pokemon(pokemon_name,pokemon_Element,pokemon_health));
	Trainer trainer=new Trainer(trainer_name,pokemons);
	trainers.put(trainer_name, trainer);
			
		}
	else {
trainers.get(trainer_name).getList().add(new Pokemon(pokemon_name,pokemon_Element,pokemon_health));
	}
	command=sc.nextLine();
	} //end of while tournament
		command=sc.nextLine();
		while(!command.equals("End")) {
			for(Entry<String,Trainer> entry :trainers.entrySet()) {
				for(Pokemon poki:entry.getValue().getList()) {
					if(poki.getElement().equals(command)) {
						entry.getValue().setNumberofbadges(1);
						break;
					}
					else {
						if(poki.getHealth()-10<=0) {
							removal=true;
							paki=poki;
						}
						else {
					poki.setHealth(poki.getHealth()-10);
						}
					}
				}
				if(removal) {
					entry.getValue().getList().remove(paki);
					removal=false;
				}
			}
			command=sc.nextLine();
		}//end of while End
		
trainers.entrySet().stream()
.sorted(Map.Entry.comparingByValue()).forEach(x->System.out.println(x.getValue()));

		
	}

}
