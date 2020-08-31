package com.chrynan.inject

actual interface Provider<T> {

    actual fun get(): T
}