package com.whatsapp.components;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C146437Pc;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public final class AutoOrientationLinearLayout extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        post(new C146437Pc(this, 26));
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AutoOrientationLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
