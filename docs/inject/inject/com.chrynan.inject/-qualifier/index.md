//[inject](../../../index.md)/[com.chrynan.inject](../index.md)/[Qualifier](index.md)

# Qualifier

[common]\
@[Target](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-target/index.html)(allowedTargets = [[AnnotationTarget.ANNOTATION_CLASS](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-a-n-n-o-t-a-t-i-o-n_-c-l-a-s-s/index.html)])

annotation class [Qualifier](index.md)

Identifies qualifier annotations. Anyone can define a new qualifier. A qualifier annotation:

<ul>
<li>is annotated with {@code @Qualifier}, {@code @Retention(RUNTIME)},
    and typically {@code @Documented}.</li>
<li>can have attributes.</li>
<li>may be part of the public API, much like the dependency type, but
    unlike implementation types which needn't be part of the public
    API.</li>
<li>may have restricted usage if annotated with {@code @Target}. While
    this specification covers applying qualifiers to fields and
    parameters only, some injector configurations might use qualifier
    annotations in other places (on methods or classes for example).</li>
</ul><p>For example:<pre>
&#064;java.lang.annotation.Documented
&#064;java.lang.annotation.Retention(RUNTIME)
&#064;javax.inject.Qualifier
public @interface Leather {
    Color color() default Color.TAN;
    public enum Color { RED, BLACK, TAN }
}</pre>

[ios, js]\
annotation class [Qualifier](index.md)

[android, jvm]\
typealias [Qualifier](index.md) = Qualifier

## See also

common

| | |
|---|---|
| [com.chrynan.inject.Named](../-named/index.md) | @Named |

ios

| | |
|---|---|
| [com.chrynan.inject.Named](../-named/index.md) | @Named |

js

| | |
|---|---|
| [com.chrynan.inject.Named](../-named/index.md) | @Named |

android

| | |
|---|---|
| [com.chrynan.inject.Named](../-named/index.md) | @Named |

jvm

| | |
|---|---|
| [com.chrynan.inject.Named](../-named/index.md) | @Named |

## Constructors

| | |
|---|---|
| [Qualifier](-qualifier.md) | [common, ios, js]<br>fun [Qualifier](-qualifier.md)() |
