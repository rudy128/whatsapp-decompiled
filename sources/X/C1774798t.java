package X;

/* renamed from: X.98t  reason: invalid class name and case insensitive filesystem */
public final class C1774798t extends C180619Ng {
    public final String A00;
    public final String A01;
    public final String A02;

    public C1774798t(String str, String str2, String str3) {
        C18070vi.A0d(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1774798t) {
                C1774798t r5 = (C1774798t) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, (C17880vN.A03(this.A00) + C17900vP.A00(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WfacPushPayload(dataNotificationType=");
        A10.append(this.A00);
        A10.append(", dataToLid=");
        A10.append(this.A01);
        A10.append(", decision=");
        return C17900vP.A0B(this.A02, A10);
    }
}
