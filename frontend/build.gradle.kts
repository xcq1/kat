plugins {
    kotlin("js") version "1.5.30"
}

group = "com.xcq1"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers") }
}

dependencies {
    val kotlinSuffix = "pre.236-kotlin-1.5.30"

    implementation(kotlin("stdlib-js", "1.5.30"))
    implementation("org.jetbrains.kotlin-wrappers", "kotlin-styled", "5.3.0-$kotlinSuffix")
    implementation(npm("react-hot-loader", "^4.12.20"))
    implementation("com.ccfraser.muirwik:muirwik-components:0.9.0")

    testImplementation(kotlin("test-js"))
}

kotlin {
    js(IR) {
        binaries.executable()
        useCommonJs()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}