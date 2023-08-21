pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url = uri("https://repo.repsy.io/mvn/chrynan/public") }
    }
}

plugins {
    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.51.0"
////                            # available:"0.60.0"

    // See build.gradle.kts file in root project folder for the rest of the plugins applied.
}

rootProject.name = "inject"

include(":inject")
