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
                .addMedia(
                    TwitterConfigurationDto.Media.builder()
                        .url("url")
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(twitterConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(twitterConfigurationDto.media())
            .containsExactly(
                TwitterConfigurationDto.Media.builder()
                    .url("url")
                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val twitterConfigurationDto =
            TwitterConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addMedia(
                    TwitterConfigurationDto.Media.builder()
                        .url("url")
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedTwitterConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(twitterConfigurationDto),
                jacksonTypeRef<TwitterConfigurationDto>(),
            )

        assertThat(roundtrippedTwitterConfigurationDto).isEqualTo(twitterConfigurationDto)
    }
}
