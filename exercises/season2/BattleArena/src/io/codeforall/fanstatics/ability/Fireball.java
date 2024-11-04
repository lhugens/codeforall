package io.codeforall.fanstatics.ability;

import io.codeforall.fanstatics.hero.Hero;

public class Fireball extends AbstractAbility{
    @Override
    public void use(Hero source, Hero target) {
        source.setMana(source.getMana() - 20);
        target.setHealth(target.getHealth() - 60);
    }
}