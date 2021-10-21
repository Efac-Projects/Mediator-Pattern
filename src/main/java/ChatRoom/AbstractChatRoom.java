package ChatRoom;

import java.util.HashMap;

abstract class AbstractChatRoom {
    public abstract void Register(Participant participant);
    public abstract void Send (String from, String to, String message);
}

class ChatRoom extends AbstractChatRoom {

    private HashMap<String,Participant> participants = new HashMap<>();
    @Override
    public void Register(Participant participant) {
        if(!participants.containsValue(participant)) {
            participants.put(participant.Name,participant);
        }
        participant.setAbstractChatRoom(this);
    }

    @Override
    public void Send(String from, String to, String message) {
        Participant participant = participants.get(to);

        if(participant != null) {
            participant.Receive(from, message);
            participant.Notify(from);
        }
    }
}