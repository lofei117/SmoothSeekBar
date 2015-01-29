# SmoothSeekBar
A custom Android SeekBar can smooth slide to the new progress.

# How to use

In layout xml file:

```xml
<info.lofei.smoothseekbardemo.SmoothSeekBar
    android:id="@+id/seekbar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
```

In Java code:

```java
SmoothSeekBar seekBar = new SmoothSeekBar(context);
seekBar.setProgress(progress);
...
```

# Effect
![Preview Image](app/preview/SmoothSeekBar.gif "Preview.gif")

# License
The MIT License (MIT)
