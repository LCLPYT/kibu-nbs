package work.lclpnet.notica.network.packet;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import work.lclpnet.notica.NoticaInit;

public record StopSongBidiPacket(Identifier songId) implements CustomPayload {

    public static final Id<StopSongBidiPacket> ID = new Id<>(NoticaInit.identifier("stop"));

    public static final PacketCodec<PacketByteBuf, StopSongBidiPacket> CODEC = PacketCodec.tuple(
            Identifier.PACKET_CODEC, StopSongBidiPacket::songId,
            StopSongBidiPacket::new);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
