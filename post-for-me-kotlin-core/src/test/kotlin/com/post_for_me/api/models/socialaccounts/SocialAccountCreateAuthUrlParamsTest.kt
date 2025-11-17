// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountCreateAuthUrlParamsTest {

    @Test
    fun create() {
        SocialAccountCreateAuthUrlParams.builder()
            .platform("platform")
            .externalId("external_id")
            .platformData(
                SocialAccountCreateAuthUrlParams.PlatformData.builder()
                    .bluesky(
                        SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                            .appPassword("app_password")
                            .handle("handle")
                            .build()
                    )
                    .instagram(
                        SocialAccountCreateAuthUrlParams.PlatformData.Instagram.builder()
                            .connectionType(
                                SocialAccountCreateAuthUrlParams.PlatformData.Instagram
                                    .ConnectionType
                                    .INSTAGRAM
                            )
                            .build()
                    )
                    .linkedin(
                        SocialAccountCreateAuthUrlParams.PlatformData.Linkedin.builder()
                            .connectionType(
                                SocialAccountCreateAuthUrlParams.PlatformData.Linkedin
                                    .ConnectionType
                                    .PERSONAL
                            )
                            .build()
                    )
                    .build()
            )
            .redirectUrlOverride("redirect_url_override")
            .build()
    }

    @Test
    fun body() {
        val params =
            SocialAccountCreateAuthUrlParams.builder()
                .platform("platform")
                .externalId("external_id")
                .platformData(
                    SocialAccountCreateAuthUrlParams.PlatformData.builder()
                        .bluesky(
                            SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                                .appPassword("app_password")
                                .handle("handle")
                                .build()
                        )
                        .instagram(
                            SocialAccountCreateAuthUrlParams.PlatformData.Instagram.builder()
                                .connectionType(
                                    SocialAccountCreateAuthUrlParams.PlatformData.Instagram
                                        .ConnectionType
                                        .INSTAGRAM
                                )
                                .build()
                        )
                        .linkedin(
                            SocialAccountCreateAuthUrlParams.PlatformData.Linkedin.builder()
                                .connectionType(
                                    SocialAccountCreateAuthUrlParams.PlatformData.Linkedin
                                        .ConnectionType
                                        .PERSONAL
                                )
                                .build()
                        )
                        .build()
                )
                .redirectUrlOverride("redirect_url_override")
                .build()

        val body = params._body()

        assertThat(body.platform()).isEqualTo("platform")
        assertThat(body.externalId()).isEqualTo("external_id")
        assertThat(body.platformData())
            .isEqualTo(
                SocialAccountCreateAuthUrlParams.PlatformData.builder()
                    .bluesky(
                        SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                            .appPassword("app_password")
                            .handle("handle")
                            .build()
                    )
                    .instagram(
                        SocialAccountCreateAuthUrlParams.PlatformData.Instagram.builder()
                            .connectionType(
                                SocialAccountCreateAuthUrlParams.PlatformData.Instagram
                                    .ConnectionType
                                    .INSTAGRAM
                            )
                            .build()
                    )
                    .linkedin(
                        SocialAccountCreateAuthUrlParams.PlatformData.Linkedin.builder()
                            .connectionType(
                                SocialAccountCreateAuthUrlParams.PlatformData.Linkedin
                                    .ConnectionType
                                    .PERSONAL
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.redirectUrlOverride()).isEqualTo("redirect_url_override")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SocialAccountCreateAuthUrlParams.builder().platform("platform").build()

        val body = params._body()

        assertThat(body.platform()).isEqualTo("platform")
    }
}
