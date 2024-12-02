package com.datafast.dragonball

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform