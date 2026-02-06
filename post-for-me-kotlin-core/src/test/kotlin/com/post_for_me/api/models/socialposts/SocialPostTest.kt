// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.models.socialposts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.jsonMapper
import com.post_for_me.api.models.socialaccounts.SocialAccount
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialPostTest {

    @Test
    fun create() {
        val socialPost =
            SocialPost.builder()
                .id("id")
                .addAccountConfiguration(
                    SocialPost.AccountConfiguration.builder()
                        .configuration(
                            SocialPost.AccountConfiguration.Configuration.builder()
                                .allowComment(true)
                                .allowDuet(true)
                                .allowStitch(true)
                                .autoAddMusic(true)
                                .addBoardId("string")
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addCollaborator(listOf(JsonValue.from(mapOf<String, Any>())))
                                .communityId("community_id")
                                .discloseBrandedContent(true)
                                .discloseYourBrand(true)
                                .isAiGenerated(true)
                                .isDraft(true)
                                .link("link")
                                .location("location")
                                .madeForKids(true)
                                .addMedia(
                                    SocialPost.AccountConfiguration.Configuration.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            SocialPost.AccountConfiguration.Configuration.Media.Tag
                                                .builder()
                                                .id("id")
                                                .platform(
                                                    SocialPost.AccountConfiguration.Configuration
                                                        .Media
                                                        .Tag
                                                        .Platform
                                                        .FACEBOOK
                                                )
                                                .type(
                                                    SocialPost.AccountConfiguration.Configuration
                                                        .Media
                                                        .Tag
                                                        .Type
                                                        .USER
                                                )
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .placement(
                                    SocialPost.AccountConfiguration.Configuration.Placement.REELS
                                )
                                .poll(
                                    SocialPost.AccountConfiguration.Configuration.Poll.builder()
                                        .durationMinutes(0.0)
                                        .addOption("string")
                                        .replySettings(
                                            SocialPost.AccountConfiguration.Configuration.Poll
                                                .ReplySettings
                                                .FOLLOWING
                                        )
                                        .build()
                                )
                                .privacyStatus(
                                    SocialPost.AccountConfiguration.Configuration.PrivacyStatus
                                        .PUBLIC
                                )
                                .quoteTweetId("quote_tweet_id")
                                .replySettings(
                                    SocialPost.AccountConfiguration.Configuration.ReplySettings
                                        .FOLLOWING
                                )
                                .shareToFeed(true)
                                .title("title")
                                .trialReelType(
                                    SocialPost.AccountConfiguration.Configuration.TrialReelType
                                        .MANUAL
                                )
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
                        .skipProcessing(true)
                        .addTag(
                            SocialPost.Media.Tag.builder()
                                .id("id")
                                .platform(SocialPost.Media.Tag.Platform.FACEBOOK)
                                .type(SocialPost.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
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
                                        .skipProcessing(true)
                                        .addTag(
                                            BlueskyConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    BlueskyConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(BlueskyConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .build()
                        )
                        .facebook(
                            FacebookConfigurationDto.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addCollaborator(listOf(JsonValue.from(mapOf<String, Any>())))
                                .location("location")
                                .addMedia(
                                    FacebookConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            FacebookConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    FacebookConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(FacebookConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                .location("location")
                                .addMedia(
                                    InstagramConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            InstagramConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    InstagramConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(InstagramConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .placement(InstagramConfigurationDto.Placement.REELS)
                                .shareToFeed(true)
                                .trialReelType(InstagramConfigurationDto.TrialReelType.MANUAL)
                                .build()
                        )
                        .linkedin(
                            LinkedinConfigurationDto.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addMedia(
                                    LinkedinConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            LinkedinConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    LinkedinConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(LinkedinConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                        .skipProcessing(true)
                                        .addTag(
                                            PinterestConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    PinterestConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(PinterestConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                        .skipProcessing(true)
                                        .addTag(
                                            ThreadsConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    ThreadsConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(ThreadsConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                .autoAddMusic(true)
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .discloseBrandedContent(true)
                                .discloseYourBrand(true)
                                .isAiGenerated(true)
                                .isDraft(true)
                                .addMedia(
                                    TiktokConfiguration.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            TiktokConfiguration.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    TiktokConfiguration.Media.Tag.Platform.FACEBOOK
                                                )
                                                .type(TiktokConfiguration.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                .autoAddMusic(true)
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .discloseBrandedContent(true)
                                .discloseYourBrand(true)
                                .isAiGenerated(true)
                                .isDraft(true)
                                .addMedia(
                                    TiktokConfiguration.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            TiktokConfiguration.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    TiktokConfiguration.Media.Tag.Platform.FACEBOOK
                                                )
                                                .type(TiktokConfiguration.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                .communityId("community_id")
                                .addMedia(
                                    TwitterConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            TwitterConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    TwitterConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(TwitterConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .poll(
                                    TwitterConfigurationDto.Poll.builder()
                                        .durationMinutes(0.0)
                                        .addOption("string")
                                        .replySettings(
                                            TwitterConfigurationDto.Poll.ReplySettings.FOLLOWING
                                        )
                                        .build()
                                )
                                .quoteTweetId("quote_tweet_id")
                                .replySettings(TwitterConfigurationDto.ReplySettings.FOLLOWING)
                                .build()
                        )
                        .youtube(
                            YoutubeConfigurationDto.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .madeForKids(true)
                                .addMedia(
                                    YoutubeConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            YoutubeConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    YoutubeConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(YoutubeConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .privacyStatus(YoutubeConfigurationDto.PrivacyStatus.PUBLIC)
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
                        .profilePhotoUrl("profile_photo_url")
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

        assertThat(socialPost.id()).isEqualTo("id")
        assertThat(socialPost.accountConfigurations())
            .containsExactly(
                SocialPost.AccountConfiguration.builder()
                    .configuration(
                        SocialPost.AccountConfiguration.Configuration.builder()
                            .allowComment(true)
                            .allowDuet(true)
                            .allowStitch(true)
                            .autoAddMusic(true)
                            .addBoardId("string")
                            .caption(JsonValue.from(mapOf<String, Any>()))
                            .addCollaborator(listOf(JsonValue.from(mapOf<String, Any>())))
                            .communityId("community_id")
                            .discloseBrandedContent(true)
                            .discloseYourBrand(true)
                            .isAiGenerated(true)
                            .isDraft(true)
                            .link("link")
                            .location("location")
                            .madeForKids(true)
                            .addMedia(
                                SocialPost.AccountConfiguration.Configuration.Media.builder()
                                    .url("url")
                                    .skipProcessing(true)
                                    .addTag(
                                        SocialPost.AccountConfiguration.Configuration.Media.Tag
                                            .builder()
                                            .id("id")
                                            .platform(
                                                SocialPost.AccountConfiguration.Configuration.Media
                                                    .Tag
                                                    .Platform
                                                    .FACEBOOK
                                            )
                                            .type(
                                                SocialPost.AccountConfiguration.Configuration.Media
                                                    .Tag
                                                    .Type
                                                    .USER
                                            )
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .placement(
                                SocialPost.AccountConfiguration.Configuration.Placement.REELS
                            )
                            .poll(
                                SocialPost.AccountConfiguration.Configuration.Poll.builder()
                                    .durationMinutes(0.0)
                                    .addOption("string")
                                    .replySettings(
                                        SocialPost.AccountConfiguration.Configuration.Poll
                                            .ReplySettings
                                            .FOLLOWING
                                    )
                                    .build()
                            )
                            .privacyStatus(
                                SocialPost.AccountConfiguration.Configuration.PrivacyStatus.PUBLIC
                            )
                            .quoteTweetId("quote_tweet_id")
                            .replySettings(
                                SocialPost.AccountConfiguration.Configuration.ReplySettings
                                    .FOLLOWING
                            )
                            .shareToFeed(true)
                            .title("title")
                            .trialReelType(
                                SocialPost.AccountConfiguration.Configuration.TrialReelType.MANUAL
                            )
                            .build()
                    )
                    .socialAccountId("social_account_id")
                    .build()
            )
        assertThat(socialPost.caption()).isEqualTo("caption")
        assertThat(socialPost.createdAt()).isEqualTo("created_at")
        assertThat(socialPost.externalId()).isEqualTo("external_id")
        assertThat(socialPost.media())
            .containsExactly(
                SocialPost.Media.builder()
                    .url("url")
                    .skipProcessing(true)
                    .addTag(
                        SocialPost.Media.Tag.builder()
                            .id("id")
                            .platform(SocialPost.Media.Tag.Platform.FACEBOOK)
                            .type(SocialPost.Media.Tag.Type.USER)
                            .x(0.0)
                            .y(0.0)
                            .build()
                    )
                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(socialPost.platformConfigurations())
            .isEqualTo(
                PlatformConfigurationsDto.builder()
                    .bluesky(
                        BlueskyConfigurationDto.builder()
                            .caption(JsonValue.from(mapOf<String, Any>()))
                            .addMedia(
                                BlueskyConfigurationDto.Media.builder()
                                    .url("url")
                                    .skipProcessing(true)
                                    .addTag(
                                        BlueskyConfigurationDto.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                BlueskyConfigurationDto.Media.Tag.Platform.FACEBOOK
                                            )
                                            .type(BlueskyConfigurationDto.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .build()
                    )
                    .facebook(
                        FacebookConfigurationDto.builder()
                            .caption(JsonValue.from(mapOf<String, Any>()))
                            .addCollaborator(listOf(JsonValue.from(mapOf<String, Any>())))
                            .location("location")
                            .addMedia(
                                FacebookConfigurationDto.Media.builder()
                                    .url("url")
                                    .skipProcessing(true)
                                    .addTag(
                                        FacebookConfigurationDto.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                FacebookConfigurationDto.Media.Tag.Platform.FACEBOOK
                                            )
                                            .type(FacebookConfigurationDto.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                            .location("location")
                            .addMedia(
                                InstagramConfigurationDto.Media.builder()
                                    .url("url")
                                    .skipProcessing(true)
                                    .addTag(
                                        InstagramConfigurationDto.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                InstagramConfigurationDto.Media.Tag.Platform
                                                    .FACEBOOK
                                            )
                                            .type(InstagramConfigurationDto.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .placement(InstagramConfigurationDto.Placement.REELS)
                            .shareToFeed(true)
                            .trialReelType(InstagramConfigurationDto.TrialReelType.MANUAL)
                            .build()
                    )
                    .linkedin(
                        LinkedinConfigurationDto.builder()
                            .caption(JsonValue.from(mapOf<String, Any>()))
                            .addMedia(
                                LinkedinConfigurationDto.Media.builder()
                                    .url("url")
                                    .skipProcessing(true)
                                    .addTag(
                                        LinkedinConfigurationDto.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                LinkedinConfigurationDto.Media.Tag.Platform.FACEBOOK
                                            )
                                            .type(LinkedinConfigurationDto.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                    .skipProcessing(true)
                                    .addTag(
                                        PinterestConfigurationDto.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                PinterestConfigurationDto.Media.Tag.Platform
                                                    .FACEBOOK
                                            )
                                            .type(PinterestConfigurationDto.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                    .skipProcessing(true)
                                    .addTag(
                                        ThreadsConfigurationDto.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                ThreadsConfigurationDto.Media.Tag.Platform.FACEBOOK
                                            )
                                            .type(ThreadsConfigurationDto.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                            .autoAddMusic(true)
                            .caption(JsonValue.from(mapOf<String, Any>()))
                            .discloseBrandedContent(true)
                            .discloseYourBrand(true)
                            .isAiGenerated(true)
                            .isDraft(true)
                            .addMedia(
                                TiktokConfiguration.Media.builder()
                                    .url("url")
                                    .skipProcessing(true)
                                    .addTag(
                                        TiktokConfiguration.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                TiktokConfiguration.Media.Tag.Platform.FACEBOOK
                                            )
                                            .type(TiktokConfiguration.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                            .autoAddMusic(true)
                            .caption(JsonValue.from(mapOf<String, Any>()))
                            .discloseBrandedContent(true)
                            .discloseYourBrand(true)
                            .isAiGenerated(true)
                            .isDraft(true)
                            .addMedia(
                                TiktokConfiguration.Media.builder()
                                    .url("url")
                                    .skipProcessing(true)
                                    .addTag(
                                        TiktokConfiguration.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                TiktokConfiguration.Media.Tag.Platform.FACEBOOK
                                            )
                                            .type(TiktokConfiguration.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                            .communityId("community_id")
                            .addMedia(
                                TwitterConfigurationDto.Media.builder()
                                    .url("url")
                                    .skipProcessing(true)
                                    .addTag(
                                        TwitterConfigurationDto.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                TwitterConfigurationDto.Media.Tag.Platform.FACEBOOK
                                            )
                                            .type(TwitterConfigurationDto.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .poll(
                                TwitterConfigurationDto.Poll.builder()
                                    .durationMinutes(0.0)
                                    .addOption("string")
                                    .replySettings(
                                        TwitterConfigurationDto.Poll.ReplySettings.FOLLOWING
                                    )
                                    .build()
                            )
                            .quoteTweetId("quote_tweet_id")
                            .replySettings(TwitterConfigurationDto.ReplySettings.FOLLOWING)
                            .build()
                    )
                    .youtube(
                        YoutubeConfigurationDto.builder()
                            .caption(JsonValue.from(mapOf<String, Any>()))
                            .madeForKids(true)
                            .addMedia(
                                YoutubeConfigurationDto.Media.builder()
                                    .url("url")
                                    .skipProcessing(true)
                                    .addTag(
                                        YoutubeConfigurationDto.Media.Tag.builder()
                                            .id("id")
                                            .platform(
                                                YoutubeConfigurationDto.Media.Tag.Platform.FACEBOOK
                                            )
                                            .type(YoutubeConfigurationDto.Media.Tag.Type.USER)
                                            .x(0.0)
                                            .y(0.0)
                                            .build()
                                    )
                                    .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                    .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .privacyStatus(YoutubeConfigurationDto.PrivacyStatus.PUBLIC)
                            .title("title")
                            .build()
                    )
                    .build()
            )
        assertThat(socialPost.scheduledAt()).isEqualTo("scheduled_at")
        assertThat(socialPost.socialAccounts())
            .containsExactly(
                SocialAccount.builder()
                    .id("id")
                    .accessToken("access_token")
                    .accessTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalId("external_id")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .platform("platform")
                    .profilePhotoUrl("profile_photo_url")
                    .refreshToken("refresh_token")
                    .refreshTokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SocialAccount.Status.CONNECTED)
                    .userId("user_id")
                    .username("username")
                    .build()
            )
        assertThat(socialPost.status()).isEqualTo(SocialPost.Status.DRAFT)
        assertThat(socialPost.updatedAt()).isEqualTo("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialPost =
            SocialPost.builder()
                .id("id")
                .addAccountConfiguration(
                    SocialPost.AccountConfiguration.builder()
                        .configuration(
                            SocialPost.AccountConfiguration.Configuration.builder()
                                .allowComment(true)
                                .allowDuet(true)
                                .allowStitch(true)
                                .autoAddMusic(true)
                                .addBoardId("string")
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addCollaborator(listOf(JsonValue.from(mapOf<String, Any>())))
                                .communityId("community_id")
                                .discloseBrandedContent(true)
                                .discloseYourBrand(true)
                                .isAiGenerated(true)
                                .isDraft(true)
                                .link("link")
                                .location("location")
                                .madeForKids(true)
                                .addMedia(
                                    SocialPost.AccountConfiguration.Configuration.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            SocialPost.AccountConfiguration.Configuration.Media.Tag
                                                .builder()
                                                .id("id")
                                                .platform(
                                                    SocialPost.AccountConfiguration.Configuration
                                                        .Media
                                                        .Tag
                                                        .Platform
                                                        .FACEBOOK
                                                )
                                                .type(
                                                    SocialPost.AccountConfiguration.Configuration
                                                        .Media
                                                        .Tag
                                                        .Type
                                                        .USER
                                                )
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .placement(
                                    SocialPost.AccountConfiguration.Configuration.Placement.REELS
                                )
                                .poll(
                                    SocialPost.AccountConfiguration.Configuration.Poll.builder()
                                        .durationMinutes(0.0)
                                        .addOption("string")
                                        .replySettings(
                                            SocialPost.AccountConfiguration.Configuration.Poll
                                                .ReplySettings
                                                .FOLLOWING
                                        )
                                        .build()
                                )
                                .privacyStatus(
                                    SocialPost.AccountConfiguration.Configuration.PrivacyStatus
                                        .PUBLIC
                                )
                                .quoteTweetId("quote_tweet_id")
                                .replySettings(
                                    SocialPost.AccountConfiguration.Configuration.ReplySettings
                                        .FOLLOWING
                                )
                                .shareToFeed(true)
                                .title("title")
                                .trialReelType(
                                    SocialPost.AccountConfiguration.Configuration.TrialReelType
                                        .MANUAL
                                )
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
                        .skipProcessing(true)
                        .addTag(
                            SocialPost.Media.Tag.builder()
                                .id("id")
                                .platform(SocialPost.Media.Tag.Platform.FACEBOOK)
                                .type(SocialPost.Media.Tag.Type.USER)
                                .x(0.0)
                                .y(0.0)
                                .build()
                        )
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
                                        .skipProcessing(true)
                                        .addTag(
                                            BlueskyConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    BlueskyConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(BlueskyConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .build()
                        )
                        .facebook(
                            FacebookConfigurationDto.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addCollaborator(listOf(JsonValue.from(mapOf<String, Any>())))
                                .location("location")
                                .addMedia(
                                    FacebookConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            FacebookConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    FacebookConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(FacebookConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                .location("location")
                                .addMedia(
                                    InstagramConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            InstagramConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    InstagramConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(InstagramConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .placement(InstagramConfigurationDto.Placement.REELS)
                                .shareToFeed(true)
                                .trialReelType(InstagramConfigurationDto.TrialReelType.MANUAL)
                                .build()
                        )
                        .linkedin(
                            LinkedinConfigurationDto.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .addMedia(
                                    LinkedinConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            LinkedinConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    LinkedinConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(LinkedinConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                        .skipProcessing(true)
                                        .addTag(
                                            PinterestConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    PinterestConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(PinterestConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                        .skipProcessing(true)
                                        .addTag(
                                            ThreadsConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    ThreadsConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(ThreadsConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                .autoAddMusic(true)
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .discloseBrandedContent(true)
                                .discloseYourBrand(true)
                                .isAiGenerated(true)
                                .isDraft(true)
                                .addMedia(
                                    TiktokConfiguration.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            TiktokConfiguration.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    TiktokConfiguration.Media.Tag.Platform.FACEBOOK
                                                )
                                                .type(TiktokConfiguration.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                .autoAddMusic(true)
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .discloseBrandedContent(true)
                                .discloseYourBrand(true)
                                .isAiGenerated(true)
                                .isDraft(true)
                                .addMedia(
                                    TiktokConfiguration.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            TiktokConfiguration.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    TiktokConfiguration.Media.Tag.Platform.FACEBOOK
                                                )
                                                .type(TiktokConfiguration.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
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
                                .communityId("community_id")
                                .addMedia(
                                    TwitterConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            TwitterConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    TwitterConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(TwitterConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .poll(
                                    TwitterConfigurationDto.Poll.builder()
                                        .durationMinutes(0.0)
                                        .addOption("string")
                                        .replySettings(
                                            TwitterConfigurationDto.Poll.ReplySettings.FOLLOWING
                                        )
                                        .build()
                                )
                                .quoteTweetId("quote_tweet_id")
                                .replySettings(TwitterConfigurationDto.ReplySettings.FOLLOWING)
                                .build()
                        )
                        .youtube(
                            YoutubeConfigurationDto.builder()
                                .caption(JsonValue.from(mapOf<String, Any>()))
                                .madeForKids(true)
                                .addMedia(
                                    YoutubeConfigurationDto.Media.builder()
                                        .url("url")
                                        .skipProcessing(true)
                                        .addTag(
                                            YoutubeConfigurationDto.Media.Tag.builder()
                                                .id("id")
                                                .platform(
                                                    YoutubeConfigurationDto.Media.Tag.Platform
                                                        .FACEBOOK
                                                )
                                                .type(YoutubeConfigurationDto.Media.Tag.Type.USER)
                                                .x(0.0)
                                                .y(0.0)
                                                .build()
                                        )
                                        .thumbnailTimestampMs(JsonValue.from(mapOf<String, Any>()))
                                        .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .privacyStatus(YoutubeConfigurationDto.PrivacyStatus.PUBLIC)
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
                        .profilePhotoUrl("profile_photo_url")
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

        val roundtrippedSocialPost =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialPost),
                jacksonTypeRef<SocialPost>(),
            )

        assertThat(roundtrippedSocialPost).isEqualTo(socialPost)
    }
}
