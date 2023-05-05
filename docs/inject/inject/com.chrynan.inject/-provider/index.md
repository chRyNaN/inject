//[inject](../../../index.md)/[com.chrynan.inject](../index.md)/[Provider](index.md)

# Provider

[common]\
expect interface [Provider](index.md)&lt;[T](index.md)&gt;

Provides instances of {@code T}. Typically implemented by an injector. For any type {@code T} that can be injected, you can also inject {@code Provider<T>}. Compared to injecting {@code T} directly, injecting {@code Provider<T>} enables:

<ul>
<li>retrieving multiple instances.</li>
<li>lazy or optional retrieval of an instance.</li>
<li>breaking circular dependencies.</li>
<li>abstracting scope so you can look up an instance in a smaller scope
    from an instance in a containing scope.</li>
</ul><p>For example:<pre>
class Car {
    &#064;Inject Car(Provider&lt;Seat> seatProvider) {
      Seat driver = seatProvider.get();
      Seat passenger = seatProvider.get();
      ...
    }
}</pre>

[js]\
actual interface [Provider](index.md)&lt;[T](index.md)&gt;

[android, jvm]\
actual typealias [Provider](index.md) = Provider&lt;[T](index.md)&gt;

## Functions

| Name | Summary |
|---|---|
| [get](get.md) | [common]<br>expect abstract fun [get](get.md)(): [T](index.md)<br>Provides a fully-constructed and injected instance of {@code T}.<br>[js]<br>actual abstract fun [get](get.md)(): [T](index.md) |
