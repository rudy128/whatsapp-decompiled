package X;

import androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1;

/* renamed from: X.08j  reason: invalid class name and case insensitive filesystem */
public final class C014108j extends AnonymousClass0XW {
    public C05420Ud A00;
    public C17210uI A01;

    public static final void A00(C014108j r3, C15670r0 r4, C17210uI r5) {
        if (r3.A07) {
            AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new FocusableInteractionNode$emitWithFallback$1(r4, r5, (C30391dr) null), r3.A0B(), 3);
            return;
        }
        r5.CPx(r4);
    }

    public final void A0N(C17210uI r4) {
        C05420Ud r1;
        if (!C18070vi.A18(this.A01, r4)) {
            C17210uI r2 = this.A01;
            if (!(r2 == null || (r1 = this.A00) == null)) {
                r2.CPx(new C05460Uh(r1));
            }
            this.A00 = null;
            this.A01 = r4;
        }
    }
}
