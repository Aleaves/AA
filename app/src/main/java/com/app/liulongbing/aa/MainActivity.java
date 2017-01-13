package com.app.liulongbing.aa;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        //tv.setText(Html.fromHtml("一经注册，表示您同意我们的<font color='#62adf8'>《用户协议》</font>，点击查看！"));
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        String str = "一经注册，表示您同意我们的《用户协议》，点击查看！";
        SpannableStringBuilder ssBuilder = new SpannableStringBuilder(str);
        ssBuilder.setSpan(new TextClick(),str.indexOf("《"),str.indexOf("》")+1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(ssBuilder);
    }

    private class TextClick extends ClickableSpan{
        @Override
        public void onClick(View widget) {
            Log.i(TAG, "onClick: text");
        }

    }
}
