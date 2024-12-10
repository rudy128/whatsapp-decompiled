package X;

/* renamed from: X.2lj  reason: invalid class name and case insensitive filesystem */
public final class C59082lj {
    public final boolean A00;
    public final String A01;

    public C59082lj(boolean z, String str) {
        C18070vi.A0d(str, 2);
        this.A00 = z;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59082lj) {
                C59082lj r5 = (C59082lj) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return (i * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IsForwardableInfo(isForwardable=");
        A10.append(this.A00);
        A10.append(", reason=");
        return C17900vP.A0B(this.A01, A10);
    }
}
