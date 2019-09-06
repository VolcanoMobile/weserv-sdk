# weserv SDK

[ ![Download](https://api.bintray.com/packages/volcanomobile/public/weservsdk/images/download.svg?version=0.1) ](https://bintray.com/volcanomobile/public/weservsdk/0.1/link)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Kotlin DSL URL builder for https://images.weserv.nl/

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
