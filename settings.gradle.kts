rootProject.name = "getting-started-with-karate-it"

include("getting-started-with-karate-it-app")
include("getting-started-with-karate-it-uat")
include("getting-started-with-karate-it-client")

pluginManagement {
    val spotlessVersion: String by settings
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings

    plugins {
        id("com.diffplug.spotless") version spotlessVersion
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagementVersion
    }
}

/* settings to access TM Internal Artifacts */
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}