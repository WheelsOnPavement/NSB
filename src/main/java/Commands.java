import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;

public class Commands extends ListenerAdapter{
    private static final String CMD_PREFIX = "!";

    @Override
    public void onMessageReceived(MessageReceivedEvent e){
        String[] command = e.getMessage().getContent().split(" ");

        Message msg = e.getMessage();
        MessageChannel channel = e.getTextChannel();
        User user = e.getAuthor();

        if(!command[0].startsWith(CMD_PREFIX)){
            return;
        }else if(command[0].equalsIgnoreCase("!ping")){
            String returnMsg = "Pong! " + e.getJDA().getPing() + " ms";

            if(command.length == 1){
                e.getChannel().sendMessage(returnMsg).queue();
            }
            else if(command.length == 2 && command[1].equalsIgnoreCase("-e")){
                EmbedBuilder eb = new EmbedBuilder();
                eb.setColor(Color.RED);
                eb.setDescription(returnMsg);
                e.getChannel().sendMessage(eb.build()).queue();
            }
        }


    }

}
