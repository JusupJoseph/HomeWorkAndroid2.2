object Dependencies {
    const val core = "androidx.core:core-ktx:1.7.0"

    object UIComponents {
        const val appcompat = "androidx.appcompat:appcompat:1.5.1"
        const val material = "com.google.android.material:material:1.7.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"
    }

    object Coroutines {
        const val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"
        const val coroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    }

    object ViewBindingPropertyDelegate {
        const val viewBindingDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.viewBindingDelegate}"
    }

    object Lifecycle {
        const val lifecycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
        const val lifecycleRunTime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val lifecycleLiveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val compiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    }

    object NavComponents {
        const val navigationFragment =
            "androidx.navigation:navigation-fragment:${Versions.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui:${Versions.navigation}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }

    object OkHttp {
        const val okHttpPlatform = "com.squareup.okhttp3:okhttp-bom:4.10.0"
        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }
}

object Plugins {
    const val hilt = "com.google.dagger.hilt.android"
    const val kapt = "kotlin-kapt"
    const val library = "com.android.library"
    const val application = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
}

object Versions {
    const val coroutinesAndroid = "1.6.4"
    const val coroutinesCore = "1.3.9"
    const val kotlinAndroid = "1.7.20"
    const val viewBindingDelegate = "1.4.7"
    const val hilt = "2.44"
    const val lifecycle = "2.5.1"
    const val navigation = "2.5.3"
    const val retrofit = "2.9.0"
    const val glide = "4.14.2"
    const val application = "7.3.1"
}