package X;

/* renamed from: X.4TV  reason: invalid class name */
public final class AnonymousClass4TV {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TV) {
                AnonymousClass4TV r5 = (AnonymousClass4TV) obj;
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

    public AnonymousClass4TV(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InlineState(showInlineRow=");
        A10.append(this.A00);
        A10.append(", showRetake=");
        return C17900vP.A0F(A10, this.A01);
    }
}
