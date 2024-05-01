package work.lclpnet.notica.network.packet;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import work.lclpnet.notica.NoticaInit;

public record RequestSongC2SPacket(Identifier songId, int tickOffset, int layerOffset) implements CustomPayload {

    public static final Id<RequestSongC2SPacket> ID = new Id<>(NoticaInit.identifier("request"));

    public static final PacketCodec<PacketByteBuf, RequestSongC2SPacket> CODEC = PacketCodec.tuple(
            Identifier.PACKET_CODEC, RequestSongC2SPacket::songId,
            PacketCodecs.VAR_INT, RequestSongC2SPacket::tickOffset,
            PacketCodecs.VAR_INT, RequestSongC2SPacket::layerOffset,
            RequestSongC2SPacket::new);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
