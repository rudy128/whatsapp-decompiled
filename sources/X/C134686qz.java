package X;

/* renamed from: X.6qz  reason: invalid class name and case insensitive filesystem */
public final class C134686qz {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134686qz) {
                C134686qz r5 = (C134686qz) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17880vN.A03(this.A00));
    }

    public C134686qz(String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SubmittedReport(responseId=");
        A10.append(this.A00);
        A10.append(", requestId=");
        return C17900vP.A0B(this.A01, A10);
    }
}
