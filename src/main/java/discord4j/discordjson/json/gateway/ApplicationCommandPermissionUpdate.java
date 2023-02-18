package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.ApplicationCommandPermissionsData;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandPermissionUpdate.class)
@JsonDeserialize(as = ImmutableApplicationCommandPermissionUpdate.class)
public interface ApplicationCommandPermissionUpdate extends Dispatch {

    static ImmutableApplicationCommandPermissionUpdate.Builder builder() {
        return ImmutableApplicationCommandPermissionUpdate.builder();
    }

    @JsonProperty("id")
    Id commandId();

    @JsonProperty("application_id")
    Id applicationId();

    @JsonProperty("guild_id")
    Id guildId();

    List<ApplicationCommandPermissionsData> permissions();
}
