package com.whatsapp.stickers;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public final class TouchDiscardLayout extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchDiscardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchDiscardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public TouchDiscardLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchDiscardLayout(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
