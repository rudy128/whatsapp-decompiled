package X;

/* renamed from: X.98s  reason: invalid class name and case insensitive filesystem */
public final class C1774698s extends C180619Ng {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1774698s) {
                C1774698s r5 = (C1774698s) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + C17900vP.A00(this.A01);
    }

    public C1774698s(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GenericPushPayload(dataNotificationType=");
        A10.append(this.A00);
        A10.append(", dataToLid=");
        return C17900vP.A0B(this.A01, A10);
    }
}
