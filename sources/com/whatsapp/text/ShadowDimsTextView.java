package com.whatsapp.text;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass03P;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class ShadowDimsTextView extends AnonymousClass03P implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowDimsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0O);
        C18070vi.A0X(obtainStyledAttributes);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(1, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(2, 0.0f);
        int color = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            setShadowLayer(dimension, dimension2, dimension3, color);
        } else {
            getPaint().clearShadowLayer();
        }
        obtainStyledAttributes.recycle();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public ShadowDimsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
