package com.huangasys.immersiondemo;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 1.通过工具类,顶部栏这是0dp的View 然后设置padding;
        StatusBarUtil.darkMode(this);
        View barView = findViewById(R.id.bar_view);
        barView.getLayoutParams().height = ScreenUtils.getStatusHeight(this);

        /* 2  顶部标题栏设置id 找到id 设置padding
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }else if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        int height = ScreenUtils.getStatusHeight(this);
        Log.d("print", "onCreate: height--"+height);
        if(height != -1){
            //设置Padding;
            View view = findViewById(R.id.actionbar);
            if(view != null){
                view.setPadding(0,height,0,0);
            }
        }
*/
    }
}
