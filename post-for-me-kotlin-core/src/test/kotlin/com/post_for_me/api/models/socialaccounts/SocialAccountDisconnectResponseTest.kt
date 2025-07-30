// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountDisconnectResponseTest {

    @Test
    fun create() {
        val socialAccountDisconnectResponse =
            SocialAccountDisconnectResponse.builder()
                .id("id")
                .externalId("external_id")
                .platform("platform")
                .status(SocialAccountDisconnectResponse.Status.DISCONNECTED)
                .username("username")
                .build()

        assertThat(socialAccountDisconnectResponse.id()).isEqualTo("id")
        assertThat(socialAccountDisconnectResponse.externalId()).isEqualTo("external_id")
        assertThat(socialAccountDisconnectResponse.platform()).isEqualTo("platform")
        assertThat(socialAccountDisconnectResponse.status())
            .isEqualTo(SocialAccountDisconnectResponse.Status.DISCONNECTED)
        assertThat(socialAccountDisconnectResponse.username()).isEqualTo("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialAccountDisconnectResponse =
            SocialAccountDisconnectResponse.builder()
                .id("id")
                .externalId("external_id")
                .platform("platform")
                .status(SocialAccountDisconnectResponse.Status.DISCONNECTED)
                .username("username")
                .build()

        val roundtrippedSocialAccountDisconnectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialAccountDisconnectResponse),
                jacksonTypeRef<SocialAccountDisconnectResponse>(),
            )

        assertThat(roundtrippedSocialAccountDisconnectResponse)
            .isEqualTo(socialAccountDisconnectResponse)
    }
}
