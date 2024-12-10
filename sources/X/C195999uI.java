package X;

import java.util.HashMap;

/* renamed from: X.9uI  reason: invalid class name and case insensitive filesystem */
public final class C195999uI {
    public final C19986A1x A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195999uI) {
                C195999uI r5 = (C195999uI) obj;
                if (this.A03 != r5.A03 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A03) + AnonymousClass001.A0k(this.A00);
    }

    public C195999uI(C19986A1x a1x, boolean z) {
        this.A03 = z;
        this.A00 = a1x;
        boolean z2 = true;
        boolean A1W = AnonymousClass000.A1W(a1x);
        this.A02 = A1W;
        if (!z && !A1W) {
            z2 = false;
        }
        this.A01 = z2;
    }

    public final HashMap A00() {
        HashMap A11 = C17880vN.A11();
        A11.put("isPasswordOrEncryptionKeyEncrypted", new AQW(this.A03));
        C19986A1x a1x = this.A00;
        if (a1x != null) {
            AnonymousClass1D6[] r3 = new AnonymousClass1D6[4];
            AnonymousClass1D6.A03("credentialId", new AQV(C196759vb.A01(a1x.A01.A00)), r3, 0);
            C108985cd.A1G("encapsulatedRootKey", new AQV(C196759vb.A01(a1x.A00.A00)), r3);
            C72463Mc.A1I("prfSalt", new AQV(C196759vb.A01(a1x.A03)), r3);
            C72463Mc.A1J("clientSalt", new AQV(C196759vb.A01(a1x.A02)), r3);
            A11.put("passkeyEncryptionMetadata", new AQX(AnonymousClass1D7.A07(r3)));
        }
        return A11;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncryptionMetadata(isPasswordOrEncryptionKeyEncrypted=");
        A10.append(this.A03);
        A10.append(", passkeyEncryptionMetadata=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
