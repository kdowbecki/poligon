plugins {
    java
    application
    id("io.freefair.lombok") version "3.7.5"
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.google.guava:guava:28.0-jre")

    testImplementation("org.junit.jupiter:junit-jupiter:5.4.2")
    testImplementation("org.assertj:assertj-core:3.11.1")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

application {
    // Define the main class for the application
    mainClassName = "poligon.App"
}
