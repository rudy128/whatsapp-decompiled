package X;

/* renamed from: X.9qJ  reason: invalid class name and case insensitive filesystem */
public final class C193569qJ {
    public String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193569qJ) {
                C193569qJ r5 = (C193569qJ) obj;
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

    public C193569qJ(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SurveySessionIds(sessionId=");
        A10.append(this.A00);
        A10.append(", businessSessionId=");
        return C17900vP.A0B(this.A01, A10);
    }
}
