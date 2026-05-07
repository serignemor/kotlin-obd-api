pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}

plugins {
    id("com.gradle.develocity") version "4.0.1"
}

develocity {
    buildScan {
        termsOfUseUrl = "https://gradle.com/terms-of-service"
        termsOfUseAgree = "yes"
        publishing.onlyIf { System.getenv("CI") != null }
    }
}

rootProject.name = "kotlin-obd-api"
