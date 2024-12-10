package X;

/* renamed from: X.4Tg  reason: invalid class name and case insensitive filesystem */
public final class C86834Tg {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86834Tg) {
                C86834Tg r5 = (C86834Tg) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A00), this.A01);
    }

    public C86834Tg(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CheckUiState(isChecked=");
        A10.append(this.A00);
        A10.append(", isEnabled=");
        return C17900vP.A0F(A10, this.A01);
    }
}
