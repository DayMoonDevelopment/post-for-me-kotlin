// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.post_for_me.api.TestServerExtension
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClientAsync
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.models.socialposts.BlueskyConfigurationDto
import com.post_for_me.api.models.socialposts.CreateSocialPost
import com.post_for_me.api.models.socialposts.FacebookConfigurationDto
import com.post_for_me.api.models.socialposts.InstagramConfigurationDto
import com.post_for_me.api.models.socialposts.LinkedinConfigurationDto
import com.post_for_me.api.models.socialposts.PinterestConfigurationDto
import com.post_for_me.api.models.socialposts.PlatformConfigurationsDto
import com.post_for_me.api.models.socialposts.SocialPostListParams
import com.post_for_me.api.models.socialposts.SocialPostUpdateParams
import com.post_for_me.api.models.socialposts.ThreadsConfigurationDto
import com.post_for_me.api.models.socialposts.TiktokConfiguration
import com.post_for_me.api.models.socialposts.TwitterConfigurationDto
import com.post_for_me.api.models.socialposts.YoutubeConfigurationDto
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SocialPostServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialPostServiceAsync = client.socialPosts()

        val socialPost =
            socialPostServiceAsync.create(
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
                                    .addMedia("string")
                                    .placement(
                                        CreateSocialPost.AccountConfiguration.Configuration
                                            .Placement
                                            .REELS
                                    )
                                    .poll(
                                        CreateSocialPost.AccountConfiguration.Configuration.Poll
                                            .builder()
                                            .durationMinutes(0.0)
                                            .addOption("string")
                                            .replySettings(
                                                CreateSocialPost.AccountConfiguration.Configuration
                                                    .Poll
                                                    .ReplySettings
                                                    .FOLLOWING
                                            )
                                            .build()
                                    )
                                    .privacyStatus(
                                        CreateSocialPost.AccountConfiguration.Configuration
                                            .PrivacyStatus
                                            .PUBLIC
                                    )
                                    .quoteTweetId("quote_tweet_id")
                                    .replySettings(
                                        CreateSocialPost.AccountConfiguration.Configuration
                                            .ReplySettings
                                            .FOLLOWING
                                    )
                                    .shareToFeed(true)
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
                            .addTag(
                                CreateSocialPost.Media.Tag.builder()
                                    .id("id")
                                    .platform(CreateSocialPost.Media.Tag.Platform.FACEBOOK)
                                    .type(CreateSocialPost.Media.Tag.Type.USER)
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
                                            .addTag(
                                                BlueskyConfigurationDto.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        BlueskyConfigurationDto.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(
                                                        BlueskyConfigurationDto.Media.Tag.Type.USER
                                                    )
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
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
                                    .addCollaborator(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .location("location")
                                    .addMedia(
                                        FacebookConfigurationDto.Media.builder()
                                            .url("url")
                                            .addTag(
                                                FacebookConfigurationDto.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        FacebookConfigurationDto.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(
                                                        FacebookConfigurationDto.Media.Tag.Type.USER
                                                    )
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
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
                                    .location("location")
                                    .addMedia(
                                        InstagramConfigurationDto.Media.builder()
                                            .url("url")
                                            .addTag(
                                                InstagramConfigurationDto.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        InstagramConfigurationDto.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(
                                                        InstagramConfigurationDto.Media.Tag.Type
                                                            .USER
                                                    )
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .placement(InstagramConfigurationDto.Placement.REELS)
                                    .shareToFeed(true)
                                    .build()
                            )
                            .linkedin(
                                LinkedinConfigurationDto.builder()
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .addMedia(
                                        LinkedinConfigurationDto.Media.builder()
                                            .url("url")
                                            .addTag(
                                                LinkedinConfigurationDto.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        LinkedinConfigurationDto.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(
                                                        LinkedinConfigurationDto.Media.Tag.Type.USER
                                                    )
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
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
                                            .addTag(
                                                PinterestConfigurationDto.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        PinterestConfigurationDto.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(
                                                        PinterestConfigurationDto.Media.Tag.Type
                                                            .USER
                                                    )
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
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
                                            .addTag(
                                                ThreadsConfigurationDto.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        ThreadsConfigurationDto.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(
                                                        ThreadsConfigurationDto.Media.Tag.Type.USER
                                                    )
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
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
                                    .autoAddMusic(true)
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .discloseBrandedContent(true)
                                    .discloseYourBrand(true)
                                    .isAiGenerated(true)
                                    .isDraft(true)
                                    .addMedia(
                                        TiktokConfiguration.Media.builder()
                                            .url("url")
                                            .addTag(
                                                TiktokConfiguration.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        TiktokConfiguration.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(TiktokConfiguration.Media.Tag.Type.USER)
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
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
                                    .autoAddMusic(true)
                                    .caption(JsonValue.from(mapOf<String, Any>()))
                                    .discloseBrandedContent(true)
                                    .discloseYourBrand(true)
                                    .isAiGenerated(true)
                                    .isDraft(true)
                                    .addMedia(
                                        TiktokConfiguration.Media.builder()
                                            .url("url")
                                            .addTag(
                                                TiktokConfiguration.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        TiktokConfiguration.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(TiktokConfiguration.Media.Tag.Type.USER)
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
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
                                    .communityId("community_id")
                                    .addMedia(
                                        TwitterConfigurationDto.Media.builder()
                                            .url("url")
                                            .addTag(
                                                TwitterConfigurationDto.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        TwitterConfigurationDto.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(
                                                        TwitterConfigurationDto.Media.Tag.Type.USER
                                                    )
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
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
                                            .addTag(
                                                YoutubeConfigurationDto.Media.Tag.builder()
                                                    .id("id")
                                                    .platform(
                                                        YoutubeConfigurationDto.Media.Tag.Platform
                                                            .FACEBOOK
                                                    )
                                                    .type(
                                                        YoutubeConfigurationDto.Media.Tag.Type.USER
                                                    )
                                                    .x(0.0)
                                                    .y(0.0)
                                                    .build()
                                            )
                                            .thumbnailTimestampMs(
                                                JsonValue.from(mapOf<String, Any>())
                                            )
                                            .thumbnailUrl(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                    .privacyStatus(YoutubeConfigurationDto.PrivacyStatus.PUBLIC)
                                    .title("title")
                                    .build()
                            )
                            .build()
                    )
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        socialPost.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialPostServiceAsync = client.socialPosts()

        val socialPost = socialPostServiceAsync.retrieve("id")

        socialPost.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialPostServiceAsync = client.socialPosts()

        val socialPost =
            socialPostServiceAsync.update(
                SocialPostUpdateParams.builder()
                    .id("id")
                    .createSocialPost(
                        CreateSocialPost.builder()
                            .caption("caption")
                            .addSocialAccount("string")
                            .addAccountConfiguration(
                                CreateSocialPost.AccountConfiguration.builder()
                                    .configuration(
                                        CreateSocialPost.AccountConfiguration.Configuration
                                            .builder()
                                            .allowComment(true)
                                            .allowDuet(true)
                                            .allowStitch(true)
                                            .autoAddMusic(true)
                                            .addBoardId("string")
                                            .caption(JsonValue.from(mapOf<String, Any>()))
                                            .addCollaborator(
                                                listOf(JsonValue.from(mapOf<String, Any>()))
                                            )
                                            .communityId("community_id")
                                            .discloseBrandedContent(true)
                                            .discloseYourBrand(true)
                                            .isAiGenerated(true)
                                            .isDraft(true)
                                            .link("link")
                                            .location("location")
                                            .madeForKids(true)
                                            .addMedia("string")
                                            .placement(
                                                CreateSocialPost.AccountConfiguration.Configuration
                                                    .Placement
                                                    .REELS
                                            )
                                            .poll(
                                                CreateSocialPost.AccountConfiguration.Configuration
                                                    .Poll
                                                    .builder()
                                                    .durationMinutes(0.0)
                                                    .addOption("string")
                                                    .replySettings(
                                                        CreateSocialPost.AccountConfiguration
                                                            .Configuration
                                                            .Poll
                                                            .ReplySettings
                                                            .FOLLOWING
                                                    )
                                                    .build()
                                            )
                                            .privacyStatus(
                                                CreateSocialPost.AccountConfiguration.Configuration
                                                    .PrivacyStatus
                                                    .PUBLIC
                                            )
                                            .quoteTweetId("quote_tweet_id")
                                            .replySettings(
                                                CreateSocialPost.AccountConfiguration.Configuration
                                                    .ReplySettings
                                                    .FOLLOWING
                                            )
                                            .shareToFeed(true)
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
                                    .addTag(
                                        CreateSocialPost.Media.Tag.builder()
                                            .id("id")
                                            .platform(CreateSocialPost.Media.Tag.Platform.FACEBOOK)
                                            .type(CreateSocialPost.Media.Tag.Type.USER)
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
                                                    .addTag(
                                                        BlueskyConfigurationDto.Media.Tag.builder()
                                                            .id("id")
                                                            .platform(
                                                                BlueskyConfigurationDto.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                BlueskyConfigurationDto.Media.Tag
                                                                    .Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .facebook(
                                        FacebookConfigurationDto.builder()
                                            .caption(JsonValue.from(mapOf<String, Any>()))
                                            .addCollaborator(
                                                listOf(JsonValue.from(mapOf<String, Any>()))
                                            )
                                            .location("location")
                                            .addMedia(
                                                FacebookConfigurationDto.Media.builder()
                                                    .url("url")
                                                    .addTag(
                                                        FacebookConfigurationDto.Media.Tag.builder()
                                                            .id("id")
                                                            .platform(
                                                                FacebookConfigurationDto.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                FacebookConfigurationDto.Media.Tag
                                                                    .Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
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
                                                    .addTag(
                                                        InstagramConfigurationDto.Media.Tag
                                                            .builder()
                                                            .id("id")
                                                            .platform(
                                                                InstagramConfigurationDto.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                InstagramConfigurationDto.Media.Tag
                                                                    .Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .build()
                                            )
                                            .placement(InstagramConfigurationDto.Placement.REELS)
                                            .shareToFeed(true)
                                            .build()
                                    )
                                    .linkedin(
                                        LinkedinConfigurationDto.builder()
                                            .caption(JsonValue.from(mapOf<String, Any>()))
                                            .addMedia(
                                                LinkedinConfigurationDto.Media.builder()
                                                    .url("url")
                                                    .addTag(
                                                        LinkedinConfigurationDto.Media.Tag.builder()
                                                            .id("id")
                                                            .platform(
                                                                LinkedinConfigurationDto.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                LinkedinConfigurationDto.Media.Tag
                                                                    .Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
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
                                                    .addTag(
                                                        PinterestConfigurationDto.Media.Tag
                                                            .builder()
                                                            .id("id")
                                                            .platform(
                                                                PinterestConfigurationDto.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                PinterestConfigurationDto.Media.Tag
                                                                    .Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
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
                                                    .addTag(
                                                        ThreadsConfigurationDto.Media.Tag.builder()
                                                            .id("id")
                                                            .platform(
                                                                ThreadsConfigurationDto.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                ThreadsConfigurationDto.Media.Tag
                                                                    .Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
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
                                                    .addTag(
                                                        TiktokConfiguration.Media.Tag.builder()
                                                            .id("id")
                                                            .platform(
                                                                TiktokConfiguration.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                TiktokConfiguration.Media.Tag.Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
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
                                                    .addTag(
                                                        TiktokConfiguration.Media.Tag.builder()
                                                            .id("id")
                                                            .platform(
                                                                TiktokConfiguration.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                TiktokConfiguration.Media.Tag.Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
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
                                                    .addTag(
                                                        TwitterConfigurationDto.Media.Tag.builder()
                                                            .id("id")
                                                            .platform(
                                                                TwitterConfigurationDto.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                TwitterConfigurationDto.Media.Tag
                                                                    .Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .build()
                                            )
                                            .poll(
                                                TwitterConfigurationDto.Poll.builder()
                                                    .durationMinutes(0.0)
                                                    .addOption("string")
                                                    .replySettings(
                                                        TwitterConfigurationDto.Poll.ReplySettings
                                                            .FOLLOWING
                                                    )
                                                    .build()
                                            )
                                            .quoteTweetId("quote_tweet_id")
                                            .replySettings(
                                                TwitterConfigurationDto.ReplySettings.FOLLOWING
                                            )
                                            .build()
                                    )
                                    .youtube(
                                        YoutubeConfigurationDto.builder()
                                            .caption(JsonValue.from(mapOf<String, Any>()))
                                            .madeForKids(true)
                                            .addMedia(
                                                YoutubeConfigurationDto.Media.builder()
                                                    .url("url")
                                                    .addTag(
                                                        YoutubeConfigurationDto.Media.Tag.builder()
                                                            .id("id")
                                                            .platform(
                                                                YoutubeConfigurationDto.Media.Tag
                                                                    .Platform
                                                                    .FACEBOOK
                                                            )
                                                            .type(
                                                                YoutubeConfigurationDto.Media.Tag
                                                                    .Type
                                                                    .USER
                                                            )
                                                            .x(0.0)
                                                            .y(0.0)
                                                            .build()
                                                    )
                                                    .thumbnailTimestampMs(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .thumbnailUrl(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .build()
                                            )
                                            .privacyStatus(
                                                YoutubeConfigurationDto.PrivacyStatus.PUBLIC
                                            )
                                            .title("title")
                                            .build()
                                    )
                                    .build()
                            )
                            .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        socialPost.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialPostServiceAsync = client.socialPosts()

        val socialPosts =
            socialPostServiceAsync.list(
                SocialPostListParams.builder()
                    .addExternalId("string")
                    .limit(0.0)
                    .offset(0.0)
                    .addPlatform(SocialPostListParams.Platform.BLUESKY)
                    .addStatus(SocialPostListParams.Status.DRAFT)
                    .build()
            )

        socialPosts.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            PostForMeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val socialPostServiceAsync = client.socialPosts()

        val socialPost = socialPostServiceAsync.delete("id")

        socialPost.validate()
    }
}
