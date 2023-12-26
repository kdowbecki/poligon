plugins {
  java
  application
  id("io.freefair.lombok") version "8.4"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.google.guava:guava:33.0.0-jre")
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
  testImplementation("org.assertj:assertj-core:3.24.2")
  testImplementation("org.mockito:mockito-junit-jupiter:5.8.0")
}

tasks.test {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(21))
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

tasks.withType<JavaCompile>().forEach {
  it.options.compilerArgs.add("--enable-preview")
}
