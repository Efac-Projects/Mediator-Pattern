package ChatRoom;

abstract class Participant {
    private String name;

    public String Name;

    public String getName() {
        return Name;
    }

    private AbstractChatRoom abstractChatRoom;

    public void setAbstractChatRoom(AbstractChatRoom abstractChatRoom) {
        this.abstractChatRoom = abstractChatRoom;
    }

    public AbstractChatRoom getAbstractChatRoom() {
        return abstractChatRoom;
    }

    public Participant(String name) {
        this.name = name;
    }
    public void Send(String to , String message) {
        abstractChatRoom.Send(name, to, message);
    }
    public abstract void Receive (String from, String message);
    public abstract void Notify(String from);
}

class Female extends Participant {


    public Female(String name) {
        super(name);
    }

    @Override
    public void Receive(String from, String message) {
        System.out.println(from + " to " + Name + ":" + message);
    }

    @Override
    public void Notify(String from) {
        System.out.println("Woman " + Name + " gets message from: " + from);
    }
}

class Male extends Participant {

    public Male(String name) {
        super(name);
    }

    @Override
    public void Receive(String from, String message) {
        System.out.println(from + " to " + Name + ":" + message);
    }

    @Override
    public void Notify(String from) {
        System.out.println("Man " + Name + " gets message from: " + from);
    }
}
