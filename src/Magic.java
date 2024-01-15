public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, "MAGIC POWER");
    }

    // Переопределенный метод applySuperAbility()
    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность MAGIC POWER");
    }
}
