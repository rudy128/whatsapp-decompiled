package X;

/* renamed from: X.4T5  reason: invalid class name */
public final class AnonymousClass4T5 {
    public final AnonymousClass4DJ A00;
    public final boolean A01;

    public AnonymousClass4T5(AnonymousClass4DJ r2, boolean z) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4T5) {
                AnonymousClass4T5 r5 = (AnonymousClass4T5) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLogActionButton(callLogActionButtonType=");
        A10.append(this.A00);
        A10.append(", enabled=");
        return C17900vP.A0F(A10, this.A01);
    }
}
