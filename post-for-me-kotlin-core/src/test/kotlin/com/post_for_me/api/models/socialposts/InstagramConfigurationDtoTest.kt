// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstagramConfigurationDtoTest {

    @Test
    fun create() {
        val instagramConfigurationDto =
            InstagramConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addCollaborator("string")
                .addMedia("string")
                .placement(InstagramConfigurationDto.Placement.REELS)
                .build()

        assertThat(instagramConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(instagramConfigurationDto.collaborators()).containsExactly("string")
        assertThat(instagramConfigurationDto.media()).containsExactly("string")
        assertThat(instagramConfigurationDto.placement())
            .isEqualTo(InstagramConfigurationDto.Placement.REELS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instagramConfigurationDto =
            InstagramConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addCollaborator("string")
                .addMedia("string")
                .placement(InstagramConfigurationDto.Placement.REELS)
                .build()

        val roundtrippedInstagramConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instagramConfigurationDto),
                jacksonTypeRef<InstagramConfigurationDto>(),
            )

        assertThat(roundtrippedInstagramConfigurationDto).isEqualTo(instagramConfigurationDto)
    }
}
