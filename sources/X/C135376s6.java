package X;

/* renamed from: X.6s6  reason: invalid class name and case insensitive filesystem */
public final class C135376s6 {
    public String A00 = null;
    public final C122746Rt A01;
    public final boolean A02;

    public C135376s6(C122746Rt r3, boolean z) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135376s6) {
                C135376s6 r5 = (C135376s6) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && C18070vi.A18(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A02) + C17900vP.A00(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterFilterViewItem(type=");
        A10.append(this.A01);
        A10.append(", isSelected=");
        A10.append(this.A02);
        A10.append(", countryIso=");
        return C17900vP.A0B(this.A00, A10);
    }
}
