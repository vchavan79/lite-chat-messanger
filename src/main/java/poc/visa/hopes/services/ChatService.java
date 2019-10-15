package poc.visa.hopes.services;

import poc.visa.hopes.domain.ChateMessage;

public class ChatService {
    public void sendMessage(ChateMessage chateMessage)
    {
        System.out.println("message sent");
    }
    public void receiveMessage()
    {
        System.out.println("message received");
    }
}

