# Inject
A simple Kotlin multi-platform abstraction around the [javax.inject](https://search.maven.org/artifact/javax.inject/javax.inject/1/jar) annotations. This allows using the annotations in Kotlin common code so that platform specific annotation processors can register them.

For more information about the library, refer to the blog post [here](https://chrynan.codes/kotlin-inject/) which was featured in Android Weekly issue #396.
<a href="https://androidweekly.net/issues/issue-396" title="Android Weekly Issue 396">
<img alt="Badge" src="https://androidweekly.net/issues/issue-396/badge" height="20px"></img>
</a>

# Building the library
The library is provided through [Github Packages](https://github.com/chRyNaN/inject/packages). Checkout the [releases](https://github.com/chRyNaN/inject/releases) package to get the latest version.

### Repository
```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/chrynan/inject")
    }
}
```

### Dependencies
**Kotlin Common:**
```kotlin
implementation("com.chrynan.inject:inject-common:VERSION")
```

**Kotlin JVM:**
```kotlin
implementation("com.chrynan.inject:inject-jvm:VERSION")
```

**Kotlin JS:**
```kotlin
implementation("com.chrynan.inject:inject-js:VERSION")
```

## Using the library
Simply use the provided annotations just as you would use the [javax.inject](https://search.maven.org/artifact/javax.inject/javax.inject/1/jar) annotations.

For example, using the `Inject` annotation on a constructor in Kotlin Common code:
```kotlin
class MyUseCase @Inject constructor() { ... }
```

## Available annotations and interfaces
* `@Inject`
* `@Named("name")`
* `@Qualifier`
* `@Scope`
* `@Singletone`
* `Provider<T>`

## [License]("https://github.com/chRyNaN/inject/blob/master/LICENSE")
```
Copyright 2012 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

The [javax.inject](https://search.maven.org/artifact/javax.inject/javax.inject/1/jar) library is also licensed under the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt).