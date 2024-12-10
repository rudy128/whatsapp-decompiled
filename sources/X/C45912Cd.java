package X;

/* renamed from: X.2Cd  reason: invalid class name and case insensitive filesystem */
public final class C45912Cd extends C36021nD {
    public final C59532mS A00;
    public final AnonymousClass1OB A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45912Cd) {
                C45912Cd r5 = (C45912Cd) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C45912Cd(C59532mS r1, AnonymousClass1OB r2) {
        super(r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PendingPrimaryEphemeralIdentityResult(intermediateKeyMaterial=");
        A10.append(this.A00);
        A10.append(", timeoutJob=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
