# weserv SDK

![Bintray](https://img.shields.io/bintray/v/volcanomobile/public/weservsdk)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

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
