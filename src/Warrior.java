public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, "CRITICAL DAMAGE");
    }

    // Переопределенный метод applySuperAbility()
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}
