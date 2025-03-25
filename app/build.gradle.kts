plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.sebas.qfinder_front"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.sebas.qfinder_front"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true // Habilita ViewBinding
    }
}

dependencies {
    // Material Design (versión más reciente)
    implementation(libs.material)

    // AndroidX Core
    implementation(libs.appcompat)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Componentes adicionales recomendados
    implementation("androidx.core:core-ktx:1.12.0") // Para Kotlin extensions
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2") // ViewModel

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}