// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountCreateAuthUrlParamsTest {

    @Test
    fun create() {
        SocialAccountCreateAuthUrlParams.builder()
            .platform("platform")
            .platformData(
                SocialAccountCreateAuthUrlParams.PlatformData.builder()
                    .bluesky(
                        SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                            .appPassword("app_password")
                            .handle("handle")
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
            .build()
    }

    @Test
    fun body() {
        val params =
            SocialAccountCreateAuthUrlParams.builder()
                .platform("platform")
                .platformData(
                    SocialAccountCreateAuthUrlParams.PlatformData.builder()
                        .bluesky(
                            SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                                .appPassword("app_password")
                                .handle("handle")
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
                .build()

        val body = params._body()

        assertThat(body.platform()).isEqualTo("platform")
        assertThat(body.platformData())
            .isEqualTo(
                SocialAccountCreateAuthUrlParams.PlatformData.builder()
                    .bluesky(
                        SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                            .appPassword("app_password")
                            .handle("handle")
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SocialAccountCreateAuthUrlParams.builder().platform("platform").build()

        val body = params._body()

        assertThat(body.platform()).isEqualTo("platform")
    }
}
