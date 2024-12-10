package com.whatsapp.settings;

import X.C108135bB;
import X.C24261Jm;
import X.C59592mZ;
import X.C62302rB;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class SettingsRowNoticeView extends SettingsRowIconText implements C108135bB {
    public Drawable A00;
    public boolean A01;
    public int A02;

    public int getNoticeId() {
        return this.A02;
    }

    public void setNotice(C62302rB r3) {
        C59592mZ r1 = r3.A05;
        this.A02 = r1.A00;
        setText((CharSequence) r1.A03);
        this.A01.setVisibility(4);
    }

    public SettingsRowNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A00 = C24261Jm.A00(context, 2131232291);
    }

    public SettingsRowNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    public SettingsRowNoticeView(Context context) {
        this(context, (AttributeSet) null);
    }
}
