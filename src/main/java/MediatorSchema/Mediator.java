package MediatorSchema;

abstract class Mediator {
    public abstract void Send(String message, Colleague colleague);
}

class ConcreteMediator extends Mediator {

    private Colleague colleague1;
    private Colleague colleague2;

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void Send(String message, Colleague colleague) {
        if(colleague == colleague1) {
            colleague2.Notify(message);
        }
        else {
            colleague1.Notify(message);
        }

    }
}
