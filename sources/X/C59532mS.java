package X;

import java.util.Arrays;

/* renamed from: X.2mS  reason: invalid class name and case insensitive filesystem */
public final class C59532mS {
    public final AnonymousClass2BC A00;
    public final C164308Yi A01;
    public final String A02;
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59532mS) {
                C59532mS r5 = (C59532mS) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)) + Arrays.hashCode(this.A03)) * 31) + this.A02.hashCode();
    }

    public C59532mS(AnonymousClass2BC r1, C164308Yi r2, String str, byte[] bArr) {
        C18070vi.A0k(r2, bArr);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = bArr;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IntermediateKeyMaterial(companionEphemeralIdentity=");
        A10.append(this.A00);
        A10.append(", primaryEphemeralIdentity=");
        A10.append(this.A01);
        A10.append(", encryptionKey=");
        C17890vO.A1C(A10, this.A03);
        A10.append(", verificationCode=");
        return C17900vP.A0B(this.A02, A10);
    }
}
