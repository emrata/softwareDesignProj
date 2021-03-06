package factory;

/**
 *
 * @author unaipuelles
 * @author daviddominguez
 */

import State.Status;
import java.util.ArrayList;
import java.util.List;

import model.Attribute;
import decorator.Attack;

public abstract class Orc extends Enemy{

    public Orc(List<Attribute> attributes) {
        this.name = "Orco";
        this.attributes = attributes;
        this.attacks = getAttacksDefault();
        this.status = new Status();
    }
    
    public List<Attack> getAttacksDefault() {
        List<Attack> ataques = new ArrayList();
        ataques.add(new Attack("Hachazo", 16));
        ataques.add(new Attack("Morder", 10));
        ataques.add(new Attack("Tirar piedra", 6));
        ataques.add(new Attack("Hacer caca encima", 3));
        
        return ataques;
    }
}
