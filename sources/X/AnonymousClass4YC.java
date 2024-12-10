package X;

/* renamed from: X.4YC  reason: invalid class name */
public final class AnonymousClass4YC {
    public final C41761x1 A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YC) {
                AnonymousClass4YC r5 = (AnonymousClass4YC) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass4YC(C41761x1 r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(isEdit=");
        A10.append(this.A01);
        A10.append(", labelInfo=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public AnonymousClass4YC() {
        this((C41761x1) null, false);
    }
}
