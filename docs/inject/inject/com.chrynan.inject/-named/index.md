//[inject](../../../index.md)/[com.chrynan.inject](../index.md)/[Named](index.md)

# Named

[common]\
@[Qualifier](../-qualifier/index.md)()

annotation class [Named](index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

String-based {@linkplain Qualifier qualifier}.

<p>Example usage:<pre>
public class Car {
    &#064;Inject <b>@Named("driver")</b> Seat driverSeat;
    &#064;Inject <b>@Named("passenger")</b> Seat passengerSeat;
    ...
}</pre>

[ios, js]\
annotation class [Named](index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

[android, jvm]\
typealias [Named](index.md) = Named

## Constructors

| | |
|---|---|
| [Named](-named.md) | [common, ios, js]<br>fun [Named](-named.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [common, ios, js]<br>val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
