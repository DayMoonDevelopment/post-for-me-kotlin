// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import com.post_for_me.api.models.socialaccounts.SocialAccount
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostListResponseTest {

    @Test
    fun create() {
        val socialPostListResponse =
            SocialPostListResponse.builder()
                .addData(
                    SocialPost.builder()
                        .id("id")
                        .addAccountConfiguration(
                            SocialPost.AccountConfiguration.builder()
                                .configuration(
                                    SocialPost.AccountConfiguration.Configuration.builder()
                                        .allowComment(true)
                                        .allowDuet(true)
                                        .allowStitch(true)
                                        .addBoardId("string")
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .discloseBrandedContent(true)
                                        .discloseYourBrand(true)
                                        .isAiGenerated(true)
                                        .isDraft(true)
                                        .link("link")
                                        .addMedia("string")
                                        .placement(
                                            SocialPost.AccountConfiguration.Configuration.Placement
                                                .REELS
                                        )
                                        .privacyStatus("privacy_status")
                                        .title("title")
                                        .build()
                                )
                                .socialAccountId("social_account_id")
                                .build()
                        )
                        .caption("caption")
                        .createdAt("created_at")
                        .externalId("external_id")
                        .addMedia(
                            SocialPost.Media.builder()
                                .url("url")
                                .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .platformConfigurations(
                            PlatformConfigurationsDto.builder()
                                .bluesky(
                                    BlueskyConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            BlueskyConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .facebook(
                                    FacebookConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            FacebookConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .placement(FacebookConfigurationDto.Placement.REELS)
                                        .build()
                                )
                                .instagram(
                                    InstagramConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addCollaborator("string")
                                        .addMedia(
                                            InstagramConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .placement(InstagramConfigurationDto.Placement.REELS)
                                        .build()
                                )
                                .linkedin(
                                    LinkedinConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            LinkedinConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .pinterest(
                                    PinterestConfigurationDto.builder()
                                        .addBoardId("string")
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .link("link")
                                        .addMedia(
                                            PinterestConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .threads(
                                    ThreadsConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            ThreadsConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .placement(ThreadsConfigurationDto.Placement.REELS)
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
                                        .isDraft(true)
                                        .addMedia(
                                            TiktokConfiguration.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
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
                                        .isDraft(true)
                                        .addMedia(
                                            TiktokConfiguration.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .privacyStatus("privacy_status")
                                        .title("title")
                                        .build()
                                )
                                .x(
                                    TwitterConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            TwitterConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .youtube(
                                    YoutubeConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            YoutubeConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .title("title")
                                        .build()
                                )
                                .build()
                        )
                        .scheduledAt("scheduled_at")
                        .addSocialAccount(
                            SocialAccount.builder()
                                .id("id")
                                .accessToken("access_token")
                                .accessTokenExpiresAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .externalId("external_id")
                                .metadata(JsonValue.from(mapOf<String, Any>()))
                                .platform("platform")
                                .refreshToken("refresh_token")
                                .refreshTokenExpiresAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .status(SocialAccount.Status.CONNECTED)
                                .userId("user_id")
                                .username("username")
                                .build()
                        )
                        .status(SocialPost.Status.DRAFT)
                        .updatedAt("updated_at")
                        .build()
                )
                .meta(
                    SocialPostListResponse.Meta.builder()
                        .limit(0.0)
                        .next("https://api.postforme.dev/v1/items?offset=10&limit=10")
                        .offset(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        assertThat(socialPostListResponse.data())
            .containsExactly(
                SocialPost.builder()
                    .id("id")
                    .addAccountConfiguration(
                        SocialPost.AccountConfiguration.builder()
                            .configuration(
                                SocialPost.AccountConfiguration.Configuration.builder()
                                    .allowComment(true)
                                    .allowDuet(true)
                                    .allowStitch(true)
                                    .addBoardId("string")
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .discloseBrandedContent(true)
                                    .discloseYourBrand(true)
                                    .isAiGenerated(true)
                                    .isDraft(true)
                                    .link("link")
                                    .addMedia("string")
                                    .placement(
                                        SocialPost.AccountConfiguration.Configuration.Placement
                                            .REELS
                                    )
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .socialAccountId("social_account_id")
                            .build()
                    )
                    .caption("caption")
                    .createdAt("created_at")
                    .externalId("external_id")
                    .addMedia(
                        SocialPost.Media.builder()
                            .url("url")
                            .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .platformConfigurations(
                        PlatformConfigurationsDto.builder()
                            .bluesky(
                                BlueskyConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        BlueskyConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .facebook(
                                FacebookConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        FacebookConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(FacebookConfigurationDto.Placement.REELS)
                                    .build()
                            )
                            .instagram(
                                InstagramConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addCollaborator("string")
                                    .addMedia(
                                        InstagramConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(InstagramConfigurationDto.Placement.REELS)
                                    .build()
                            )
                            .linkedin(
                                LinkedinConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        LinkedinConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .pinterest(
                                PinterestConfigurationDto.builder()
                                    .addBoardId("string")
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .link("link")
                                    .addMedia(
                                        PinterestConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .threads(
                                ThreadsConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        ThreadsConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(ThreadsConfigurationDto.Placement.REELS)
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
                                    .isDraft(true)
                                    .addMedia(
                                        TiktokConfiguration.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
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
                                    .isDraft(true)
                                    .addMedia(
                                        TiktokConfiguration.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .privacyStatus("privacy_status")
                                    .title("title")
                                    .build()
                            )
                            .x(
                                TwitterConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        TwitterConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .build()
                            )
                            .youtube(
                                YoutubeConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        YoutubeConfigurationDto.Media.builder()
                                            .url("url")
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .title("title")
                                    .build()
                            )
                            .build()
                    )
                    .scheduledAt("scheduled_at")
                    .addSocialAccount(
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
                    )
                    .status(SocialPost.Status.DRAFT)
                    .updatedAt("updated_at")
                    .build()
            )
        assertThat(socialPostListResponse.meta())
            .isEqualTo(
                SocialPostListResponse.Meta.builder()
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
        val socialPostListResponse =
            SocialPostListResponse.builder()
                .addData(
                    SocialPost.builder()
                        .id("id")
                        .addAccountConfiguration(
                            SocialPost.AccountConfiguration.builder()
                                .configuration(
                                    SocialPost.AccountConfiguration.Configuration.builder()
                                        .allowComment(true)
                                        .allowDuet(true)
                                        .allowStitch(true)
                                        .addBoardId("string")
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .discloseBrandedContent(true)
                                        .discloseYourBrand(true)
                                        .isAiGenerated(true)
                                        .isDraft(true)
                                        .link("link")
                                        .addMedia("string")
                                        .placement(
                                            SocialPost.AccountConfiguration.Configuration.Placement
                                                .REELS
                                        )
                                        .privacyStatus("privacy_status")
                                        .title("title")
                                        .build()
                                )
                                .socialAccountId("social_account_id")
                                .build()
                        )
                        .caption("caption")
                        .createdAt("created_at")
                        .externalId("external_id")
                        .addMedia(
                            SocialPost.Media.builder()
                                .url("url")
                                .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .platformConfigurations(
                            PlatformConfigurationsDto.builder()
                                .bluesky(
                                    BlueskyConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            BlueskyConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .facebook(
                                    FacebookConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            FacebookConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .placement(FacebookConfigurationDto.Placement.REELS)
                                        .build()
                                )
                                .instagram(
                                    InstagramConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addCollaborator("string")
                                        .addMedia(
                                            InstagramConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .placement(InstagramConfigurationDto.Placement.REELS)
                                        .build()
                                )
                                .linkedin(
                                    LinkedinConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            LinkedinConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .pinterest(
                                    PinterestConfigurationDto.builder()
                                        .addBoardId("string")
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .link("link")
                                        .addMedia(
                                            PinterestConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .threads(
                                    ThreadsConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            ThreadsConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .placement(ThreadsConfigurationDto.Placement.REELS)
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
                                        .isDraft(true)
                                        .addMedia(
                                            TiktokConfiguration.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
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
                                        .isDraft(true)
                                        .addMedia(
                                            TiktokConfiguration.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .privacyStatus("privacy_status")
                                        .title("title")
                                        .build()
                                )
                                .x(
                                    TwitterConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            TwitterConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .build()
                                )
                                .youtube(
                                    YoutubeConfigurationDto.builder()
                                        .caption(JsonValue.from(mapOf<String, Any>()))
                                        .addMedia(
                                            YoutubeConfigurationDto.Media.builder()
                                                .url("url")
                                                .thumbnailTimestampMs(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                                .build()
                                        )
                                        .title("title")
                                        .build()
                                )
                                .build()
                        )
                        .scheduledAt("scheduled_at")
                        .addSocialAccount(
                            SocialAccount.builder()
                                .id("id")
                                .accessToken("access_token")
                                .accessTokenExpiresAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .externalId("external_id")
                                .metadata(JsonValue.from(mapOf<String, Any>()))
                                .platform("platform")
                                .refreshToken("refresh_token")
                                .refreshTokenExpiresAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .status(SocialAccount.Status.CONNECTED)
                                .userId("user_id")
                                .username("username")
                                .build()
                        )
                        .status(SocialPost.Status.DRAFT)
                        .updatedAt("updated_at")
                        .build()
                )
                .meta(
                    SocialPostListResponse.Meta.builder()
                        .limit(0.0)
                        .next("https://api.postforme.dev/v1/items?offset=10&limit=10")
                        .offset(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        val roundtrippedSocialPostListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialPostListResponse),
                jacksonTypeRef<SocialPostListResponse>(),
            )

        assertThat(roundtrippedSocialPostListResponse).isEqualTo(socialPostListResponse)
    }
}
