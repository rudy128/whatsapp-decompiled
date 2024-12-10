package X;

/* renamed from: X.7DN  reason: invalid class name */
public final class AnonymousClass7DN implements C1605188u {
    public final AnonymousClass6T0 A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7DN) {
                AnonymousClass7DN r5 = (AnonymousClass7DN) obj;
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

    public AnonymousClass7DN(AnonymousClass6T0 r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public AnonymousClass6T0 BN3() {
        return this.A00;
    }

    public boolean Bfr() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Hidden(isPeerScreenSharing=");
        A10.append(this.A01);
        A10.append(", animation=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public AnonymousClass7DN() {
        this((AnonymousClass6T0) null, false);
    }
}
