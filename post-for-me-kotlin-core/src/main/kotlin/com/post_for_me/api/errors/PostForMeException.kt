package com.post_for_me.api.errors

open class PostForMeException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
