// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services.async

import com.post_for_me.api.TestServerExtension
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClientAsync
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.models.socialposts.CreateSocialPost
import com.post_for_me.api.models.socialposts.SocialPostCreateParams
import com.post_for_me.api.models.socialposts.SocialPostListParams
import com.post_for_me.api.models.socialposts.SocialPostUpdateParams
import com.post_for_me.api.models.socialposts.TiktokConfiguration
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
                SocialPostCreateParams.builder()
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
                                            .addBoardId("string")
                                            .caption(JsonValue.from(mapOf<String, Any>()))
                                            .discloseBrandedContent(true)
                                            .discloseYourBrand(true)
                                            .link("link")
                                            .addMedia("string")
                                            .placement(
                                                CreateSocialPost.AccountConfiguration.Configuration
                                                    .Placement
                                                    .REELS
                                            )
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
                                            .placement(
                                                CreateSocialPost.PlatformConfigurations.Facebook
                                                    .Placement
                                                    .REELS
                                            )
                                            .build()
                                    )
                                    .instagram(
                                        CreateSocialPost.PlatformConfigurations.Instagram.builder()
                                            .caption(JsonValue.from(mapOf<String, Any>()))
                                            .addCollaborator("string")
                                            .addMedia("string")
                                            .placement(
                                                CreateSocialPost.PlatformConfigurations.Instagram
                                                    .Placement
                                                    .REELS
                                            )
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
                                            .addMedia("string")
                                            .placement(
                                                CreateSocialPost.PlatformConfigurations.Threads
                                                    .Placement
                                                    .REELS
                                            )
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
                                            .addBoardId("string")
                                            .caption(JsonValue.from(mapOf<String, Any>()))
                                            .discloseBrandedContent(true)
                                            .discloseYourBrand(true)
                                            .link("link")
                                            .addMedia("string")
                                            .placement(
                                                CreateSocialPost.AccountConfiguration.Configuration
                                                    .Placement
                                                    .REELS
                                            )
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
                                            .placement(
                                                CreateSocialPost.PlatformConfigurations.Facebook
                                                    .Placement
                                                    .REELS
                                            )
                                            .build()
                                    )
                                    .instagram(
                                        CreateSocialPost.PlatformConfigurations.Instagram.builder()
                                            .caption(JsonValue.from(mapOf<String, Any>()))
                                            .addCollaborator("string")
                                            .addMedia("string")
                                            .placement(
                                                CreateSocialPost.PlatformConfigurations.Instagram
                                                    .Placement
                                                    .REELS
                                            )
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
                                            .addMedia("string")
                                            .placement(
                                                CreateSocialPost.PlatformConfigurations.Threads
                                                    .Placement
                                                    .REELS
                                            )
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
