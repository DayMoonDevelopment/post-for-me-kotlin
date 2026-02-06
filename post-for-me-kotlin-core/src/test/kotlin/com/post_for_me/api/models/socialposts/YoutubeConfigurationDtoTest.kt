// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class YoutubeConfigurationDtoTest {

    @Test
    fun create() {
        val youtubeConfigurationDto =
            YoutubeConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .madeForKids(true)
                .addMedia(
                    YoutubeConfigurationDto.Media.builder()
                        .url("url")
                        .skipProcessing(true)
                        .addTag(
                            YoutubeConfigurationDto.Media.Tag.builder()
                                .id("id")
                                .platform(YoutubeConfigurationDto.Media.Tag.Platform.FACEBOOK)
                                .type(YoutubeConfigurationDto.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .privacyStatus(YoutubeConfigurationDto.PrivacyStatus.PUBLIC)
                .title("title")
                .build()

        assertThat(youtubeConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(youtubeConfigurationDto.madeForKids()).isEqualTo(true)
        assertThat(youtubeConfigurationDto.media())
            .containsExactly(
                YoutubeConfigurationDto.Media.builder()
                    .url("url")
                    .skipProcessing(true)
                    .addTag(
                        YoutubeConfigurationDto.Media.Tag.builder()
                            .id("id")
                            .platform(YoutubeConfigurationDto.Media.Tag.Platform.FACEBOOK)
                            .type(YoutubeConfigurationDto.Media.Tag.Type.USER)
                            .x(0.0)
                            .y(0.0)
                            .build()
                    )
                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(youtubeConfigurationDto.privacyStatus())
            .isEqualTo(YoutubeConfigurationDto.PrivacyStatus.PUBLIC)
        assertThat(youtubeConfigurationDto.title()).isEqualTo("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val youtubeConfigurationDto =
            YoutubeConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .madeForKids(true)
                .addMedia(
                    YoutubeConfigurationDto.Media.builder()
                        .url("url")
                        .skipProcessing(true)
                        .addTag(
                            YoutubeConfigurationDto.Media.Tag.builder()
                                .id("id")
                                .platform(YoutubeConfigurationDto.Media.Tag.Platform.FACEBOOK)
                                .type(YoutubeConfigurationDto.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .privacyStatus(YoutubeConfigurationDto.PrivacyStatus.PUBLIC)
                .title("title")
                .build()

        val roundtrippedYoutubeConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(youtubeConfigurationDto),
                jacksonTypeRef<YoutubeConfigurationDto>(),
            )

        assertThat(roundtrippedYoutubeConfigurationDto).isEqualTo(youtubeConfigurationDto)
    }
}
