package X;

/* renamed from: X.968  reason: invalid class name */
public final class AnonymousClass968 extends AnonymousClass9MZ {
    public final C188449hR A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass968) {
                AnonymousClass968 r5 = (AnonymousClass968) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass3MX.A03(this.A01));
    }

    public AnonymousClass968(C188449hR r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerifyVpaSuccess(isBackgroundVerification=");
        A10.append(this.A01);
        A10.append(", data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
