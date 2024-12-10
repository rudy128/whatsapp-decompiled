package X;

/* renamed from: X.08v  reason: invalid class name and case insensitive filesystem */
public final class C015208v extends AnonymousClass0XW implements C17540up, C17600uv {
    public C16910tQ A00;
    public boolean A01;

    public /* synthetic */ Object BPr(AnonymousClass0OJ r2) {
        return C02670Ex.A00(this, r2);
    }

    private final C22821Di A00() {
        if (this.A07) {
            return (C22821Di) C02670Ex.A00(this, C02900Fv.A00);
        }
        return null;
    }

    private final void A01() {
        C22821Di A002;
        C16910tQ r0 = this.A00;
        if (r0 != null) {
            C18070vi.A0b(r0);
            if (r0.Be8() && (A002 = A00()) != null) {
                A002.invoke(this.A00);
            }
        }
    }

    public final void A0N(boolean z) {
        if (z != this.A01) {
            if (!z) {
                C22821Di A002 = A00();
                if (A002 != null) {
                    A002.invoke((Object) null);
                }
            } else {
                A01();
            }
            this.A01 = z;
        }
    }

    public void BvI(C16910tQ r3) {
        this.A00 = r3;
        if (!this.A01) {
            return;
        }
        if (r3.Be8()) {
            A01();
            return;
        }
        C22821Di A002 = A00();
        if (A002 != null) {
            A002.invoke((Object) null);
        }
    }

    public /* synthetic */ C02080Cq BXh() {
        return AnonymousClass0AP.A00;
    }
}
