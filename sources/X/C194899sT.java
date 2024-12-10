package X;

import javax.crypto.SecretKey;

/* renamed from: X.9sT  reason: invalid class name and case insensitive filesystem */
public final class C194899sT {
    public final C164958aM A00;
    public final AnonymousClass8XI A01;
    public final SecretKey A02;
    public final SecretKey A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194899sT) {
                C194899sT r5 = (C194899sT) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A00))));
    }

    public C194899sT(C164958aM r1, AnonymousClass8XI r2, SecretKey secretKey, SecretKey secretKey2) {
        C18070vi.A0s(r1, secretKey, secretKey2, r2);
        this.A00 = r1;
        this.A03 = secretKey;
        this.A02 = secretKey2;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrepareHelloPayloadResult(clientHelloPayload=");
        A10.append(this.A00);
        A10.append(", serverSecretKey=");
        A10.append(this.A03);
        A10.append(", clientSecretKey=");
        A10.append(this.A02);
        A10.append(", clientSecretData=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
