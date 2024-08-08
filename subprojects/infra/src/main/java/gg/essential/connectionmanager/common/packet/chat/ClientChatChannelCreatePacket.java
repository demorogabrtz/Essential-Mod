/*
 * Copyright (c) 2024 ModCore Inc. All rights reserved.
 *
 * This code is part of ModCore Inc.'s Essential Mod repository and is protected
 * under copyright registration # TX0009138511. For the full license, see:
 * https://github.com/EssentialGG/Essential/blob/main/LICENSE
 *
 * You may not use, copy, reproduce, modify, sell, license, distribute,
 * commercialize, or otherwise exploit, or create derivative works based
 * upon, this file or any other in this repository, all of which is reserved by Essential.
 */
package gg.essential.connectionmanager.common.packet.chat;

import gg.essential.lib.gson.annotations.SerializedName;
import com.sparkuniverse.toolbox.chat.enums.ChannelType;
import gg.essential.connectionmanager.common.packet.Packet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class ClientChatChannelCreatePacket extends Packet {

    @SerializedName("a")
    @NotNull
    private final ChannelType type;

    @SerializedName("b")
    @Nullable
    private final String name;

    @SerializedName("c")
    @NotNull
    private final UUID[] members;

    public ClientChatChannelCreatePacket(
            @NotNull final ChannelType type, @Nullable final String name, @NotNull final UUID[] members
    ) {
        this.type = type;
        this.name = name;
        this.members = members;
    }

    @NotNull
    public ChannelType getType() {
        return this.type;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    @NotNull
    public UUID[] getMembers() {
        return this.members;
    }

}