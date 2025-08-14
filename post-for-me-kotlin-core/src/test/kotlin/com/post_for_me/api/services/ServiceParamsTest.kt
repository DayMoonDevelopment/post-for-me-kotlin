// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.post_for_me.api.client.PostForMeClient
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClient
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.models.socialposts.CreateSocialPost
import com.post_for_me.api.models.socialposts.SocialPostCreateParams
import com.post_for_me.api.models.socialposts.TiktokConfiguration
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: PostForMeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            PostForMeOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val socialPostService = client.socialPosts()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        socialPostService.create(
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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
