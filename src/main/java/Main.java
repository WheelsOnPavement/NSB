import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.EventListener;
import java.util.Properties;

public class Main implements EventListener{

    public static void main(String[] args) throws LoginException, InterruptedException, RateLimitedException {

        // generate a config file
        Properties prop = new Properties();
        OutputStream output = null;

        // load token from config
        Settings settings = new Settings();
        String token = settings.getToken();

        System.out.println("Token received: " + token);

        JDA jda = new JDABuilder(AccountType.BOT).setToken(token).buildBlocking();
        jda.getPresence().setGame(Game.of("Patrick"));
        jda.addEventListener(new Commands());
        jda.addEventListener(new Main());


        //System.out.println("Hello world");



    }

}