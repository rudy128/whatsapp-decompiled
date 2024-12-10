package X;

/* renamed from: X.2Ce  reason: invalid class name and case insensitive filesystem */
public final class C45922Ce extends C36021nD {
    public final C59532mS A00;
    public final C164298Yh A01;
    public final AnonymousClass1OB A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45922Ce(C59532mS r2, C164298Yh r3, AnonymousClass1OB r4) {
        super(r4);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45922Ce) {
                C45922Ce r5 = (C45922Ce) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerificationCodeConfirmedOnCompanion(intermediateKeyMaterial=");
        A10.append(this.A00);
        A10.append(", encryptedPairingRequest=");
        A10.append(this.A01);
        A10.append(", timeoutJob=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
