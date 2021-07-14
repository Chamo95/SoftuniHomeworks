package CatLady9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		input();

	}

	private static void input() throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Map<String,Cat> map=reader.lines().takeWhile(input->!input.equals("End")).map(STRING_TO_CAT).
				collect(Collectors.toMap(cat->cat.getName(), cat->cat));
		System.out.println(map.get(reader.readLine()));
	}
	private static Function<String, Cat> STRING_TO_CAT=input->{
		String data[]=input.split(" "); String breed=data[0]; String name=data[1];
	double specific=Double.parseDouble(data[2]);
	
	switch(breed) {
	case "Siamese" : return new Siamese(name, specific);
	case "Cymric" : return new Cymric (name, specific);
	case "StreetExtraordinaire" : return new StreetExtraordinaire(name, specific);
	}
	return null;
	
	
	};
}
