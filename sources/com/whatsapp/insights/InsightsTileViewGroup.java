package com.whatsapp.insights;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.C18030ve;
import X.C18070vi;
import X.C90224dj;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public final class InsightsTileViewGroup extends LinearLayout {
    public int A00;
    public C18030ve A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsTileViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        addOnLayoutChangeListener(new C90224dj((Object) this, 7));
    }

    public final C18030ve getAbProps() {
        return this.A01;
    }

    public final void setAbProps(C18030ve r1) {
        this.A01 = r1;
    }

    public /* synthetic */ InsightsTileViewGroup(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InsightsTileViewGroup(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
