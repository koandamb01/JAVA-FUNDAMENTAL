package pokemon;

public class PokedexTest {
	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon p1 = pokedex.createPokemon("Lolo", 100, "animal");
		Pokemon p2 = pokedex.createPokemon("Lao", 300, "Small");
		Pokemon p3 = pokedex.createPokemon("Pikachu", 500, "Hero");
		Pokemon p4 = pokedex.createPokemon("My", 250, "animal");
		
		System.out.println("---------------------------");
		String info = pokedex.pokemonInfo(p1);
		System.out.println("P1 info: " + info);
		System.out.println("---------------------------");
		
		pokedex.listPokemon();
		System.out.println(p1.getCount());
	}
}
