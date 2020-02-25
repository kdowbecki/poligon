plugins {
    java
    application
    id("io.freefair.lombok") version "5.0.0-rc4"
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.google.guava:guava:28.1-jre")

    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
    testImplementation("org.assertj:assertj-core:3.14.0")
    testImplementation("org.mockito:mockito-junit-jupiter:3.3.0")

}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_13
    targetCompatibility = JavaVersion.VERSION_13
}

application {
    // Define the main class for the application
    mainClassName = "poligon.App"
}
