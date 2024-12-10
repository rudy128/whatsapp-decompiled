package X;

/* renamed from: X.9q3  reason: invalid class name and case insensitive filesystem */
public final class C193409q3 {
    public final C20002A2r A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193409q3) {
                C193409q3 r5 = (C193409q3) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + C17900vP.A00(this.A01);
    }

    public C193409q3(C20002A2r a2r, String str) {
        this.A00 = a2r;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CachedLocalFile(localFile=");
        A10.append(this.A00);
        A10.append(", transactionId=");
        return C17900vP.A0B(this.A01, A10);
    }
}
