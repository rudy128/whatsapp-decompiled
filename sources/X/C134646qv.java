package X;

/* renamed from: X.6qv  reason: invalid class name and case insensitive filesystem */
public final class C134646qv {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134646qv) {
                C134646qv r5 = (C134646qv) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A01) * 31) + C108955ca.A06(this.A00);
    }

    public C134646qv(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EntryPointConversionData(source=");
        A10.append(this.A01);
        A10.append(", app=");
        return C17900vP.A0B(this.A00, A10);
    }
}
