// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlueskyConfigurationDtoTest {

    @Test
    fun create() {
        val blueskyConfigurationDto =
            BlueskyConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addMedia("string")
                .build()

        assertThat(blueskyConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(blueskyConfigurationDto.media()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blueskyConfigurationDto =
            BlueskyConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addMedia("string")
                .build()

        val roundtrippedBlueskyConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blueskyConfigurationDto),
                jacksonTypeRef<BlueskyConfigurationDto>(),
            )

        assertThat(roundtrippedBlueskyConfigurationDto).isEqualTo(blueskyConfigurationDto)
    }
}
