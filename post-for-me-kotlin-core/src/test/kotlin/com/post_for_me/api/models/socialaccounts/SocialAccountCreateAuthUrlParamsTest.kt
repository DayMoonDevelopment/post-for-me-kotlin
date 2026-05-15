// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialaccounts

import com.post_for_me.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialAccountCreateAuthUrlParamsTest {

    @Test
    fun create() {
        SocialAccountCreateAuthUrlParams.builder()
            .platform("platform")
            .externalId("external_id")
            .addPermission(SocialAccountCreateAuthUrlParams.Permission.POSTS)
            .addPermission(SocialAccountCreateAuthUrlParams.Permission.FEEDS)
            .platformData(
                SocialAccountCreateAuthUrlParams.PlatformData.builder()
                    .bluesky(
                        SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                            .appPassword("app_password")
                            .handle("handle")
                            .build()
                    )
                    .facebook(
                        SocialAccountCreateAuthUrlParams.PlatformData.Facebook.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .instagram(
                        SocialAccountCreateAuthUrlParams.PlatformData.Instagram.builder()
                            .connectionType(
                                SocialAccountCreateAuthUrlParams.PlatformData.Instagram
                                    .ConnectionType
                                    .INSTAGRAM
                            )
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .linkedin(
                        SocialAccountCreateAuthUrlParams.PlatformData.Linkedin.builder()
                            .connectionType(
                                SocialAccountCreateAuthUrlParams.PlatformData.Linkedin
                                    .ConnectionType
                                    .PERSONAL
                            )
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .pinterest(
                        SocialAccountCreateAuthUrlParams.PlatformData.Pinterest.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .threads(
                        SocialAccountCreateAuthUrlParams.PlatformData.Threads.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .tiktok(
                        SocialAccountCreateAuthUrlParams.PlatformData.Tiktok.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .tiktokBusiness(
                        SocialAccountCreateAuthUrlParams.PlatformData.TiktokBusiness.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .youtube(
                        SocialAccountCreateAuthUrlParams.PlatformData.Youtube.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
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
                .addPermission(SocialAccountCreateAuthUrlParams.Permission.POSTS)
                .addPermission(SocialAccountCreateAuthUrlParams.Permission.FEEDS)
                .platformData(
                    SocialAccountCreateAuthUrlParams.PlatformData.builder()
                        .bluesky(
                            SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                                .appPassword("app_password")
                                .handle("handle")
                                .build()
                        )
                        .facebook(
                            SocialAccountCreateAuthUrlParams.PlatformData.Facebook.builder()
                                .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .instagram(
                            SocialAccountCreateAuthUrlParams.PlatformData.Instagram.builder()
                                .connectionType(
                                    SocialAccountCreateAuthUrlParams.PlatformData.Instagram
                                        .ConnectionType
                                        .INSTAGRAM
                                )
                                .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .linkedin(
                            SocialAccountCreateAuthUrlParams.PlatformData.Linkedin.builder()
                                .connectionType(
                                    SocialAccountCreateAuthUrlParams.PlatformData.Linkedin
                                        .ConnectionType
                                        .PERSONAL
                                )
                                .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .pinterest(
                            SocialAccountCreateAuthUrlParams.PlatformData.Pinterest.builder()
                                .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .threads(
                            SocialAccountCreateAuthUrlParams.PlatformData.Threads.builder()
                                .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .tiktok(
                            SocialAccountCreateAuthUrlParams.PlatformData.Tiktok.builder()
                                .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .tiktokBusiness(
                            SocialAccountCreateAuthUrlParams.PlatformData.TiktokBusiness.builder()
                                .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .youtube(
                            SocialAccountCreateAuthUrlParams.PlatformData.Youtube.builder()
                                .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .build()
                )
                .redirectUrlOverride("redirect_url_override")
                .build()

        val body = params._body()

        assertThat(body.platform()).isEqualTo("platform")
        assertThat(body.externalId()).isEqualTo("external_id")
        assertThat(body.permissions())
            .containsExactly(
                SocialAccountCreateAuthUrlParams.Permission.POSTS,
                SocialAccountCreateAuthUrlParams.Permission.FEEDS,
            )
        assertThat(body.platformData())
            .isEqualTo(
                SocialAccountCreateAuthUrlParams.PlatformData.builder()
                    .bluesky(
                        SocialAccountCreateAuthUrlParams.PlatformData.Bluesky.builder()
                            .appPassword("app_password")
                            .handle("handle")
                            .build()
                    )
                    .facebook(
                        SocialAccountCreateAuthUrlParams.PlatformData.Facebook.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .instagram(
                        SocialAccountCreateAuthUrlParams.PlatformData.Instagram.builder()
                            .connectionType(
                                SocialAccountCreateAuthUrlParams.PlatformData.Instagram
                                    .ConnectionType
                                    .INSTAGRAM
                            )
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .linkedin(
                        SocialAccountCreateAuthUrlParams.PlatformData.Linkedin.builder()
                            .connectionType(
                                SocialAccountCreateAuthUrlParams.PlatformData.Linkedin
                                    .ConnectionType
                                    .PERSONAL
                            )
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .pinterest(
                        SocialAccountCreateAuthUrlParams.PlatformData.Pinterest.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .threads(
                        SocialAccountCreateAuthUrlParams.PlatformData.Threads.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .tiktok(
                        SocialAccountCreateAuthUrlParams.PlatformData.Tiktok.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .tiktokBusiness(
                        SocialAccountCreateAuthUrlParams.PlatformData.TiktokBusiness.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .youtube(
                        SocialAccountCreateAuthUrlParams.PlatformData.Youtube.builder()
                            .addPermissionOverride(listOf(JsonValue.from(mapOf<String, Any>())))
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
