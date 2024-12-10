package com.whatsapp.privacy.usernotice;

import X.AnonymousClass10E;
import X.AnonymousClass44y;
import X.C18070vi;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class UserNoticeModalIconView extends AnonymousClass44y {
    public ImageView A00;
    public boolean A01;

    public final void setDefaultIconView(ImageView imageView) {
        C18070vi.A0d(imageView, 0);
        this.A00 = imageView;
    }

    public void A05() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = AnonymousClass10E.AL1(C72483Me.A0P(this));
        }
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }

    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(2131169125);
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        A05();
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public UserNoticeModalIconView(Context context) {
        super(context);
        A05();
        A05();
    }
}
