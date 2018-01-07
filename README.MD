# JWeather
a weather app


##Log
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