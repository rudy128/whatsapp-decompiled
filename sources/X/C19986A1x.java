package X;

/* renamed from: X.A1x  reason: case insensitive filesystem */
public final class C19986A1x {
    public static final C189019iN A04 = new Object();
    public final C193119pZ A00;
    public final C193139pb A01;
    public final C193149pc A02;
    public final C193149pc A03;

    public C19986A1x(C193119pZ r2, C193139pb r3, C193149pc r4, C193149pc r5) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19986A1x) {
                C19986A1x a1x = (C19986A1x) obj;
                if (!C18070vi.A18(this.A01, a1x.A01) || !C18070vi.A18(this.A00, a1x.A00) || !C18070vi.A18(this.A03, a1x.A03) || !C18070vi.A18(this.A02, a1x.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PasskeyEncryptionMetadata(credentialId=");
        A10.append(this.A01);
        A10.append(", encapsulatedRootKey=");
        A10.append(this.A00);
        A10.append(", prfSalt=");
        A10.append(this.A03);
        A10.append(", clientSalt=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
