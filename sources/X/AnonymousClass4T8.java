package X;

/* renamed from: X.4T8  reason: invalid class name */
public final class AnonymousClass4T8 {
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4T8) {
                AnonymousClass4T8 r5 = (AnonymousClass4T8) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(this.A00 * 31, this.A01);
    }

    public AnonymousClass4T8(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HeaderUiState(labelResId=");
        A10.append(this.A00);
        A10.append(", e2eeIconVisible=");
        return C17900vP.A0F(A10, this.A01);
    }
}
