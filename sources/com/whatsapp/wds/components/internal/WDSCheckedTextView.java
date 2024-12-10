package com.whatsapp.wds.components.internal;

import X.AnonymousClass05R;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.C18070vi;
import X.C27651Wy;
import android.content.Context;
import android.util.AttributeSet;

public final class WDSCheckedTextView extends AnonymousClass05R implements C27651Wy {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSCheckedTextView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSCheckedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        AnonymousClass1Y5.A07(this, "Checkbox");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSCheckedTextView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
