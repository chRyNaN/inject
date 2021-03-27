//[inject](../../../index.md)/[com.chrynan.inject](../index.md)/[Qualifier](index.md)



# Qualifier  
 [common] @[Target](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-target/index.html)(allowedTargets = [[AnnotationTarget.ANNOTATION_CLASS](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-a-n-n-o-t-a-t-i-o-n_-c-l-a-s-s/index.html)])  
  
annotation class [Qualifier](index.md)

Identifies qualifier annotations. Anyone can define a new qualifier. A qualifier annotation:



<ul> <li>is annotated with {@code @Qualifier}, {@code @Retention(RUNTIME)},     and typically {@code @Documented}.</li> <li>can have attributes.</li> <li>may be part of the public API, much like the dependency type, but     unlike implementation types which needn't be part of the public     API.</li> <li>may have restricted usage if annotated with {@code @Target}. While     this specification covers applying qualifiers to fields and     parameters only, some injector configurations might use qualifier     annotations in other places (on methods or classes for example).</li> </ul>



<p>For example:



<pre> &#064;java.lang.annotation.Documented &#064;java.lang.annotation.Retention(RUNTIME) &#064;javax.inject.Qualifier public @interface Leather {     Color color() default Color.TAN;     public enum Color { RED, BLACK, TAN } }</pre>

   
 [ios, js] annotation class [Qualifier](index.md)   
 [jvm] typealias [Qualifier](index.md) = Qualifier   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.inject/Qualifier///PointingToDeclaration/"></a>[com.chrynan.inject.Named](../-named/index.md)| <a name="com.chrynan.inject/Qualifier///PointingToDeclaration/"></a><br><br>@Named<br><br>|
  
ios  
  
| | |
|---|---|
| <a name="com.chrynan.inject/Qualifier///PointingToDeclaration/"></a>[com.chrynan.inject.Named](../-named/index.md)| <a name="com.chrynan.inject/Qualifier///PointingToDeclaration/"></a><br><br>@Named<br><br>|
  
js  
  
| | |
|---|---|
| <a name="com.chrynan.inject/Qualifier///PointingToDeclaration/"></a>[com.chrynan.inject.Named](../-named/index.md)| <a name="com.chrynan.inject/Qualifier///PointingToDeclaration/"></a><br><br>@Named<br><br>|
  
jvm  
  
| | |
|---|---|
| <a name="com.chrynan.inject/Qualifier///PointingToDeclaration/"></a>[com.chrynan.inject.Named](../-named/index.md)| <a name="com.chrynan.inject/Qualifier///PointingToDeclaration/"></a><br><br>@Named<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.inject/Qualifier/Qualifier/#/PointingToDeclaration/"></a>[Qualifier](-qualifier.md)| <a name="com.chrynan.inject/Qualifier/Qualifier/#/PointingToDeclaration/"></a> [common, ios, js] fun [Qualifier](-qualifier.md)()   <br>|

