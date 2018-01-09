# JWeather
a weather app


## Log
2018-1-6 21:21:39 add 'real' splash screen.
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

2018-1-7 15:42:33
add NavigationView
add pulltoRefresh
use RxJava+Retrofit to load info from weatherAPI

2018-1-8 20:54:56
implement mvp architechture
<img src="https://github.com/zzzyyyxxxmmm/JWeather/blob/master/photo/uml01.png" width="50%" height="50%">