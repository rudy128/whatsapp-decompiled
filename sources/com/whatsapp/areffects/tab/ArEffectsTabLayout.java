package com.whatsapp.areffects.tab;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6IX;
import X.C106525We;
import X.C18070vi;
import X.C72463Mc;
import X.C97954qK;
import android.content.Context;
import android.util.AttributeSet;
import java.util.List;

public final class ArEffectsTabLayout extends AnonymousClass6IX {
    public boolean A00;
    public final List A01;
    public final int A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArEffectsTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971474);
        C18070vi.A0d(context, 1);
    }

    public final void setOnTabSelectedListener(C106525We r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = new C97954qK(r2, this);
    }

    public void A0K() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            this.A01 = AnonymousClass3Ma.A0a(A0X);
            this.A02 = AnonymousClass10E.A6Q(A0X);
        }
    }

    public int getTabViewRes() {
        return this.A02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0K();
        this.A02 = 2131624211;
        this.A01 = AnonymousClass000.A13();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArEffectsTabLayout(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 2130971474 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArEffectsTabLayout(Context context) {
        this(context, (AttributeSet) null, 2130971474);
        C18070vi.A0d(context, 1);
    }
}
