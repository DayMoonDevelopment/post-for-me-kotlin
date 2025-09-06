// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PinterestConfigurationDtoTest {

    @Test
    fun create() {
        val pinterestConfigurationDto =
            PinterestConfigurationDto.builder()
                .addBoardId("string")
                .caption(JsonValue.from(mapOf<String, Any>()))
                .link("link")
                .addMedia(
                    PinterestConfigurationDto.Media.builder()
                        .url("url")
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(pinterestConfigurationDto.boardIds()).containsExactly("string")
        assertThat(pinterestConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(pinterestConfigurationDto.link()).isEqualTo("link")
        assertThat(pinterestConfigurationDto.media())
            .containsExactly(
                PinterestConfigurationDto.Media.builder()
                    .url("url")
                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pinterestConfigurationDto =
            PinterestConfigurationDto.builder()
                .addBoardId("string")
                .caption(JsonValue.from(mapOf<String, Any>()))
                .link("link")
                .addMedia(
                    PinterestConfigurationDto.Media.builder()
                        .url("url")
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedPinterestConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pinterestConfigurationDto),
                jacksonTypeRef<PinterestConfigurationDto>(),
            )

        assertThat(roundtrippedPinterestConfigurationDto).isEqualTo(pinterestConfigurationDto)
    }
}
