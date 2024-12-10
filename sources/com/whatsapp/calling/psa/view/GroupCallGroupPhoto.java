package com.whatsapp.calling.psa.view;

import X.AnonymousClass1VU;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;

public final class GroupCallGroupPhoto extends WaImageView {
    public AnonymousClass1VU A00;
    public boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupCallGroupPhoto(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setPathDrawableHelper(AnonymousClass1VU r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A05() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = AnonymousClass3MZ.A0s(C72483Me.A0P(this));
        }
    }

    public final AnonymousClass1VU getPathDrawableHelper() {
        AnonymousClass1VU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pathDrawableHelper");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallGroupPhoto(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A05();
    }

    public /* synthetic */ GroupCallGroupPhoto(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupCallGroupPhoto(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
