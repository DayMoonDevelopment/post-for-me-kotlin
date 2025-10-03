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
                .location("location")
                .addMedia(
                    InstagramConfigurationDto.Media.builder()
                        .url("url")
                        .addTag(
                            InstagramConfigurationDto.Media.Tag.builder()
                                .id("id")
                                .platform(InstagramConfigurationDto.Media.Tag.Platform.FACEBOOK)
                                .type(InstagramConfigurationDto.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .placement(InstagramConfigurationDto.Placement.REELS)
                .shareToFeed(true)
                .build()

        assertThat(instagramConfigurationDto._caption())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(instagramConfigurationDto.collaborators()).containsExactly("string")
        assertThat(instagramConfigurationDto.location()).isEqualTo("location")
        assertThat(instagramConfigurationDto.media())
            .containsExactly(
                InstagramConfigurationDto.Media.builder()
                    .url("url")
                    .addTag(
                        InstagramConfigurationDto.Media.Tag.builder()
                            .id("id")
                            .platform(InstagramConfigurationDto.Media.Tag.Platform.FACEBOOK)
                            .type(InstagramConfigurationDto.Media.Tag.Type.USER)
                            .x(0.0)
                            .y(0.0)
                            .build()
                    )
                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(instagramConfigurationDto.placement())
            .isEqualTo(InstagramConfigurationDto.Placement.REELS)
        assertThat(instagramConfigurationDto.shareToFeed()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instagramConfigurationDto =
            InstagramConfigurationDto.builder()
                .caption(JsonValue.from(mapOf<String, Any>()))
                .addCollaborator("string")
                .location("location")
                .addMedia(
                    InstagramConfigurationDto.Media.builder()
                        .url("url")
                        .addTag(
                            InstagramConfigurationDto.Media.Tag.builder()
                                .id("id")
                                .platform(InstagramConfigurationDto.Media.Tag.Platform.FACEBOOK)
                                .type(InstagramConfigurationDto.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .placement(InstagramConfigurationDto.Placement.REELS)
                .shareToFeed(true)
                .build()

        val roundtrippedInstagramConfigurationDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instagramConfigurationDto),
                jacksonTypeRef<InstagramConfigurationDto>(),
            )

        assertThat(roundtrippedInstagramConfigurationDto).isEqualTo(instagramConfigurationDto)
    }
}
