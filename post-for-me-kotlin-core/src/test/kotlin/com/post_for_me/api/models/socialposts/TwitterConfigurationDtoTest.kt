// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TwitterConfigurationDtoTest {

    @Test
    fun create() {
        val twitterConfigurationDto =
            TwitterConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .communityId("community_id")
                .addMedia(
                    TwitterConfigurationDto.Media.builder()
                        .url("url")
                        .skipProcessing(true)
                        .addTag(
                            TwitterConfigurationDto.Media.Tag.builder()
                                .id("id")
                                .platform(TwitterConfigurationDto.Media.Tag.Platform.FACEBOOK)
                                .type(TwitterConfigurationDto.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .poll(
                    TwitterConfigurationDto.Poll.builder()
                        .durationMinutes(0.0)
                        .addOption("string")
                        .replySettings(TwitterConfigurationDto.Poll.ReplySettings.FOLLOWING)
                        .build()
                )
                .quoteTweetId("quote_tweet_id")
                .replySettings(TwitterConfigurationDto.ReplySettings.FOLLOWING)
                .build()

        assertThat(twitterConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(twitterConfigurationDto.communityId()).isEqualTo("community_id")
        assertThat(twitterConfigurationDto.media())
            .containsExactly(
                TwitterConfigurationDto.Media.builder()
                    .url("url")
                    .skipProcessing(true)
                    .addTag(
                        TwitterConfigurationDto.Media.Tag.builder()
                            .id("id")
                            .platform(TwitterConfigurationDto.Media.Tag.Platform.FACEBOOK)
                            .type(TwitterConfigurationDto.Media.Tag.Type.USER)
                            .x(0.0)
                            .y(0.0)
                            .build()
                    )
                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(twitterConfigurationDto.poll())
            .isEqualTo(
                TwitterConfigurationDto.Poll.builder()
                    .durationMinutes(0.0)
                    .addOption("string")
                    .replySettings(TwitterConfigurationDto.Poll.ReplySettings.FOLLOWING)
                    .build()
            )
        assertThat(twitterConfigurationDto.quoteTweetId()).isEqualTo("quote_tweet_id")
        assertThat(twitterConfigurationDto.replySettings())
            .isEqualTo(TwitterConfigurationDto.ReplySettings.FOLLOWING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val twitterConfigurationDto =
            TwitterConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .communityId("community_id")
                .addMedia(
                    TwitterConfigurationDto.Media.builder()
                        .url("url")
                        .skipProcessing(true)
                        .addTag(
                            TwitterConfigurationDto.Media.Tag.builder()
                                .id("id")
                                .platform(TwitterConfigurationDto.Media.Tag.Platform.FACEBOOK)
                                .type(TwitterConfigurationDto.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .poll(
                    TwitterConfigurationDto.Poll.builder()
                        .durationMinutes(0.0)
                        .addOption("string")
                        .replySettings(TwitterConfigurationDto.Poll.ReplySettings.FOLLOWING)
                        .build()
                )
                .quoteTweetId("quote_tweet_id")
                .replySettings(TwitterConfigurationDto.ReplySettings.FOLLOWING)
                .build()

        val roundtrippedTwitterConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(twitterConfigurationDto),
                jacksonTypeRef<TwitterConfigurationDto>(),
            )

        assertThat(roundtrippedTwitterConfigurationDto).isEqualTo(twitterConfigurationDto)
    }
}
