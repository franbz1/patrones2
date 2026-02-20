/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author labinf6.pasto
 */
public class BasicAbility implements Ability {
    private String name;
    private String effectDescription;

    public BasicAbility(String name, String effectDescription) {
        this.name = name;
        this.effectDescription = effectDescription;
    }

    public BasicAbility(BasicAbility other) {
        this.name = other.name;
        this.effectDescription = other.effectDescription;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.out.println(name + ": " + effectDescription);
    }

    @Override
    public Ability copy() {
        return new BasicAbility(this);
    }
}
