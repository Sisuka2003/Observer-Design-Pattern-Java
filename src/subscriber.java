/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
 interface subscriber {
    public abstract void subscribe(channel c);
    public abstract void unSubscribe(channel c);
    public abstract void update(String message);
}


 class concreteSubscriber implements subscriber{

   channel photographyChannel;
   String notification;
    
    @Override
    public void subscribe(channel c) {
        c.addSubscriber(this);
    }

    @Override
    public void unSubscribe(channel c) {
        c.removeSubscriber(this);
    }

    @Override
    public void update(String message) {
        notification=message;
    }
    
    public String displayNotificationMessage(){
        return notification;
    }


}