package X;

/* renamed from: X.4UD  reason: invalid class name */
public final class AnonymousClass4UD {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UD) {
                AnonymousClass4UD r5 = (AnonymousClass4UD) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((AnonymousClass001.A0k(this.A01) * 31) + C17880vN.A02(this.A00)) * 31, this.A02);
    }

    public AnonymousClass4UD(Integer num, Integer num2, boolean z) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorState(messageResId=");
        A10.append(this.A01);
        A10.append(", dialogCode=");
        A10.append(this.A00);
        A10.append(", shouldDismiss=");
        return C17900vP.A0F(A10, this.A02);
    }
}
