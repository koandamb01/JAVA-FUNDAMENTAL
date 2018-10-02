package pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon  {
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	
	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name, health, type);
		pokemons.add(pokemon);
		return pokemon;
	}
	
	@Override
	public void listPokemon() {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.pokemons.size(); i++) {
			System.out.println("Pokemon " + (i+1) +": " + this.pokemons.get(i).getName());
		}
	}

}
