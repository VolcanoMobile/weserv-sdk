# weserv-sdk
Kotlin URL builder for https://images.weserv.nl/

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
        maven { url "https://dl.bintray.com/volcanomobile/public" }
    }
}
```

Then, add the library to your module `build.gradle`
```gradle
dependencies {
    compile 'net.volcanomobile:weservsdk:0.1'
}
