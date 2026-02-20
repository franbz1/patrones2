package javaapplication3;

import java.util.List;

public interface Npc {
    String getName();
    int getLifePoints();
    int getDamagePoints();
    List<Ability> getAbilities();

    void setName(String name);
    void setLifePoints(int points);
    void setDamagePoints(int points);
    void setAbilities(List<Ability> abilities);

    Npc copy(); // Prototype
}