package X;

/* renamed from: X.AdI  reason: case insensitive filesystem */
public final class C21026AdI implements C22388B5r {
    public final ADN A00;
    public final boolean A01;

    public C21026AdI(ADN adn, boolean z) {
        C18070vi.A0d(adn, 2);
        this.A01 = z;
        this.A00 = adn;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21026AdI) {
                C21026AdI adI = (C21026AdI) obj;
                if (this.A01 != adI.A01 || !C18070vi.A18(this.A00, adI.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass3MX.A03(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnDeviceSwitchingCodeRequested(showProgress=");
        A10.append(this.A01);
        A10.append(", result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
