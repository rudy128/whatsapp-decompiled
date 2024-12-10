package com.whatsapp.privacy.usernotice;

import X.AnonymousClass10E;
import X.AnonymousClass44y;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;

public final class UserNoticeBannerIconView extends AnonymousClass44y {
    public boolean A00;

    public void A05() {
        if (!this.A00) {
            this.A00 = true;
            this.A00 = AnonymousClass10E.AL1(C72483Me.A0P(this));
        }
    }

    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }

    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(2131169111);
    }

    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        A05();
    }

    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public UserNoticeBannerIconView(Context context) {
        super(context);
        A05();
        A05();
    }
}
