package ru.tinkoff.bot.dto.response;

import lombok.NonNull;

import java.time.OffsetDateTime;

public record GitHubResponse(@NonNull String full_name,
                             @NonNull String language,
                             @NonNull OffsetDateTime updated_at,
                             @NonNull OffsetDateTime pushed_at) {
}
