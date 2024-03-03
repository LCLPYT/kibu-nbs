package work.lclpnet.kibu.nbs.data;

import java.util.Map;

public record Song(short durationTicks, float ticksPerSecond, SongMeta metaData, LoopConfig loopConfig,
                   Map<Integer, Layer> layers, Instruments instruments) {

    public float durationSeconds() {
        return durationTicks / ticksPerSecond;
    }
}