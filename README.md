# Pixel Perfect Design
To make percentile design in kotlin. This lib Will Help you. 


<h3>Pixel Perfect Design is a fase and efficient open source constant management That use for create Percentage wise design. so any size of device it's look Same.</h3>


Download
--------

You can download a jar from GitHub's [releases page][1].

Use with Gradle File
——
Here two version method depends on the Gradle version 

If you are using version 7 or above version 7 

In the ``settings.gradle`` file Put this Two line
   `` 
   jcenter()
   maven { url 'https://jitpack.io' } 
   ``

If your Gradle  version is below 7

In the ``build.gradle(Project level)`` file
    ``
    jcenter() 
    maven { url 'https://jitpack.io' } 
    ``

Also need to Inject this dependency in your `` build.gradle(Module level)``
 ``    implementation 'com.github.kishan-ck:pixeleperfectdesign:0.1.1' ``


 
How do I use Pixel Perfect Design?
-------------------
 
Simple use cases will look something like this:


XML
```
<androidx.constraintlayout.widget.ConstraintLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:id="@+id/hello_layout"/>
```
.Kotlin

``
import com.percentage.percentagedesign.utils
``

Anywhere in your function

```
	utils.setMargin(activity,hello_textView, start = 5.33f , end = 5.33f , top = 3.07f, bottom = 3.07f)
 ```
In this Example I use 
	Left Margin: 5.33%
	Right Margin: 5.33%
	Top Margin: 3.07%
	Bottom Margin: 3.07%

You Can use this with Constant Layout.


Status
------
Version 1.1 is stable now we still working more on this to make easy to use.

Compatibility
-------------

 * **Minimum Android SDK**: Glide v4 requires a minimum API level of 14.
 * **Compile Android SDK**: Glide v4 requires you to compile against API 26 or later.


**Note**: Make sure your *Android SDK* has the *Android Support Repository* installed, and that your `$ANDROID_HOME` environment
variable is pointing at the SDK or add a `local.properties` file in the root project with a `sdk.dir=...` line.


Contributing
------------
Before submitting pull requests, contributors must sign Google's [individual contributor license agreement][7].

Thanks
------
* Everyone who has contributed code and reported issues!
 
