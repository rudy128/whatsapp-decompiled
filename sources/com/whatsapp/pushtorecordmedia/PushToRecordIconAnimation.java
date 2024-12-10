package com.whatsapp.pushtorecordmedia;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.C108395bd;
import X.C18070vi;
import X.C97634pn;
import X.C97644po;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class PushToRecordIconAnimation extends FrameLayout implements C108395bd {
    public C108395bd A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PushToRecordIconAnimation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void A00(boolean z) {
        C108395bd r0;
        if (this.A00 == null) {
            if (z) {
                r0 = new C97644po(this);
            } else {
                r0 = new C97634pn(this);
            }
            this.A00 = r0;
            return;
        }
        throw AnonymousClass000.A0n("PushToRecordIconAnimation already initialized");
    }

    public void BhF(int i) {
        C108395bd r0 = this.A00;
        C18070vi.A0b(r0);
        r0.BhF(i);
    }

    public void CBk(int i) {
        C108395bd r0 = this.A00;
        C18070vi.A0b(r0);
        r0.CBk(i);
    }

    public int getTint() {
        C108395bd r0 = this.A00;
        C18070vi.A0b(r0);
        return r0.getTint();
    }

    public void setTint(int i) {
        C108395bd r0 = this.A00;
        C18070vi.A0b(r0);
        r0.setTint(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushToRecordIconAnimation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ PushToRecordIconAnimation(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r6) {
        this(context, attributeSet, AnonymousClass3MY.A00(i2, i));
    }
}
