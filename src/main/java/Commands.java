import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{
    private static final String CMD_PREFIX = "!";

    //@Override
    public void onMessageReceived(MessageReceivedEvent e){
        String[] command = e.getMessage().getContent().split(" ");

        Message msg = e.getMessage();
        MessageChannel channel = e.getTextChannel();
        User user = e.getAuthor();

        if(!command[0].startsWith(CMD_PREFIX)){
            return;
        }else if(command[0].equalsIgnoreCase("!ping")){

            String returnMsg = "Pong!";
            channel.sendMessage(returnMsg).queue();

        }

    }

}
