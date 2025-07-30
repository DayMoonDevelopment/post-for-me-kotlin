// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialpostresults

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostResultTest {

    @Test
    fun create() {
        val socialPostResult =
            SocialPostResult.builder()
                .id("id")
                .details(JsonValue.from(mapOf<String, Any>()))
                .error(JsonValue.from(mapOf<String, Any>()))
                .platformData(SocialPostResult.PlatformData.builder().id("id").url("url").build())
                .postId("post_id")
                .socialAccountId("social_account_id")
                .success(true)
                .build()

        assertThat(socialPostResult.id()).isEqualTo("id")
        assertThat(socialPostResult._details()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(socialPostResult._error()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(socialPostResult.platformData())
            .isEqualTo(SocialPostResult.PlatformData.builder().id("id").url("url").build())
        assertThat(socialPostResult.postId()).isEqualTo("post_id")
        assertThat(socialPostResult.socialAccountId()).isEqualTo("social_account_id")
        assertThat(socialPostResult.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialPostResult =
            SocialPostResult.builder()
                .id("id")
                .details(JsonValue.from(mapOf<String, Any>()))
                .error(JsonValue.from(mapOf<String, Any>()))
                .platformData(SocialPostResult.PlatformData.builder().id("id").url("url").build())
                .postId("post_id")
                .socialAccountId("social_account_id")
                .success(true)
                .build()

        val roundtrippedSocialPostResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialPostResult),
                jacksonTypeRef<SocialPostResult>(),
            )

        assertThat(roundtrippedSocialPostResult).isEqualTo(socialPostResult)
    }
}
