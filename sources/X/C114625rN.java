package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.5rN  reason: invalid class name and case insensitive filesystem */
public abstract class C114625rN extends C110815h9 {
    public C27841Xv A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114625rN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00(this);
    }

    public final void setBidiToolbarDelegate(C27841Xv r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final C27841Xv getBidiToolbarDelegate() {
        C27841Xv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bidiToolbarDelegate");
        throw null;
    }

    public static final void A00(C114625rN r2) {
        C27841Xv bidiToolbarDelegate = r2.getBidiToolbarDelegate();
        if (!r2.isInEditMode()) {
            r2.setLayoutDirection(AnonymousClass3MW.A1Z(bidiToolbarDelegate.A00) ? 1 : 0);
        }
    }
}
