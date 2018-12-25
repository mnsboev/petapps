group = "com.petapps"
version = "0.0.1-SNAPSHOT"

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> { kotlinOptions.jvmTarget = "1.8" }

buildscript {
	val kotlinVersion = "1.3.10"

	repositories {
		mavenCentral()
	}
	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:2.1.0.RELEASE")
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
		classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
		classpath("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")
	}
}

repositories {
	mavenCentral()
}


apply (plugin = "kotlin")
apply (plugin = "kotlin-spring")
apply (plugin = "kotlin-jpa")
apply (plugin = "org.springframework.boot")
apply (plugin = "io.spring.dependency-management")
plugins {
	application
	kotlin("jvm") version "1.3.10"
	kotlin("kapt") version "1.3.10"
}

dependencies {
	kapt("org.springframework.boot:spring-boot-configuration-processor")
	compile("org.springframework.boot:spring-boot-starter-data-jpa")
	compile("org.springframework.boot:spring-boot-starter-web")
	compile("com.fasterxml.jackson.module:jackson-module-kotlin")
	compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	compile("org.jetbrains.kotlin:kotlin-reflect")
	runtime("org.postgresql:postgresql:42.2.1")
	testCompile("com.nhaarman:mockito-kotlin:1.5.0")
	compile("org.flywaydb:flyway-core:5.2.4")
	testCompile("org.springframework.boot:spring-boot-starter-test") {
		exclude(module = "junit")
	}
	testImplementation("org.junit.jupiter:junit-jupiter-api")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}


