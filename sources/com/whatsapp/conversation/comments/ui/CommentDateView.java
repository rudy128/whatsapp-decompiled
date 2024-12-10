package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C72463Mc;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class CommentDateView extends WaTextView {
    public AnonymousClass11P A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentDateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0I();
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A0I() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            C72483Me.A0s(A0X, this);
            this.A00 = AnonymousClass10E.A6O(A0X);
        }
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public CommentDateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0I();
    }

    public /* synthetic */ CommentDateView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
