package com.whatsapp.settings;

import X.AnonymousClass3N9;
import X.AnonymousClass3OR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;

public class SettingsRowPrivacyLinearLayout extends LinearLayout {
    public float A00;
    public final View A01;

    public void A00() {
        this.A01.setBackgroundDrawable(new AnonymousClass3N9(this));
        AnonymousClass3OR r2 = new AnonymousClass3OR(this);
        r2.setDuration(900);
        r2.setInterpolator(new AccelerateInterpolator());
        startAnimation(r2);
    }

    public SettingsRowPrivacyLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = View.inflate(context, 2131626922, this);
    }

    public SettingsRowPrivacyLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
