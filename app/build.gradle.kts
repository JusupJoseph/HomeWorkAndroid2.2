plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)
    id(Plugins.kapt)
    id(Plugins.hilt)
}

android {
    namespace = Config.applicationId
    compileSdk = Config.compileAndTargetSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.compileAndTargetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentationRunner
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures.viewBinding = true
}

dependencies {
    implementation(Dependencies.core)
    implementation(Dependencies.UIComponents.material)
    implementation(Dependencies.UIComponents.constraint)
    implementation(Dependencies.UIComponents.appcompat)
    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.compiler)
    implementation(Dependencies.Glide.glide)
    annotationProcessor(Dependencies.Glide.glideCompiler)
    implementation(Dependencies.NavComponents.navigationUI)
    implementation(Dependencies.NavComponents.navigationFragment)
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.gsonConverter)
    implementation(Dependencies.Lifecycle.lifecycleLiveData)
    implementation(Dependencies.Lifecycle.lifecycleRunTime)
    implementation(Dependencies.Lifecycle.lifecycleViewModel)
    implementation(Dependencies.OkHttp.okHttp)
    implementation(Dependencies.OkHttp.okHttpPlatform)
    implementation(Dependencies.OkHttp.okHttpLoggingInterceptor)
    implementation(Dependencies.ViewBindingPropertyDelegate.viewBindingDelegate)
    implementation(Dependencies.Coroutines.coroutinesCore)
    implementation(Dependencies.Coroutines.coroutinesAndroid)
}