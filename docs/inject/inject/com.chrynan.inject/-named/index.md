//[inject](../../../index.md)/[com.chrynan.inject](../index.md)/[Named](index.md)



# Named  
 [common] @[Qualifier](../-qualifier/index.md)()  
  
annotation class [Named](index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

String-based {@linkplain Qualifier qualifier}.



<p>Example usage:



<pre> public class Car {     &#064;Inject <b>@Named("driver")</b> Seat driverSeat;     &#064;Inject <b>@Named("passenger")</b> Seat passengerSeat;     ... }</pre>

   
 [ios, js] annotation class [Named](index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   
 [jvm] typealias [Named](index.md) = Named   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.inject/Named/Named/#kotlin.String/PointingToDeclaration/"></a>[Named](-named.md)| <a name="com.chrynan.inject/Named/Named/#kotlin.String/PointingToDeclaration/"></a> [common, ios, js] fun [Named](-named.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   <br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.inject/Named/value/#/PointingToDeclaration/"></a>[value](value.md)| <a name="com.chrynan.inject/Named/value/#/PointingToDeclaration/"></a> [common, ios, js] val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|

