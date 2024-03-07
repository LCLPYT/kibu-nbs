package work.lclpnet.kibu.nbs.api;

import net.minecraft.sound.SoundEvent;
import org.jetbrains.annotations.Nullable;
import work.lclpnet.kibu.nbs.data.CustomInstrument;

public interface InstrumentSoundProvider {

    @Nullable
    SoundEvent getVanillaInstrumentSound(byte instrument);

    @Nullable
    SoundEvent getCustomInstrumentSound(CustomInstrument instrument);
}