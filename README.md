圆形指示灯(Indactor)
=======
### 1、简介：<br>
    一个封装好的LinearLayout自定义控件。默认是白色底部圆点。可以在代码中直接属性 填写自定义的宽高，间距、未选中的形状与颜色、选中的后形状与颜色等等。<br>
    学习参考来自：https://github.com/ongakuer/CircleIndicator（大部分内容都是出自他的项目）<br>
    
### 2、使用：<br>
   #### a、直接在XML布局中，直接填写相应属性。在代码中直接关联Viewpager就好了。<br>
```xml
 <com.github.zqhcxy.mycircleindcator.views.CircleIndicator
     android:id="@+id/indicator"
     android:layout_width="match_parent"
     android:layout_height="45dp"
     android:layout_alignParentBottom="true"
     app:ci_drawable="@drawable/white_radius"
     app:ci_drawable_unselected="@drawable/white_radius"/>
```
```java
 indicator.setViewPager(viewpager);
```
    #### b、全部在代码中new出来，填写相应参数属性。配置方法为：<br>
```java
            public void configureIndicator(int indicatorWidth, int indicatorHeight, int indicatorMargin)
            public void configureIndicator(int indicatorWidth, int indicatorHeight, int indicatorMargin,
                                           @AnimatorRes int animatorId, @AnimatorRes int animatorReverseId,
                                           @DrawableRes int indicatorBackgroundId,
                                           @DrawableRes int indicatorUnselectedBackgroundId)
```
### 3、xml中的一些属性：
```xml
            app:ci_width="10dp"//宽
            app:ci_height="4dp"
            app:ci_margin="6dp"
            app:ci_animator="@animator/indicator_animator"//切换动画
            app:ci_animator_reverse="@animator/indicator_animator_reverse"//重置动画
            app:ci_drawable="@drawable/white_radius"//选中形状与颜色
            app:ci_drawable_unselected="@drawable/white_radius"//未选中的颜色
```
### 4、总结：<br>
            很简单的一个自定义底部游标控件。调用与实现简单。<br>
            这里是直接复制到项目中来了，也可以用以下方法:
```java
            compile 'me.relex:circleindicator:1.1.8@aar'
```