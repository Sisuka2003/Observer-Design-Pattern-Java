/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author User
 */
 interface channel {

    public abstract void addSubscriber(subscriber s);

    public abstract void removeSubscriber(subscriber s);

    public abstract void notifySubscriber(String message);

    public abstract void newphotoGraph(String photographName);
}

class concreteChannel implements channel {

    ArrayList<subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscriber(String message) {
        for (subscriber s1 : subscribers) {
            s1.update(message);
        }
    }

    @Override
    public void newphotoGraph(String photographName) {
        notifySubscriber(photographName);
    }

}
