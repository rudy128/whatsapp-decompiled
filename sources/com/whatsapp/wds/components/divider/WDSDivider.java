package com.whatsapp.wds.components.divider;

import X.AnonymousClass1Y0;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4DQ;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public final class WDSDivider extends View {
    public C18000vb A00;
    public C18030ve A01;
    public AnonymousClass4DQ A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSDivider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass4DQ r0;
        C18070vi.A0d(context, 1);
        AnonymousClass3MX.A1A(context, this, 2131103166);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A07;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i = obtainStyledAttributes.getInt(0, 0);
            Object[] array = AnonymousClass4DQ.A00.toArray(new AnonymousClass4DQ[0]);
            if (i < 0 || i >= array.length) {
                r0 = AnonymousClass4DQ.THIN;
            } else {
                r0 = array[i];
            }
            setDividerVariant(r0);
            obtainStyledAttributes.recycle();
            this.A03 = true;
        }
    }

    public static /* synthetic */ void getDividerVariant$annotations() {
    }

    public final C18030ve getAbProps() {
        return this.A01;
    }

    public final AnonymousClass4DQ getDividerVariant() {
        return this.A02;
    }

    public final C18000vb getWhatsAppLocale() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        AnonymousClass4DQ r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass4DQ.THIN;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AnonymousClass3Ma.A02(this, r0.height), 1073741824));
    }

    public final void setDividerVariant(AnonymousClass4DQ r4) {
        int i = 0;
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A02, r4);
        this.A02 = r4;
        if (A1Z || !this.A03) {
            if (r4 != null && r4.ordinal() == 0) {
                i = 8;
            }
            setVisibility(i);
            requestLayout();
        }
    }

    public final void setAbProps(C18030ve r1) {
        this.A01 = r1;
    }

    public final void setWhatsAppLocale(C18000vb r1) {
        this.A00 = r1;
    }

    public /* synthetic */ WDSDivider(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
