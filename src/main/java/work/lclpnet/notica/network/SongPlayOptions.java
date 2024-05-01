package work.lclpnet.notica.network;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.util.Identifier;

public record SongPlayOptions(Identifier songId, float volume, int startTick) {

    public static final PacketCodec<PacketByteBuf, SongPlayOptions> PACKET_CODEC = PacketCodec.tuple(
            Identifier.PACKET_CODEC, SongPlayOptions::songId,
            PacketCodecs.FLOAT, SongPlayOptions::volume,
            PacketCodecs.INTEGER, SongPlayOptions::startTick,
            SongPlayOptions::new);
}
