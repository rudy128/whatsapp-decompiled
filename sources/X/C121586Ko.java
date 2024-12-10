package X;

/* renamed from: X.6Ko  reason: invalid class name and case insensitive filesystem */
public final class C121586Ko extends AnonymousClass6U3 {
    public final String A00;
    public final boolean A01;

    public C121586Ko(String str, boolean z) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121586Ko) {
                C121586Ko r5 = (C121586Ko) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShowSnackbar(snackbarText=");
        A10.append(this.A00);
        A10.append(", isInterested=");
        return C17900vP.A0F(A10, this.A01);
    }
}
