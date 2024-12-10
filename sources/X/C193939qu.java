package X;

/* renamed from: X.9qu  reason: invalid class name and case insensitive filesystem */
public final class C193939qu {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193939qu) {
                C193939qu r5 = (C193939qu) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A00) * 31) + C108955ca.A06(this.A01);
    }

    public C193939qu(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoggableErrorReason(className=");
        A10.append(this.A00);
        A10.append(", message=");
        return C17900vP.A0B(this.A01, A10);
    }
}
