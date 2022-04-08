plugins {
  id("org.jetbrains.kotlin.jvm").version("1.6.20")
  application
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  testImplementation("org.jetbrains.kotlin:kotlin-test")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
  mainClass.set("poligon.AppKt")
}
