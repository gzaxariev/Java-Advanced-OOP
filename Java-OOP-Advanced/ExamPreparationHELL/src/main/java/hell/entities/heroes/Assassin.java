package hell.entities.heroes;

import hell.interfaces.Inventory;

public class Assassin extends BaseHero {
    private static final int STRENGTH = 25;
    private static final int AGILITY = 10;
    private static final int INTELLIGENCE = 15;
    private static final int HIT_POINT = 150;
    private static final int DAMAGE = 300;


    public Assassin(String name, Inventory inventory) {
        super(name, STRENGTH, AGILITY, INTELLIGENCE, HIT_POINT, DAMAGE, inventory);
    }
}
