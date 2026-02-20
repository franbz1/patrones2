/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author labinf6.pasto
 */
public interface NpcBuilder {
    NpcBuilder reset();
    NpcBuilder withName(String name);
    NpcBuilder withLifePoints(int points);
    NpcBuilder withDamagePoints(int points);
    NpcBuilder addAbility(Ability ability);
    Npc build();
}