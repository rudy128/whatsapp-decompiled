package X;

/* renamed from: X.2Cf  reason: invalid class name and case insensitive filesystem */
public final class C45932Cf extends C36021nD {
    public final C59532mS A00;
    public final AnonymousClass1OB A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45932Cf) {
                C45932Cf r5 = (C45932Cf) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A02));
    }

    public C45932Cf(C59532mS r1, AnonymousClass1OB r2, boolean z) {
        super(r2);
        this.A00 = r1;
        this.A02 = z;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerificationCodePending(intermediateKeyMaterial=");
        A10.append(this.A00);
        A10.append(", confirmedOnPrimary=");
        A10.append(this.A02);
        A10.append(", timeoutJob=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
