package X;

/* renamed from: X.6r2  reason: invalid class name and case insensitive filesystem */
public final class C134716r2 {
    public final C136996uk A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134716r2) {
                C134716r2 r5 = (C134716r2) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public C134716r2(C136996uk r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PartialImageResult(downloadData=");
        A10.append(this.A00);
        A10.append(", stopped=");
        return C17900vP.A0F(A10, this.A01);
    }
}
