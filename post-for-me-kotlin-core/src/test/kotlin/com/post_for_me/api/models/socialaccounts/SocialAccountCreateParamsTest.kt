// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.post_for_me.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountCreateParamsTest {

    @Test
    fun create() {
        SocialAccountCreateParams.builder()
            .accessToken("access_token")
            .accessTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .platform(SocialAccountCreateParams.Platform.FACEBOOK)
            .userId("user_id")
            .externalId("external_id")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .refreshToken("refresh_token")
            .refreshTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .username("username")
            .build()
    }

    @Test
    fun body() {
        val params =
            SocialAccountCreateParams.builder()
                .accessToken("access_token")
                .accessTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .platform(SocialAccountCreateParams.Platform.FACEBOOK)
                .userId("user_id")
                .externalId("external_id")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .refreshToken("refresh_token")
                .refreshTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        val body = params._body()

        assertThat(body.accessToken()).isEqualTo("access_token")
        assertThat(body.accessTokenExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.platform()).isEqualTo(SocialAccountCreateParams.Platform.FACEBOOK)
        assertThat(body.userId()).isEqualTo("user_id")
        assertThat(body.externalId()).isEqualTo("external_id")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.refreshToken()).isEqualTo("refresh_token")
        assertThat(body.refreshTokenExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.username()).isEqualTo("username")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SocialAccountCreateParams.builder()
                .accessToken("access_token")
                .accessTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .platform(SocialAccountCreateParams.Platform.FACEBOOK)
                .userId("user_id")
                .build()

        val body = params._body()

        assertThat(body.accessToken()).isEqualTo("access_token")
        assertThat(body.accessTokenExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.platform()).isEqualTo(SocialAccountCreateParams.Platform.FACEBOOK)
        assertThat(body.userId()).isEqualTo("user_id")
    }
}
