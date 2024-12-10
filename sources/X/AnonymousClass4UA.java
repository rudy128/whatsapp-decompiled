package X;

/* renamed from: X.4UA  reason: invalid class name */
public final class AnonymousClass4UA {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public AnonymousClass4UA(int i, String str, boolean z) {
        C18070vi.A0d(str, 2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UA) {
                AnonymousClass4UA r5 = (AnonymousClass4UA) obj;
                if (!(this.A00 == r5.A00 && C18070vi.A18(this.A01, r5.A01) && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17890vO.A02(this.A01, this.A00 * 31), this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LimitedTimeOfferExpirationInfo(stringRes=");
        A10.append(this.A00);
        A10.append(", stringContent=");
        A10.append(this.A01);
        A10.append(", isExpiringWithin1Hour=");
        return C17900vP.A0F(A10, this.A02);
    }
}
