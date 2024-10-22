plugins {
  java
  application
  id("io.freefair.lombok") version "8.10.2"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.google.guava:guava:33.2.1-jre")
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.3")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
  testImplementation("org.assertj:assertj-core:3.26.3")
  testImplementation("org.mockito:mockito-junit-jupiter:5.14.2")
}

tasks.test {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
  }
}

application {
  mainClass.set("poligon.App")
}

tasks.withType<Jar> {
  manifest {
    attributes["Main-Class"] = "poligon.App"
  }
}
