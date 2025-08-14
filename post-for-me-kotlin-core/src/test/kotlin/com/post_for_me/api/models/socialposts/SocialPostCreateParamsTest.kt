// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.post_for_me.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostCreateParamsTest {

    @Test
    fun create() {
        SocialPostCreateParams.builder()
            .createSocialPost(
                CreateSocialPost.builder()
                    .caption("caption")
                    .addSocialAccount("string")
                    .addAccountConfiguration(
                        CreateSocialPost.AccountConfiguration.builder()
                            .configuration(
                                CreateSocialPost.AccountConfiguration.Configuration.builder()
                                    .allowComment(true)
                                    .allowDuet(true)
                                    .allowStitch(true)
                                    .addBoardId("string")
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .discloseBrandedContent(true)
                                    .discloseYourBrand(true)
                                    .link("link")
                                    .location(
                                        CreateSocialPost.AccountConfiguration.Configuration.Location
                                            .REELS
                                    )
                                    .addMedia("string")
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .socialAccountId("social_account_id")
                            .build()
                    )
                    .externalId("external_id")
                    .isDraft(true)
                    .addMedia(
                        CreateSocialPost.Media.builder()
                            .url("url")
                            .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .platformConfigurations(
                        CreateSocialPost.PlatformConfigurations.builder()
                            .bluesky(
                                CreateSocialPost.PlatformConfigurations.Bluesky.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .facebook(
                                CreateSocialPost.PlatformConfigurations.Facebook.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .instagram(
                                CreateSocialPost.PlatformConfigurations.Instagram.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .linkedin(
                                CreateSocialPost.PlatformConfigurations.Linkedin.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .pinterest(
                                CreateSocialPost.PlatformConfigurations.Pinterest.builder()
                                    .addBoardId("string")
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .link("link")
                                    .addMedia("string")
                                    .build()
                            )
                            .threads(
                                CreateSocialPost.PlatformConfigurations.Threads.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .location(
                                        CreateSocialPost.PlatformConfigurations.Threads.Location
                                            .REELS
                                    )
                                    .addMedia("string")
                                    .build()
                            )
                            .tiktok(
                                TiktokConfiguration.builder()
                                    .allowComment(true)
                                    .allowDuet(true)
                                    .allowStitch(true)
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .discloseBrandedContent(true)
                                    .discloseYourBrand(true)
                                    .isAiGenerated(true)
                                    .addMedia("string")
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .tiktokBusiness(
                                TiktokConfiguration.builder()
                                    .allowComment(true)
                                    .allowDuet(true)
                                    .allowStitch(true)
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .discloseBrandedContent(true)
                                    .discloseYourBrand(true)
                                    .isAiGenerated(true)
                                    .addMedia("string")
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .x(
                                CreateSocialPost.PlatformConfigurations.X.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .youtube(
                                CreateSocialPost.PlatformConfigurations.Youtube.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .title("title")
                                    .build()
                            )
                            .build()
                    )
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SocialPostCreateParams.builder()
                .createSocialPost(
                    CreateSocialPost.builder()
                        .caption("caption")
                        .addSocialAccount("string")
                        .addAccountConfiguration(
                            CreateSocialPost.AccountConfiguration.builder()
                                .configuration(
                                    CreateSocialPost.AccountConfiguration.Configuration.builder()
                                        .allowComment(true)
                                        .allowDuet(true)
                                        .allowStitch(true)
                                        .addBoardId("string")
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .discloseBrandedContent(true)
                                        .discloseYourBrand(true)
                                        .link("link")
                                        .location(
                                            CreateSocialPost.AccountConfiguration.Configuration
                                                .Location
                                                .REELS
                                        )
                                        .addMedia("string")
                                        .privacyStatus("privacy_status")
                                        .title("title")
                                        .build()
                                )
                                .socialAccountId("social_account_id")
                                .build()
                        )
                        .externalId("external_id")
                        .isDraft(true)
                        .addMedia(
                            CreateSocialPost.Media.builder()
                                .url("url")
                                .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .platformConfigurations(
                            CreateSocialPost.PlatformConfigurations.builder()
                                .bluesky(
                                    CreateSocialPost.PlatformConfigurations.Bluesky.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia("string")
                                        .build()
                                )
                                .facebook(
                                    CreateSocialPost.PlatformConfigurations.Facebook.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia("string")
                                        .build()
                                )
                                .instagram(
                                    CreateSocialPost.PlatformConfigurations.Instagram.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia("string")
                                        .build()
                                )
                                .linkedin(
                                    CreateSocialPost.PlatformConfigurations.Linkedin.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia("string")
                                        .build()
                                )
                                .pinterest(
                                    CreateSocialPost.PlatformConfigurations.Pinterest.builder()
                                        .addBoardId("string")
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .link("link")
                                        .addMedia("string")
                                        .build()
                                )
                                .threads(
                                    CreateSocialPost.PlatformConfigurations.Threads.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .location(
                                            CreateSocialPost.PlatformConfigurations.Threads.Location
                                                .REELS
                                        )
                                        .addMedia("string")
                                        .build()
                                )
                                .tiktok(
                                    TiktokConfiguration.builder()
                                        .allowComment(true)
                                        .allowDuet(true)
                                        .allowStitch(true)
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .discloseBrandedContent(true)
                                        .discloseYourBrand(true)
                                        .isAiGenerated(true)
                                        .addMedia("string")
                                        .privacyStatus("privacy_status")
                                        .title("title")
                                        .build()
                                )
                                .tiktokBusiness(
                                    TiktokConfiguration.builder()
                                        .allowComment(true)
                                        .allowDuet(true)
                                        .allowStitch(true)
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .discloseBrandedContent(true)
                                        .discloseYourBrand(true)
                                        .isAiGenerated(true)
                                        .addMedia("string")
                                        .privacyStatus("privacy_status")
                                        .title("title")
                                        .build()
                                )
                                .x(
                                    CreateSocialPost.PlatformConfigurations.X.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia("string")
                                        .build()
                                )
                                .youtube(
                                    CreateSocialPost.PlatformConfigurations.Youtube.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia("string")
                                        .title("title")
                                        .build()
                                )
                                .build()
                        )
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateSocialPost.builder()
                    .caption("caption")
                    .addSocialAccount("string")
                    .addAccountConfiguration(
                        CreateSocialPost.AccountConfiguration.builder()
                            .configuration(
                                CreateSocialPost.AccountConfiguration.Configuration.builder()
                                    .allowComment(true)
                                    .allowDuet(true)
                                    .allowStitch(true)
                                    .addBoardId("string")
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .discloseBrandedContent(true)
                                    .discloseYourBrand(true)
                                    .link("link")
                                    .location(
                                        CreateSocialPost.AccountConfiguration.Configuration.Location
                                            .REELS
                                    )
                                    .addMedia("string")
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .socialAccountId("social_account_id")
                            .build()
                    )
                    .externalId("external_id")
                    .isDraft(true)
                    .addMedia(
                        CreateSocialPost.Media.builder()
                            .url("url")
                            .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .platformConfigurations(
                        CreateSocialPost.PlatformConfigurations.builder()
                            .bluesky(
                                CreateSocialPost.PlatformConfigurations.Bluesky.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .facebook(
                                CreateSocialPost.PlatformConfigurations.Facebook.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .instagram(
                                CreateSocialPost.PlatformConfigurations.Instagram.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .linkedin(
                                CreateSocialPost.PlatformConfigurations.Linkedin.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .pinterest(
                                CreateSocialPost.PlatformConfigurations.Pinterest.builder()
                                    .addBoardId("string")
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .link("link")
                                    .addMedia("string")
                                    .build()
                            )
                            .threads(
                                CreateSocialPost.PlatformConfigurations.Threads.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .location(
                                        CreateSocialPost.PlatformConfigurations.Threads.Location
                                            .REELS
                                    )
                                    .addMedia("string")
                                    .build()
                            )
                            .tiktok(
                                TiktokConfiguration.builder()
                                    .allowComment(true)
                                    .allowDuet(true)
                                    .allowStitch(true)
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .discloseBrandedContent(true)
                                    .discloseYourBrand(true)
                                    .isAiGenerated(true)
                                    .addMedia("string")
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .tiktokBusiness(
                                TiktokConfiguration.builder()
                                    .allowComment(true)
                                    .allowDuet(true)
                                    .allowStitch(true)
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .discloseBrandedContent(true)
                                    .discloseYourBrand(true)
                                    .isAiGenerated(true)
                                    .addMedia("string")
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .x(
                                CreateSocialPost.PlatformConfigurations.X.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .build()
                            )
                            .youtube(
                                CreateSocialPost.PlatformConfigurations.Youtube.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia("string")
                                    .title("title")
                                    .build()
                            )
                            .build()
                    )
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SocialPostCreateParams.builder()
                .createSocialPost(
                    CreateSocialPost.builder().caption("caption").addSocialAccount("string").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateSocialPost.builder().caption("caption").addSocialAccount("string").build()
            )
    }
}
