# kotlin-parcelize-serializable-issue

Run this project on any device and click one of the two buttons:
- The first one will use a Parcelable without any Serializable and works fine
- The second one contains a Serializable - and will crash

The stacktrace will be something like the following:

```
08-17 14:45:18.837 18583-18583/de.cdehning.parcelize_serializable E/AndroidRuntime: FATAL EXCEPTION: main
                                                                                    Process: de.cdehning.parcelize_serializable, PID: 18583
                                                                                    java.lang.NoSuchMethodError: No virtual method writeSerializable(Ljava/util/Currency;)V in class Landroid/os/Parcel; or its super classes (declaration of 'android.os.Parcel' appears in /system/framework/framework.jar)
                                                                                        at de.cdehning.parcelize_serializable.ParcelizeMe.writeToParcel(ParcelizeMe.kt)
                                                                                        at android.os.Parcel.writeParcelable(Parcel.java:1496)
                                                                                        at android.os.Parcel.writeValue(Parcel.java:1402)
                                                                                        at android.os.Parcel.writeArrayMapInternal(Parcel.java:724)
                                                                                        at android.os.BaseBundle.writeToParcelInner(BaseBundle.java:1408)
                                                                                        at android.os.Bundle.writeToParcel(Bundle.java:1157)
                                                                                        at android.os.Parcel.writeBundle(Parcel.java:764)
                                                                                        at android.content.Intent.writeToParcel(Intent.java:8687)
                                                                                        at android.app.ActivityManagerProxy.startActivity(ActivityManagerNative.java:3082)
                                                                                        at android.app.Instrumentation.execStartActivity(Instrumentation.java:1518)
                                                                                        at android.app.Activity.startActivityForResult(Activity.java:4228)
                                                                                        at android.support.v4.app.BaseFragmentActivityApi16.startActivityForResult(BaseFragmentActivityApi16.java:54)
                                                                                        at android.support.v4.app.FragmentActivity.startActivityForResult(FragmentActivity.java:65)
                                                                                        at android.app.Activity.startActivityForResult(Activity.java:4186)
                                                                                        at android.support.v4.app.FragmentActivity.startActivityForResult(FragmentActivity.java:711)
                                                                                        at android.app.Activity.startActivity(Activity.java:4525)
                                                                                        at android.app.Activity.startActivity(Activity.java:4493)
                                                                                        at de.cdehning.parcelize_serializable.MainActivity$onCreate$1.onClick(MainActivity.kt:16)
                                                                                        at android.view.View.performClick(View.java:5637)
                                                                                        at android.view.View$PerformClick.run(View.java:22429)
                                                                                        at android.os.Handler.handleCallback(Handler.java:751)
                                                                                        at android.os.Handler.dispatchMessage(Handler.java:95)
                                                                                        at android.os.Looper.loop(Looper.java:154)
                                                                                        at android.app.ActivityThread.main(ActivityThread.java:6121)
                                                                                        at java.lang.reflect.Method.invoke(Native Method)
                                                                                        at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:889)
                                                                                        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:779)
```
