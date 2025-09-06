// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkedinConfigurationDtoTest {

    @Test
    fun create() {
        val linkedinConfigurationDto =
            LinkedinConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addMedia(
                    LinkedinConfigurationDto.Media.builder()
                        .url("url")
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(linkedinConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(linkedinConfigurationDto.media())
            .containsExactly(
                LinkedinConfigurationDto.Media.builder()
                    .url("url")
                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkedinConfigurationDto =
            LinkedinConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addMedia(
                    LinkedinConfigurationDto.Media.builder()
                        .url("url")
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedLinkedinConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkedinConfigurationDto),
                jacksonTypeRef<LinkedinConfigurationDto>(),
            )

        assertThat(roundtrippedLinkedinConfigurationDto).isEqualTo(linkedinConfigurationDto)
    }
}
