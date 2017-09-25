# CoreLib-Kotlin

I don't like write the same code every time :sunglasses: 

Let's save your time and use modern features Kotlin language :heartpulse:


Two simple steps:

1. Add to project build.gradle file this code:

```
allprojects {
    repositories {
        google()
        jcenter()
        maven {
            url "https://dl.bintray.com/egorikftp/maven"
        }
    }
}
```

2. Add dependency for you app build.gradle:

```
  implementation 'com.egoriku:CoreLib_Kotlin:0.0.1'
```
