plugins {
  java
  application
  id("io.freefair.lombok") version "6.5.1"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.google.guava:guava:31.1-jre")
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
  testImplementation("org.assertj:assertj-core:3.23.1")
  testImplementation("org.mockito:mockito-junit-jupiter:4.8.0")
}

tasks.test {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
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
