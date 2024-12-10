package com.whatsapp;

import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass5Aw;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import android.content.Context;
import android.util.AttributeSet;

public final class WrapIconTextView extends TextEmojiLabel {
    public final C18100vl A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WrapIconTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    private final int getIconWidth() {
        return C72453Mb.A0I(this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapIconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A00 = AnonymousClass1DF.A01(new AnonymousClass5Aw(this));
    }

    public /* synthetic */ WrapIconTextView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WrapIconTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
