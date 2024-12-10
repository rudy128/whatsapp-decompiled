package X;

/* renamed from: X.6qy  reason: invalid class name and case insensitive filesystem */
public final class C134676qy {
    public final C129006h6 A00;
    public final C29621ca A01;

    public C134676qy(C129006h6 r2, C29621ca r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134676qy) {
                C134676qy r5 = (C134676qy) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0k(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncryptionProtocolCallbackResponse(encryptedData=");
        A10.append(this.A00);
        A10.append(", responseRootNode=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
