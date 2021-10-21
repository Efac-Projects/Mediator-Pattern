package ChatRoom;


public class Program {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Participant Thilina = new Male("Thilina");
        Participant Thilini = new Female("Thilini");
        Participant Sahanaka = new Male("Sahanaka");
        Participant Hasitha = new Male("Hasitha");
        Participant Paul = new Male("Dammika");

        chatRoom.Register(Thilina);
        chatRoom.Register(Paul);
        chatRoom.Register(Sahanaka);
        chatRoom.Register(Hasitha);
        chatRoom.Register(Thilini);

        Thilini.Send("Hasitha", "Hi Hasitha!");
        Thilina.Send("Sahanaka", "Hi Sahanaka! How are you!");
        Sahanaka.Send("Thilina", "Hi Thilina!");
        Paul.Send("Hasitha", "Hi everyone!");
        Hasitha.Send("Thilina", "My homies in one place!!");
    }
}
