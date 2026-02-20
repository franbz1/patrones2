package javaapplication3;

import java.util.ArrayList;
import java.util.List;

public class GameNpc implements Npc {
    private String name;
    private int lifePoints;
    private int damagePoints;
    private List<Ability> abilities;

    public GameNpc() {
        this.abilities = new ArrayList<>();
    }

    public GameNpc(String name, int lifePoints, int damagePoints, List<Ability> abilities) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.abilities = deepCopyAbilities(abilities);
    }
    
    private List<Ability> deepCopyAbilities(List<Ability> source) {
        List<Ability> result = new ArrayList<>();
        if (source != null) {
            for (Ability ability : source) {
                result.add(ability.copy());
            }
        }
        return result;
    }

    public GameNpc(GameNpc other) {
        this.name = other.name;
        this.lifePoints = other.lifePoints;
        this.damagePoints = other.damagePoints;
        this.abilities = new ArrayList<>();
        for (Ability ability : other.abilities) {
            this.abilities.add(ability.copy());
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLifePoints() {
        return lifePoints;
    }

    @Override
    public int getDamagePoints() {
        return damagePoints;
    }

    @Override
    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLifePoints(int points) {
        this.lifePoints = points;
    }

    @Override
    public void setDamagePoints(int points) {
        this.damagePoints = points;
    }

    @Override
    public void setAbilities(List<Ability> abilities) {
        this.abilities = deepCopyAbilities(abilities);
    }

    public void addAbility(Ability ability) {
        if (ability != null) {
            this.abilities.add(ability);
        }
    }

    @Override
    public Npc copy() {
        return new GameNpc(this);
    }

    @Override
    public String toString() {
        return "GameNpc{name='" + name + "', lifePoints=" + lifePoints +
               ", damagePoints=" + damagePoints + ", abilities=" + abilities + "}";
    }
}