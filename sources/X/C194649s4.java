package X;

/* renamed from: X.9s4  reason: invalid class name and case insensitive filesystem */
public final class C194649s4 {
    public final AnonymousClass99F A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194649s4) {
                C194649s4 r5 = (C194649s4) obj;
                if (this.A02 != r5.A02 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17890vO.A02(this.A01, AnonymousClass3MX.A03(this.A02)));
    }

    public C194649s4(AnonymousClass99F r1, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RequestDeviceSwitchingParams(showProgress=");
        A10.append(this.A02);
        A10.append(", autoVerification=");
        A10.append(this.A01);
        A10.append(", clientMetrics=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
