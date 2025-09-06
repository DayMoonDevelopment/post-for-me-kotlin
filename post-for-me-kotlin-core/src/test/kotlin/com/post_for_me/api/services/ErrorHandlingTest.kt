// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.post_for_me.api.client.PostForMeClient
import com.post_for_me.api.client.okhttp.PostForMeOkHttpClient
import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.http.Headers
import com.post_for_me.api.core.jsonMapper
import com.post_for_me.api.errors.BadRequestException
import com.post_for_me.api.errors.InternalServerException
import com.post_for_me.api.errors.NotFoundException
import com.post_for_me.api.errors.PermissionDeniedException
import com.post_for_me.api.errors.PostForMeException
import com.post_for_me.api.errors.RateLimitException
import com.post_for_me.api.errors.UnauthorizedException
import com.post_for_me.api.errors.UnexpectedStatusCodeException
import com.post_for_me.api.errors.UnprocessableEntityException
import com.post_for_me.api.models.socialposts.BlueskyConfigurationDto
import com.post_for_me.api.models.socialposts.CreateSocialPost
import com.post_for_me.api.models.socialposts.FacebookConfigurationDto
import com.post_for_me.api.models.socialposts.InstagramConfigurationDto
import com.post_for_me.api.models.socialposts.LinkedinConfigurationDto
import com.post_for_me.api.models.socialposts.PinterestConfigurationDto
import com.post_for_me.api.models.socialposts.PlatformConfigurationsDto
import com.post_for_me.api.models.socialposts.SocialPostCreateParams
import com.post_for_me.api.models.socialposts.ThreadsConfigurationDto
import com.post_for_me.api.models.socialposts.TiktokConfiguration
import com.post_for_me.api.models.socialposts.TwitterConfigurationDto
import com.post_for_me.api.models.socialposts.YoutubeConfigurationDto
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: PostForMeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            PostForMeOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun socialPostsCreate400() {
        val socialPostService = client.socialPosts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate400WithRawResponse() {
        val socialPostService = client.socialPosts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate401() {
        val socialPostService = client.socialPosts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate401WithRawResponse() {
        val socialPostService = client.socialPosts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate403() {
        val socialPostService = client.socialPosts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate403WithRawResponse() {
        val socialPostService = client.socialPosts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate404() {
        val socialPostService = client.socialPosts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate404WithRawResponse() {
        val socialPostService = client.socialPosts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate422() {
        val socialPostService = client.socialPosts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate422WithRawResponse() {
        val socialPostService = client.socialPosts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate429() {
        val socialPostService = client.socialPosts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate429WithRawResponse() {
        val socialPostService = client.socialPosts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate500() {
        val socialPostService = client.socialPosts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate500WithRawResponse() {
        val socialPostService = client.socialPosts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate999() {
        val socialPostService = client.socialPosts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreate999WithRawResponse() {
        val socialPostService = client.socialPosts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun socialPostsCreateInvalidJsonBody() {
        val socialPostService = client.socialPosts()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<PostForMeException> {
                socialPostService.create(
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
                                                .isAiGenerated(true)
                                                .isDraft(true)
                                                .link("link")
                                                .addMedia("string")
                                                .placement(
                                                    CreateSocialPost.AccountConfiguration
                                                        .Configuration
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
                                                .addMedia(
                                                    FacebookConfigurationDto.Media.builder()
                                                        .url("url")
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
                                                .addMedia(
                                                    InstagramConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
                                                )
                                                .placement(
                                                    InstagramConfigurationDto.Placement.REELS
                                                )
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
                                                .addMedia(
                                                    TwitterConfigurationDto.Media.builder()
                                                        .url("url")
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
                                        .youtube(
                                            YoutubeConfigurationDto.builder()
                                                .caption(JsonValue.from(mapOf<String, Any>()))
                                                .addMedia(
                                                    YoutubeConfigurationDto.Media.builder()
                                                        .url("url")
                                                        .thumbnailTimestampMs(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .thumbnailUrl(
                                                            JsonValue.from(mapOf<String, Any>())
                                                        )
                                                        .build()
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
