/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author labinf6.pasto
 */
public class DefaultNpcBuilder implements NpcBuilder {
    private GameNpc npc;

    public DefaultNpcBuilder() {
        reset();
    }

    @Override
    public NpcBuilder reset() {
        this.npc = new GameNpc();
        return this;
    }

    @Override
    public NpcBuilder withName(String name) {
        npc.setName(name);
        return this;
    }

    @Override
    public NpcBuilder withLifePoints(int points) {
        npc.setLifePoints(points);
        return this;
    }

    @Override
    public NpcBuilder withDamagePoints(int points) {
        npc.setDamagePoints(points);
        return this;
    }

    @Override
    public NpcBuilder addAbility(Ability ability) {
        if (ability != null) {
            npc.addAbility(ability.copy()); // avoid shared mutable references
        }
        return this;
    }

    @Override
    public Npc build() {
        Npc result = npc;
        reset(); // ready for next build
        return result;
    }
}