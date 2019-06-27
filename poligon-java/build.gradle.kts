plugins {
    java
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.google.guava:guava:28.0-jre")

    testImplementation("org.junit.jupiter:junit-jupiter:5.4.2")
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
