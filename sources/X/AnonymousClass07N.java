package X;

import androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2;

/* renamed from: X.07N  reason: invalid class name */
public final class AnonymousClass07N extends C015308w implements C16190rr {
    public C16210rt A00;
    public final C02080Cq A01 = C02680Ey.A00(AnonymousClass6YK.A00(C02920Fx.A00, this));

    public static final AnonymousClass0NU A00(AnonymousClass07N r2, C16910tQ r3, C18090vk r4) {
        AnonymousClass0NU r42;
        C16910tQ r22 = r2.A00;
        if (r22 == null || !r22.Be8() || !r3.Be8() || (r42 = (AnonymousClass0NU) r4.invoke()) == null) {
            return null;
        }
        AnonymousClass0NU Bhs = r22.Bhs(r3, false);
        long A0p = AnonymousClass001.A0p(Bhs.A01, Bhs.A03);
        long j = AnonymousClass0QY.A03;
        return r42.A02(A0p);
    }

    public Object BDK(C16910tQ r7, C30391dr r8, C18090vk r9) {
        Object A002 = AnonymousClass1OW.A00(r8, new BringIntoViewResponderNode$bringChildIntoView$2(this, r7, (C30391dr) null, r9, new C08740fa(this, r7, r9)));
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    public AnonymousClass07N(C16210rt r2) {
        this.A00 = r2;
    }

    public C02080Cq BXh() {
        return this.A01;
    }
}
