// File generated from our OpenAPI spec by Stainless.

package com.post_for_me.api.errors

import com.post_for_me.api.core.JsonValue
import com.post_for_me.api.core.http.Headers

abstract class PostForMeServiceException
protected constructor(message: String, cause: Throwable? = null) :
    PostForMeException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
