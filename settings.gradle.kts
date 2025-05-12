rootProject.name = "Android Template"
rootProject.buildFileName = "build.gradle.kts"

include(
    ":app",
)

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
