//[inject](../../../index.md)/[com.chrynan.inject](../index.md)/[Provider](index.md)



# Provider  
 [common] interface [Provider](index.md)<[T](index.md)>

Provides instances of {@code T}. Typically implemented by an injector. For any type {@code T} that can be injected, you can also inject {@code Provider<T>}. Compared to injecting {@code T} directly, injecting {@code Provider<T>} enables:



<ul> <li>retrieving multiple instances.</li> <li>lazy or optional retrieval of an instance.</li> <li>breaking circular dependencies.</li> <li>abstracting scope so you can look up an instance in a smaller scope     from an instance in a containing scope.</li> </ul>



<p>For example:



<pre> class Car {     &#064;Inject Car(Provider&lt;Seat> seatProvider) {       Seat driver = seatProvider.get();       Seat passenger = seatProvider.get();       ...     } }</pre>

   
 [ios, js] interface [Provider](index.md)<[T](index.md)>   
 [jvm] typealias [Provider](index.md) = Provider<[T](index.md)>   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.inject/Provider/get/#/PointingToDeclaration/"></a>[get](get.md)| <a name="com.chrynan.inject/Provider/get/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [get](get.md)(): [T](index.md)  <br>More info  <br>Provides a fully-constructed and injected instance of {@code T}.  <br><br><br>[ios, js]  <br>Content  <br>[ios, js]  <br>abstract fun [get](get.md)(): [T](index.md)  <br>More info  <br>  <br><br><br>|

