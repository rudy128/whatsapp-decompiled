package X;

/* renamed from: X.8R6  reason: invalid class name */
public final class AnonymousClass8R6 extends C181019Ov {
    public final AnonymousClass9IS A00;
    public final C24313BzA A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C181019Ov)) {
                return false;
            }
            C24313BzA bzA = this.A01;
            AnonymousClass8R6 r4 = (AnonymousClass8R6) ((C181019Ov) obj);
            C24313BzA bzA2 = r4.A01;
            if (bzA == null) {
                if (bzA2 != null) {
                    return false;
                }
            } else if (!bzA.equals(bzA2)) {
                return false;
            }
            AnonymousClass9IS r1 = this.A00;
            AnonymousClass9IS r0 = r4.A00;
            return r1 == null ? r0 == null : r1.equals(r0);
        }
    }

    public AnonymousClass8R6(AnonymousClass9IS r1, C24313BzA bzA) {
        this.A01 = bzA;
        this.A00 = r1;
    }

    public int hashCode() {
        return ((1000003 ^ AnonymousClass001.A0k(this.A01)) * 1000003) ^ C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NetworkConnectionInfo{networkType=");
        A10.append(this.A01);
        A10.append(", mobileSubtype=");
        return AnonymousClass8BX.A0d(this.A00, A10);
    }
}
