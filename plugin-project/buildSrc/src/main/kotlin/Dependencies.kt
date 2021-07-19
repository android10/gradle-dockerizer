/**
 * Copyright (C) 2021 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.gradle.api.JavaVersion

object PluginConfiguration {
    private const val group = "com.fernandocejas.gradle"

    const val id = group.plus(".dockerizer")
    const val version = "1.0.0"
    const val implementationClass = group.plus(".DockerizerPlugin")
}

object SourceCode {
    val javaCompatibility = JavaVersion.VERSION_1_8
    const val kotlinVersion = "1.4.10"
}

object BuildPlugins {
    object Versions {
        const val gradleVersion = "6.7"
    }

    const val kotlinJvm = "org.jetbrains.kotlin.jvm"
    const val javaGradle = "java-gradle-plugin"
}

object Libraries {
    const val kotlinStd = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${SourceCode.kotlinVersion}"
}