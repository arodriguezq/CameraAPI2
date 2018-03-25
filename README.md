# CameraAPI2
Aplicació destinada a l'entendiment de la [Camera API 2](https://developer.android.com/reference/android/hardware/Camera.html) per capturar imatges i vídeos de manerera senzilla i integrar-ho en casos d'ús reals. En cap cas és permés l'ús d'aquest projecte fora de l'àmbit educatiu.

**Nota:** Aquest porjecte pren com a referència els exemples de Google [Android Camera2Basic](https://github.com/googlesamples/android-Camera2Basic) per a l'apartat fotogràfic i [Android Camera2Video](https://github.com/googlesamples/android-Camera2Video) per a l'apartat de vídeo.

## Instal·lació i configuració
Utilitzant Android Studio 3.0 o superior descàrregar el projecte en local, ja sigui directament amb clone o fen prèviament fork. El projecte incorpora tot lo necessari per funcionar en qualsevol dispositiu amb Android API 21 o superior.  
És possible que en la primera execució aparegui un error relacionat amd l'Android SDK. En aques cas assegurar-se que la `compileSdkVersion` i la `buildToolsVersion` de l'arxiu Gradle siguin de la mateixa versió:

```bash
android {
    compileSdkVersion 26
    defaultConfig {
        applicationId "iam48032574.escoladeltreball.org.cameraapi2"
        minSdkVersion 21
        targetSdkVersion 26
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
    buildToolsVersion '26.0.2'
}
```
