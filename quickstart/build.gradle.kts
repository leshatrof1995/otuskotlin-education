plugins {
    kotlin("jvm")
}

group = "otus.otuskotlin.education"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))
}