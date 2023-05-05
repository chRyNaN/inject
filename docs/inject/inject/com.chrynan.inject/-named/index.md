//[inject](../../../index.md)/[com.chrynan.inject](../index.md)/[Named](index.md)

# Named

[common]\
@[Qualifier](../-qualifier/index.md)

expect annotation class [Named](index.md)(val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

String-based {@linkplain Qualifier qualifier}.

<p>Example usage:<pre>
public class Car {
    &#064;Inject <b>@Named("driver")</b> Seat driverSeat;
    &#064;Inject <b>@Named("passenger")</b> Seat passengerSeat;
    ...
}</pre>

[js]\
actual annotation class [Named](index.md)(val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

[android, jvm]\
actual typealias [Named](index.md) = Named

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [common, js]<br>[common]<br>expect val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>[js]<br>actual val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
