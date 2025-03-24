import org.gradle.internal.declarativedsl.parsing.main

plugins {
    id("java")
    id("application")
}
application{
    mainClass = "org.example.Main"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework:spring-context:5.3.30")
    implementation("org.springframework:spring-beans:5.3.30")
    implementation("org.springframework:spring-core:5.3.30")
}

tasks.test {
    useJUnitPlatform()
}