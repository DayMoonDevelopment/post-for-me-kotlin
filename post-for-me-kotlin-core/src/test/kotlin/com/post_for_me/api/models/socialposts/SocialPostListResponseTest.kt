// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostListResponseTest {

    @Test
    fun create() {
        val socialPostListResponse =
            SocialPostListResponse.builder()
                .addData(
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
                )
                .meta(
                    SocialPostListResponse.Meta.builder()
                        .limit(0.0)
                        .next("https://api.postforme.dev/v1/items?offset=10&limit=10")
                        .offset(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        assertThat(socialPostListResponse.data())
            .containsExactly(
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
            )
        assertThat(socialPostListResponse.meta())
            .isEqualTo(
                SocialPostListResponse.Meta.builder()
                    .limit(0.0)
                    .next("https://api.postforme.dev/v1/items?offset=10&limit=10")
                    .offset(0.0)
                    .total(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialPostListResponse =
            SocialPostListResponse.builder()
                .addData(
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
                )
                .meta(
                    SocialPostListResponse.Meta.builder()
                        .limit(0.0)
                        .next("https://api.postforme.dev/v1/items?offset=10&limit=10")
                        .offset(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        val roundtrippedSocialPostListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialPostListResponse),
                jacksonTypeRef<SocialPostListResponse>(),
            )

        assertThat(roundtrippedSocialPostListResponse).isEqualTo(socialPostListResponse)
    }
}
