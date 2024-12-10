package X;

/* renamed from: X.93t  reason: invalid class name and case insensitive filesystem */
public final class C1763593t extends AnonymousClass9MW {
    public final int A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1763593t) {
                C1763593t r5 = (C1763593t) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A01);
    }

    public C1763593t(int i, String str, String str2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EventShowError(errorCode=");
        A10.append(this.A00);
        A10.append(", errorTitle=");
        A10.append(this.A02);
        A10.append(", errorMessage=");
        return C17900vP.A0B(this.A01, A10);
    }
}
