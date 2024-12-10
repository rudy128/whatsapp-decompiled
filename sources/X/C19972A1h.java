package X;

/* renamed from: X.A1h  reason: case insensitive filesystem */
public final class C19972A1h {
    public final C195679tj A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19972A1h) {
                C19972A1h a1h = (C19972A1h) obj;
                if (!(C18070vi.A18(this.A00, a1h.A00) && this.A01 == a1h.A01 && this.A02 == a1h.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass001.A0k(this.A00) * 31, this.A01), this.A02);
    }

    public C19972A1h(C195679tj r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UIModel(appliedPromotion=");
        A10.append(this.A00);
        A10.append(", hasPromotionsFeature=");
        A10.append(this.A01);
        A10.append(", isFetchedAtLeastOnce=");
        return C17900vP.A0F(A10, this.A02);
    }

    public C19972A1h() {
        this((C195679tj) null, false, false);
    }
}
