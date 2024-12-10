package X;

/* renamed from: X.2lk  reason: invalid class name and case insensitive filesystem */
public final class C59092lk {
    public final String A00;
    public final String A01;

    public C59092lk(String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59092lk) {
                C59092lk r5 = (C59092lk) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A01) + C17900vP.A00(this.A00)) * 31 * 31) + 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CriticalEventInfo(event=");
        A10.append(this.A01);
        A10.append(", debugInfo=");
        A10.append(this.A00);
        A10.append(", extraDebugInfo=");
        A10.append((String) null);
        A10.append(", includeStackTrace=");
        return C17900vP.A0F(A10, false);
    }
}
