package com.whatsapp.emoji;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class EmojiPopupFooter extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public AnonymousClass031 A01;
    public boolean A02;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public int getTopOffset() {
        return this.A00;
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass1HF.A0a(this, this.A00);
    }

    public void setTopOffset(int i) {
        AnonymousClass1HF.A0a(this, Math.max(Math.min(getHeight(), i), 0) - getTop());
        this.A00 = getTop();
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public EmojiPopupFooter(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
