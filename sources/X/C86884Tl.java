package X;

/* renamed from: X.4Tl  reason: invalid class name and case insensitive filesystem */
public final class C86884Tl {
    public boolean A00;
    public final C89514ca A01;

    public C86884Tl(C89514ca r2, boolean z) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86884Tl) {
                C86884Tl r5 = (C86884Tl) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A01), this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IntegratorInfoWithSelection(integratorInfo=");
        A10.append(this.A01);
        A10.append(", isChecked=");
        return C17900vP.A0F(A10, this.A00);
    }
}
