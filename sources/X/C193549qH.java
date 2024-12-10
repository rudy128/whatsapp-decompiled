package X;

/* renamed from: X.9qH  reason: invalid class name and case insensitive filesystem */
public final class C193549qH {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193549qH) {
                C193549qH r5 = (C193549qH) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17880vN.A03(this.A00), this.A01);
    }

    public C193549qH(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductBottomSheetErrorState(message=");
        A10.append(this.A00);
        A10.append(", showAsDialog=");
        return C17900vP.A0F(A10, this.A01);
    }
}
