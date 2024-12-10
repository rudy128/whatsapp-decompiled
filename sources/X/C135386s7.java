package X;

/* renamed from: X.6s7  reason: invalid class name and case insensitive filesystem */
public final class C135386s7 {
    public AnonymousClass1E7 A00;
    public boolean A01;
    public final C46162Dk A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135386s7) {
                C135386s7 r5 = (C135386s7) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A02)), this.A01);
    }

    public C135386s7(C46162Dk r1, AnonymousClass1E7 r2, boolean z) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RecommendedNewsletterDataItem(newsletterInfo=");
        C108965cb.A1R(this.A02, A10);
        C108965cb.A1T(this.A00, A10);
        return C17900vP.A0F(A10, this.A01);
    }
}
