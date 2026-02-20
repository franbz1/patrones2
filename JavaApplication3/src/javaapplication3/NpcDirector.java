/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author labinf6.pasto
 */
public class NpcDirector {

    public Npc createBasicSoldier(NpcBuilder builder, String name) {
        return builder.reset()
                .withName(name)
                .withLifePoints(120)
                .withDamagePoints(25)
                .addAbility(new BasicAbility("Slash", "Deals melee damage"))
                .build();
    }

    public Npc createEliteSoldier(NpcBuilder builder, String name) {
        return builder.reset()
                .withName(name)
                .withLifePoints(220)
                .withDamagePoints(45)
                .addAbility(new BasicAbility("Power Slash", "Heavy melee attack"))
                .addAbility(new BasicAbility("Shield Block", "Reduces incoming damage"))
                .build();
    }

    public Npc createArcher(NpcBuilder builder, String name) {
        return builder.reset()
                .withName(name)
                .withLifePoints(90)
                .withDamagePoints(35)
                .addAbility(new BasicAbility("Quick Shot", "Fast ranged attack"))
                .addAbility(new BasicAbility("Poison Arrow", "Applies damage over time"))
                .build();
    }
}
