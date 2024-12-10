package X;

/* renamed from: X.2mA  reason: invalid class name and case insensitive filesystem */
public final class C59352mA {
    public final C58252kO A00;
    public final AnonymousClass2BR A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59352mA) {
                C59352mA r5 = (C59352mA) obj;
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

    public C59352mA(C58252kO r1, AnonymousClass2BR r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerifyDeviceADVResult(deviceIndexList=");
        A10.append(this.A01);
        A10.append(", identityPublicKey=");
        A10.append(this.A00);
        A10.append(", isLocalIdentityKeyMissing=");
        return C17900vP.A0F(A10, this.A02);
    }
}
