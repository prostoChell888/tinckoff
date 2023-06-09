package ru.tinkoff.bot.dto.response.stackOverflowe;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public record StackOverFlowResponse(
        String title,
        String[] tags,
        @JsonProperty("is_answered")
        boolean isAnswered,
        @JsonProperty("view_count")
        int viewCount,
        @JsonProperty("creation_date")
        OffsetDateTime creationDate,
        String link
        ) {}
