// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostTest {

    @Test
    fun create() {
        val socialPost =
            SocialPost.builder()
                .id("id")
                .addAccountConfiguration(JsonValue.from(mapOf<String, Any>()))
                .caption("caption")
                .createdAt("created_at")
                .externalId("external_id")
                .media(JsonValue.from(mapOf<String, Any>()))
                .platformConfigurations(JsonValue.from(mapOf<String, Any>()))
                .scheduledAt("scheduled_at")
                .addSocialAccount("string")
                .status(SocialPost.Status.DRAFT)
                .updatedAt("updated_at")
                .build()

        assertThat(socialPost.id()).isEqualTo("id")
        assertThat(socialPost.accountConfigurations())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(socialPost.caption()).isEqualTo("caption")
        assertThat(socialPost.createdAt()).isEqualTo("created_at")
        assertThat(socialPost.externalId()).isEqualTo("external_id")
        assertThat(socialPost._media()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(socialPost._platformConfigurations())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(socialPost.scheduledAt()).isEqualTo("scheduled_at")
        assertThat(socialPost.socialAccounts()).containsExactly("string")
        assertThat(socialPost.status()).isEqualTo(SocialPost.Status.DRAFT)
        assertThat(socialPost.updatedAt()).isEqualTo("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialPost =
            SocialPost.builder()
                .id("id")
                .addAccountConfiguration(JsonValue.from(mapOf<String, Any>()))
                .caption("caption")
                .createdAt("created_at")
                .externalId("external_id")
                .media(JsonValue.from(mapOf<String, Any>()))
                .platformConfigurations(JsonValue.from(mapOf<String, Any>()))
                .scheduledAt("scheduled_at")
                .addSocialAccount("string")
                .status(SocialPost.Status.DRAFT)
                .updatedAt("updated_at")
                .build()

        val roundtrippedSocialPost =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialPost),
                jacksonTypeRef<SocialPost>(),
            )

        assertThat(roundtrippedSocialPost).isEqualTo(socialPost)
    }
}
