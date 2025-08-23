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
                .addMedia("string")
                .title("title")
                .build()

        assertThat(youtubeConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(youtubeConfigurationDto.media()).containsExactly("string")
        assertThat(youtubeConfigurationDto.title()).isEqualTo("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val youtubeConfigurationDto =
            YoutubeConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addMedia("string")
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
