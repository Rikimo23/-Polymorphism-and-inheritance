
class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}


class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}


class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}