import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.4.31"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_15
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
