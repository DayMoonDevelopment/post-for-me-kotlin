// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountListResponseTest {

    @Test
    fun create() {
        val socialAccountListResponse =
            SocialAccountListResponse.builder()
                .addData(
                    SocialAccount.builder()
                        .id("id")
                        .externalId("external_id")
                        .platform("platform")
                        .status(SocialAccount.Status.CONNECTED)
                        .username("username")
                        .build()
                )
                .meta(
                    SocialAccountListResponse.Meta.builder()
                        .limit(0.0)
                        .next("https://api.postforme.dev/v1/items?offset=10&limit=10")
                        .offset(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        assertThat(socialAccountListResponse.data())
            .containsExactly(
                SocialAccount.builder()
                    .id("id")
                    .externalId("external_id")
                    .platform("platform")
                    .status(SocialAccount.Status.CONNECTED)
                    .username("username")
                    .build()
            )
        assertThat(socialAccountListResponse.meta())
            .isEqualTo(
                SocialAccountListResponse.Meta.builder()
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
        val socialAccountListResponse =
            SocialAccountListResponse.builder()
                .addData(
                    SocialAccount.builder()
                        .id("id")
                        .externalId("external_id")
                        .platform("platform")
                        .status(SocialAccount.Status.CONNECTED)
                        .username("username")
                        .build()
                )
                .meta(
                    SocialAccountListResponse.Meta.builder()
                        .limit(0.0)
                        .next("https://api.postforme.dev/v1/items?offset=10&limit=10")
                        .offset(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        val roundtrippedSocialAccountListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialAccountListResponse),
                jacksonTypeRef<SocialAccountListResponse>(),
            )

        assertThat(roundtrippedSocialAccountListResponse).isEqualTo(socialAccountListResponse)
    }
}
