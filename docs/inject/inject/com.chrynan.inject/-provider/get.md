//[inject](../../../index.md)/[com.chrynan.inject](../index.md)/[Provider](index.md)/[get](get.md)

# get

[common]\
expect abstract fun [get](get.md)(): [T](index.md)

Provides a fully-constructed and injected instance of {@code T}.

#### Throws

| | |
|---|---|
| [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) | if the injector encounters an error while providing an instance. For example, if an injectable member on {@code T} throws an exception, the injector may wrap the exception and throw it to the caller of {@code get()}. Callers should not try to handle such exceptions as the behavior may vary across injector implementations and even different configurations of the same injector. |

[js]\
actual abstract fun [get](get.md)(): [T](index.md)
