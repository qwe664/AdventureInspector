plugins {
    java
}

group = "io.github.qwe664"
version = "0.1.0-MVP"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.8-R0.1-SNAPSHOT")

    // Adventure MiniMessage
    compileOnly("net.kyori:adventure-text-minimessage:4.17.0")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    processResources {
        filteringCharset = "UTF-8"
    }

    jar {
        archiveBaseName.set("AdventureInspector")
    }
}
