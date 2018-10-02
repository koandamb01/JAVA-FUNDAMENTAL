package pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name, health, type);
		return pokemon;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		return "This Pokemon Info: " + pokemon.getName() + " health: " + pokemon.getHealth() + " type: " + pokemon.getType();
	}
	
}
