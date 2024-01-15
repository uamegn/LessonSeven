public class Medic extends  Hero {
    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public Medic(int health, int damage) {
        super(health, damage, "HEALING");
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints = (int) (healPoints * 1.1);
        System.out.println("Медик повысил опыт. Теперь количество единиц лечения: " + healPoints);
    }



    // Переопределенный метод applySuperAbility()
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEALING");
    }

}










