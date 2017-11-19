package BidenBot;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.track.playback.AudioFrame;
import net.dv8tion.jda.core.audio.AudioSendHandler;

public class AudioPlayerSendHandler implements AudioSendHandler{
    private final AudioPlayer aPlayer;
    private AudioFrame lastFrame;

    public AudioPlayerSendHandler(AudioPlayer aPlayer) {
        this.aPlayer = aPlayer;
    }

    // @Override
    public boolean canProvide() {
        lastFrame = aPlayer.provide();
        return lastFrame != null;
    }

    // @Override
    public byte[] provide20MsAudio() {
        return lastFrame.data;
    }

    public boolean isOpus() {
        return true;
    }
}
