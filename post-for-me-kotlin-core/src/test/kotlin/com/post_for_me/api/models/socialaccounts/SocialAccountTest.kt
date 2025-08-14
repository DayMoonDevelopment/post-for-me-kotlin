// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountTest {

    @Test
    fun create() {
        val socialAccount =
            SocialAccount.builder()
                .id("id")
                .accessToken("access_token")
                .accessTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .platform("platform")
                .refreshToken("refresh_token")
                .refreshTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SocialAccount.Status.CONNECTED)
                .userId("user_id")
                .username("username")
                .build()

        assertThat(socialAccount.id()).isEqualTo("id")
        assertThat(socialAccount.accessToken()).isEqualTo("access_token")
        assertThat(socialAccount.accessTokenExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(socialAccount.externalId()).isEqualTo("external_id")
        assertThat(socialAccount._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(socialAccount.platform()).isEqualTo("platform")
        assertThat(socialAccount.refreshToken()).isEqualTo("refresh_token")
        assertThat(socialAccount.refreshTokenExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(socialAccount.status()).isEqualTo(SocialAccount.Status.CONNECTED)
        assertThat(socialAccount.userId()).isEqualTo("user_id")
        assertThat(socialAccount.username()).isEqualTo("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialAccount =
            SocialAccount.builder()
                .id("id")
                .accessToken("access_token")
                .accessTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .platform("platform")
                .refreshToken("refresh_token")
                .refreshTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SocialAccount.Status.CONNECTED)
                .userId("user_id")
                .username("username")
                .build()

        val roundtrippedSocialAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialAccount),
                jacksonTypeRef<SocialAccount>(),
            )

        assertThat(roundtrippedSocialAccount).isEqualTo(socialAccount)
    }
}
