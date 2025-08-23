// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadsConfigurationDtoTest {

    @Test
    fun create() {
        val threadsConfigurationDto =
            ThreadsConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addMedia("string")
                .placement(ThreadsConfigurationDto.Placement.REELS)
                .build()

        assertThat(threadsConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(threadsConfigurationDto.media()).containsExactly("string")
        assertThat(threadsConfigurationDto.placement())
            .isEqualTo(ThreadsConfigurationDto.Placement.REELS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadsConfigurationDto =
            ThreadsConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addMedia("string")
                .placement(ThreadsConfigurationDto.Placement.REELS)
                .build()

        val roundtrippedThreadsConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadsConfigurationDto),
                jacksonTypeRef<ThreadsConfigurationDto>(),
            )

        assertThat(roundtrippedThreadsConfigurationDto).isEqualTo(threadsConfigurationDto)
    }
}
