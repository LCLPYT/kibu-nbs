package work.lclpnet.notica.network.packet;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import work.lclpnet.notica.NoticaInit;
import work.lclpnet.notica.api.SongSlice;
import work.lclpnet.notica.network.NoticaPacketCodecs;

public record RespondSongS2CPacket(Identifier songId, SongSlice slice, boolean last) implements CustomPayload {

    public static final Id<RespondSongS2CPacket> ID = new Id<>(NoticaInit.identifier("respond"));

    public static final PacketCodec<PacketByteBuf, RespondSongS2CPacket> CODEC = PacketCodec.tuple(
            Identifier.PACKET_CODEC, RespondSongS2CPacket::songId,
            NoticaPacketCodecs.SONG_SLICE_PACKET_CODEC, RespondSongS2CPacket::slice,
            PacketCodecs.BOOL, RespondSongS2CPacket::last,
            RespondSongS2CPacket::new);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
