package X;

/* renamed from: X.6E5  reason: invalid class name */
public final class AnonymousClass6E5 extends C123126Tf {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6E5) {
                AnonymousClass6E5 r5 = (AnonymousClass6E5) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A01), this.A00);
    }

    public AnonymousClass6E5(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarUpdated(isCreation=");
        A10.append(this.A01);
        A10.append(", isAutogen=");
        return C17900vP.A0F(A10, this.A00);
    }
}
