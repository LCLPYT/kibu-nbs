package work.lclpnet.notica.network.packet;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import work.lclpnet.notica.NoticaInit;
import work.lclpnet.notica.api.PlayerConfig;
import work.lclpnet.notica.network.NoticaPacketCodecs;

public record MusicOptionsS2CPacket(PlayerConfig config) implements CustomPayload {

    public static final Id<MusicOptionsS2CPacket> ID = new Id<>(NoticaInit.identifier("options"));

    public static PacketCodec<PacketByteBuf, MusicOptionsS2CPacket> CODEC = PacketCodec.tuple(
            NoticaPacketCodecs.PLAYER_CONFIG_PACKET_CODEC, MusicOptionsS2CPacket::config,
            MusicOptionsS2CPacket::new);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
