package com.globallogic.factory;

import com.globallogic.abstraction.Pizza;
import com.globallogic.concrete.CheesePizza;
import com.globallogic.concrete.ClamPizza;
import com.globallogic.concrete.PepperoniPizza;
import com.globallogic.concrete.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
