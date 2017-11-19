package BidenBot;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;

public class BidenBot {

    public final AudioPlayer player;
    public final TrackScheduler scheduler;

    public BidenBot(AudioPlayerManager manager) {
        player = manager.createPlayer();
        scheduler = new TrackScheduler(player);
        player.addListener(scheduler);
    }

    /**
     *
     * @return Wrapper around AudioPlayer to ues it as an AudioSendHandler.
     */
    public AudioPlayerSendHandler getSendHandler() { return new AudioPlayerSendHandler(player); }

}
