<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:orientation="horizontal"
android:padding="10dp"
android:layout_width="match_parent"
android:layout_height="wrap_content">

<ImageView
android:id="@+id/item_icon"
android:layout_width="50dp"
android:layout_height="50dp"
android:src="@drawable/ic_launcher_foreground"
android:layout_marginRight="10dp"/>

<TextView
android:id="@+id/item_text"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Item"
android:textSize="18sp"/>
</LinearLayout>