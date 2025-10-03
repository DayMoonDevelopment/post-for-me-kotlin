// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FacebookConfigurationDtoTest {

    @Test
    fun create() {
        val facebookConfigurationDto =
            FacebookConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addCollaborator(listOf(JsonValue.from(mapOf<String, Any>())))
                .location("location")
                .addMedia(
                    FacebookConfigurationDto.Media.builder()
                        .url("url")
                        .addTag(
                            FacebookConfigurationDto.Media.Tag.builder()
                                .id("id")
                                .platform(FacebookConfigurationDto.Media.Tag.Platform.FACEBOOK)
                                .type(FacebookConfigurationDto.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .placement(FacebookConfigurationDto.Placement.REELS)
                .build()

        assertThat(facebookConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(facebookConfigurationDto.collaborators())
            .containsExactly(listOf(JsonValue.from(mapOf<String, Any>())))
        assertThat(facebookConfigurationDto.location()).isEqualTo("location")
        assertThat(facebookConfigurationDto.media())
            .containsExactly(
                FacebookConfigurationDto.Media.builder()
                    .url("url")
                    .addTag(
                        FacebookConfigurationDto.Media.Tag.builder()
                            .id("id")
                            .platform(FacebookConfigurationDto.Media.Tag.Platform.FACEBOOK)
                            .type(FacebookConfigurationDto.Media.Tag.Type.USER)
                            .x(0.0)
                            .y(0.0)
                            .build()
                    )
                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(facebookConfigurationDto.placement())
            .isEqualTo(FacebookConfigurationDto.Placement.REELS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val facebookConfigurationDto =
            FacebookConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addCollaborator(listOf(JsonValue.from(mapOf<String, Any>())))
                .location("location")
                .addMedia(
                    FacebookConfigurationDto.Media.builder()
                        .url("url")
                        .addTag(
                            FacebookConfigurationDto.Media.Tag.builder()
                                .id("id")
                                .platform(FacebookConfigurationDto.Media.Tag.Platform.FACEBOOK)
                                .type(FacebookConfigurationDto.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .placement(FacebookConfigurationDto.Placement.REELS)
                .build()

        val roundtrippedFacebookConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(facebookConfigurationDto),
                jacksonTypeRef<FacebookConfigurationDto>(),
            )

        assertThat(roundtrippedFacebookConfigurationDto).isEqualTo(facebookConfigurationDto)
    }
}
