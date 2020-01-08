package com.chrynan.inject

expect interface Provider<T> {

    fun get(): T
}