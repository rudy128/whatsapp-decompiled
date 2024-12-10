package X;

/* renamed from: X.2rO  reason: invalid class name and case insensitive filesystem */
public final class C62432rO {
    public final String A00;
    public final String A01;
    public final C139786zR A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62432rO) {
                C62432rO r5 = (C62432rO) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0L = (AnonymousClass000.A0L(this.A02) + C17900vP.A00(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0L + i;
    }

    public C62432rO(C139786zR r1, String str, String str2) {
        this.A02 = r1;
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WaffleCacheQueryResponse(multiDestinationAutoCrosspostingSetting=");
        A10.append(this.A02);
        A10.append(", obfuscatedFBCrosspostingDestinationId=");
        A10.append(this.A00);
        A10.append(", obfuscatedIGCrosspostingDestinationId=");
        return C17900vP.A0B(this.A01, A10);
    }

    public C62432rO() {
        this(new C139786zR(false, false), (String) null, (String) null);
    }
}
