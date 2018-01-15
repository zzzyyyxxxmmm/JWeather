# JWeather
a weather app


## Log
**2018-1-6 21:21:39**
add 'real' splash screen.
Before this project, I always used handler to sendEmptydelay() to do it. However, if you want to use splash screen, you must 
do something at the background. So, I tried RxJava to initialize app data and it worked pretty well. After initializing data, it will jump
to MainActivity.
```java
Observable.just(initialdata())
          .subscribeOn(Schedulers.io())
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe(result -> MainActivity());
```
Tips: You need to use style.xml to set your background, because setcontentview doesn't work here

**2018-1-7 15:42:33**
add NavigationView
add pulltoRefresh
use RxJava+Retrofit to load info from weatherAPI

**2018-1-8 20:54:56**
implement simple mvp architechture

<img src="https://github.com/zzzyyyxxxmmm/JWeather/blob/master/photo/uml01.png" width="60%" height="60%">

**2018-1-15 17:01:30**
After learning Dagger2+[android-architecture by google](https://github.com/googlesamples/android-architecture) and solving numbers of bugs from Dagger2,
I use Retrofit2+RxJava2+Dagger2+MVP to display weather into fragment

<img src="https://github.com/zzzyyyxxxmmm/JWeather/blob/master/photo/02.png">