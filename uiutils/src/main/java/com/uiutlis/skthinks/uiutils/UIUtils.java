package com.uiutlis.skthinks.uiutils;

import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class UIUtils {

    public static void toggleVisibility(View view, boolean show) {
        if (show) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }

    public static void toggleVisibilityAndSetText(TextView textView, String text) {
        if (!TextUtils.isEmpty(text)) {
            textView.setVisibility(View.VISIBLE);
            textView.setText(Html.fromHtml(text));
        } else {
            textView.setVisibility(View.GONE);
        }
    }
}
