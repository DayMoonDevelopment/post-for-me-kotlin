// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialpostresults

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostResultListResponseTest {

    @Test
    fun create() {
        val socialPostResultListResponse =
            SocialPostResultListResponse.builder()
                .addData(
                    SocialPostResult.builder()
                        .id("id")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .error(JsonValue.from(mapOf<String, Any>()))
                        .platformData(
                            SocialPostResult.PlatformData.builder().id("id").url("url").build()
                        )
                        .postId("post_id")
                        .socialAccountId("social_account_id")
                        .success(true)
                        .build()
                )
                .meta(
                    SocialPostResultListResponse.Meta.builder()
                        .limit(0.0)
                        .next("https://api.postforme.dev/v1/items?offset=10&limit=10")
                        .offset(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        assertThat(socialPostResultListResponse.data())
            .containsExactly(
                SocialPostResult.builder()
                    .id("id")
                    .details(JsonValue.from(mapOf<String, Any>()))
                    .error(JsonValue.from(mapOf<String, Any>()))
                    .platformData(
                        SocialPostResult.PlatformData.builder().id("id").url("url").build()
                    )
                    .postId("post_id")
                    .socialAccountId("social_account_id")
                    .success(true)
                    .build()
            )
        assertThat(socialPostResultListResponse.meta())
            .isEqualTo(
                SocialPostResultListResponse.Meta.builder()
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
        val socialPostResultListResponse =
            SocialPostResultListResponse.builder()
                .addData(
                    SocialPostResult.builder()
                        .id("id")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .error(JsonValue.from(mapOf<String, Any>()))
                        .platformData(
                            SocialPostResult.PlatformData.builder().id("id").url("url").build()
                        )
                        .postId("post_id")
                        .socialAccountId("social_account_id")
                        .success(true)
                        .build()
                )
                .meta(
                    SocialPostResultListResponse.Meta.builder()
                        .limit(0.0)
                        .next("https://api.postforme.dev/v1/items?offset=10&limit=10")
                        .offset(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        val roundtrippedSocialPostResultListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialPostResultListResponse),
                jacksonTypeRef<SocialPostResultListResponse>(),
            )

        assertThat(roundtrippedSocialPostResultListResponse).isEqualTo(socialPostResultListResponse)
    }
}
