package MediatorSchema;

abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void Send(String message);
    public abstract  void Notify(String message);
}

class ConcreteColleague1 extends Colleague {


    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Send(String message) {
        mediator.Send(message,this);
    }

    @Override
    public void Notify(String message) {
        System.out.println("Colleague1 gets message: " + message);
    }
}

class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Send(String message) {
        mediator.Send(message, this);
    }

    @Override
    public void Notify(String message) {
        System.out.println("Colleague2 gets message: " + message);
    }
}
