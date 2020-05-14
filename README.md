# AnimatedToast 🤩❤️🔥 
[![platform](https://img.shields.io/badge/platform-Android-green.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=17)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	 implementation 'com.github.vedraj360:AnimatedToast:0.1.0'
}
```


## Screenshots 🔥❤️🔥 


<p float="left">
	<h3> Light </h3>
  ![demo](https://github.com/vedraj360/AnimatedToast/blob/master/demo/light.gif)
</p>

<p float="left">
<h3> Light </h3>
 ![demo](https://github.com/vedraj360/AnimatedToast/blob/master/demo/dark.gif)
</p>



## ANIMATION_TYPES

```
* ANIMATION_PULSE
* ANIMATION_ROTATE
* ANIMATION_BLINK
* ANIMATION_FLIP

```


## Usage
To display an default Toast:

``` java
AnimatedToast.defaultToast("yourContext","Default Toast",Gravity.CENTER,Toast.LENGTH_SHORT);

```
To display a success Toast:

``` java
AnimatedToast.Success(getApplicationContext(), "Success", Gravity.TOP, Toast.LENGTH_SHORT, AnimatedToast.ANIMATION_ROTATE);
```
To display the error Toast:

``` java
AnimatedToast.Error(getApplicationContext(), "Error", Gravity.CENTER, Toast.LENGTH_SHORT, AnimatedToast.ANIMATION_BLINK);

```

To display a warning Toast:

``` java

AnimatedToast.Warning(getApplicationContext(), "Warning", Gravity.CENTER, Toast.LENGTH_SHORT, AnimatedToast.ANIMATION_PULSE);

```

To display an info Toast:

``` java
AnimatedToast.Info(getApplicationContext(), "Info", Gravity.BOTTOM, Toast.LENGTH_SHORT, AnimatedToast.ANIMATION_FLIP);
```




## Dark Theme Toast

Just write DesignerToast.STYLE_DARK in parameter


## Usage

To display a success Toast:

``` java
AnimatedToast.Success("yourContext", "Success","Hello this is demo success!",Gravity.CENTER, Toast.LENGTH_SHORT,AnimatedToast.STYLE_DARK, AnimatedToast.ANIMATION_ROTATE);
```
To display the error Toast:

``` java
AnimatedToast.Error("yourContext", "Error","Hello this is demo error!",Gravity.CENTER, Toast.LENGTH_SHORT,AnimatedToast.STYLE_DARK,AnimatedToast.ANIMATION_BLINK);
```

To display a warning Toast:

``` java
AnimatedToast.Warning("yourContext", "Warning", "Hello this is demo warning!",Gravity.CENTER, Toast.LENGTH_SHORT,AnimatedToast.STYLE_DARK, AnimatedToast.ANIMATION_FLIP);
```

To display an info Toast:

``` java
AnimatedToast.Info("yourContext", "Info","Hello this is demo info!",Gravity.CENTER, Toast.LENGTH_SHORT,AnimatedToast.STYLE_DARK,AnimatedToast.ANIMATION_PULSE);
```




## Dark Theme Screenshots

<p float="center"> <img src="https://github.com/vedraj360/AnimatedToast/blob/master/Screenshots/sample_dark_toast.png" width="500" hspace="40"/>

## Contributing

Please fork this repository and contribute back.
Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2020 Vedraj360

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
