package com.chrynan.inject

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
expect annotation class Named(val value: String)