package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;

/* renamed from: X.07M  reason: invalid class name */
public final class AnonymousClass07M extends C015308w {
    public C16200rs A00;

    public static final void A00(AnonymousClass07M r2) {
        C16200rs r1 = r2.A00;
        if (r1 instanceof BringIntoViewRequesterImpl) {
            C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) r1).A00.A0H(r2);
        }
    }

    public void A0L() {
        C16200rs r1 = this.A00;
        A00(this);
        if (r1 instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) r1).A00.A0F(this);
        }
        this.A00 = r1;
    }

    public final Object A0N(AnonymousClass0NU r4, C30391dr r5) {
        Object BDK;
        C16190rr r2 = (C16190rr) C02670Ex.A00(this, C02920Fx.A00);
        if (r2 == null) {
            r2 = this.A01;
        }
        C16910tQ r1 = this.A00;
        if (r1 == null || !r1.Be8() || (BDK = r2.BDK(r1, r5, new C08610fN(this, r4))) != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return BDK;
    }

    public void A0M() {
        A00(this);
    }
}
