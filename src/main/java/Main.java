import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;
import java.util.EventListener;

public class Main {
    public static void main(String[] args) throws LoginException, InterruptedException, RateLimitedException {
        JDA jda = new JDABuilder(AccountType.BOT).setToken("token").buildBlocking();
        System.out.println("Hello world");
    }
}