plugins {
    //alias(libs.plugins.android.application)
    id ("com.android.library")
}



android {
    namespace = "com.example.network"
    compileSdk = 34

    defaultConfig {
        //applicationId = "com.example.network"
        minSdk = 27
        targetSdk = 34
        //versionCode = 1
        //versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    api ("androidx.lifecycle:lifecycle-viewmodel:2.4.0")
    api ("androidx.lifecycle:lifecycle-livedata:2.4.0")
    api ("io.reactivex.rxjava2:rxjava:2.2.21")
    api ("io.reactivex.rxjava2:rxandroid:2.1.1")
    api ("com.squareup.retrofit2:retrofit:2.9.0")
    api ("com.squareup.retrofit2:converter-gson:2.9.0")
    api ("com.squareup.okhttp3:okhttp:4.9.1")
    api ("com.squareup.retrofit2:adapter-rxjava2:2.9.0")
    api("com.squareup.okhttp3:logging-interceptor:3.8.1")
}