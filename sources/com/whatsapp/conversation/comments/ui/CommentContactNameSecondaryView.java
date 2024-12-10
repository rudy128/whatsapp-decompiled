package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C18070vi;
import X.C27691Xc;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;

public final class CommentContactNameSecondaryView extends TextEmojiLabel {
    public AnonymousClass00H A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentContactNameSecondaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0I();
    }

    public final void setElevatedProfileNameHelper(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A0I() {
        if (!this.A01) {
            this.A01 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r0 = A0O.A10;
            C72483Me.A0s(r0, this);
            C72483Me.A0r(r0, this);
            this.A00 = C000200d.A00(A0O.A0z.A6v);
        }
    }

    public final AnonymousClass00H getElevatedProfileNameHelper() {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("elevatedProfileNameHelper");
        throw null;
    }

    public CommentContactNameSecondaryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0I();
    }

    public /* synthetic */ CommentContactNameSecondaryView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
