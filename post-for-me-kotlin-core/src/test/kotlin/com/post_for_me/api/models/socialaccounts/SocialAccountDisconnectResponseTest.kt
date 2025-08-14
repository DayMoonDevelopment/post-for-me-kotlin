// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountDisconnectResponseTest {

    @Test
    fun create() {
        val socialAccountDisconnectResponse =
            SocialAccountDisconnectResponse.builder()
                .id("id")
                .accessToken("access_token")
                .accessTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .platform("platform")
                .refreshToken("refresh_token")
                .refreshTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SocialAccountDisconnectResponse.Status.DISCONNECTED)
                .userId("user_id")
                .username("username")
                .build()

        assertThat(socialAccountDisconnectResponse.id()).isEqualTo("id")
        assertThat(socialAccountDisconnectResponse.accessToken()).isEqualTo("access_token")
        assertThat(socialAccountDisconnectResponse.accessTokenExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(socialAccountDisconnectResponse.externalId()).isEqualTo("external_id")
        assertThat(socialAccountDisconnectResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(socialAccountDisconnectResponse.platform()).isEqualTo("platform")
        assertThat(socialAccountDisconnectResponse.refreshToken()).isEqualTo("refresh_token")
        assertThat(socialAccountDisconnectResponse.refreshTokenExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(socialAccountDisconnectResponse.status())
            .isEqualTo(SocialAccountDisconnectResponse.Status.DISCONNECTED)
        assertThat(socialAccountDisconnectResponse.userId()).isEqualTo("user_id")
        assertThat(socialAccountDisconnectResponse.username()).isEqualTo("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialAccountDisconnectResponse =
            SocialAccountDisconnectResponse.builder()
                .id("id")
                .accessToken("access_token")
                .accessTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .platform("platform")
                .refreshToken("refresh_token")
                .refreshTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SocialAccountDisconnectResponse.Status.DISCONNECTED)
                .userId("user_id")
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
