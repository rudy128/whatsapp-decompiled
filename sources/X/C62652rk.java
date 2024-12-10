package X;

/* renamed from: X.2rk  reason: invalid class name and case insensitive filesystem */
public final class C62652rk {
    public Boolean A00;
    public Long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C53412cU A05;
    public final String A06;

    public C62652rk(C53412cU r7, int i, int i2) {
        this(r7, (String) null, 0, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62652rk) {
                C62652rk r5 = (C62652rk) obj;
                if (!(this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && C18070vi.A18(this.A05, r5.A05) && C18070vi.A18(this.A06, r5.A06))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int i = this.A03;
        if (i == 80) {
            return 3;
        }
        if (i == 443) {
            return 2;
        }
        if (i != 5222) {
            return 4;
        }
        return 1;
    }

    public final Integer A01() {
        C53412cU r0 = this.A05;
        if (r0 == null) {
            return null;
        }
        int i = r0.A00;
        int i2 = 1;
        if (Integer.valueOf(i) == null) {
            return null;
        }
        if (i != 0) {
            int i3 = 2;
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i3 = 4;
                    if (!(i == 3 || i == 4)) {
                        return null;
                    }
                }
            }
            return Integer.valueOf(i3);
        }
        return Integer.valueOf(i2);
    }

    public final String A02() {
        Integer A012 = C63602tO.A01(this.A02);
        if (A012 == null) {
            return null;
        }
        int intValue = A012.intValue();
        if (intValue == 6 || intValue == 4 || intValue == 2 || intValue == 5) {
            return this.A06;
        }
        return null;
    }

    public int hashCode() {
        int i = 0;
        int A0k = ((((((this.A04 * 31) + this.A03) * 31) + this.A02) * 31) + AnonymousClass001.A0k(this.A05)) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return A0k + i;
    }

    public final void A03(Long l) {
        this.A01 = l;
    }

    public final void A04(boolean z) {
        this.A00 = Boolean.valueOf(z);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConnectionMetadata(sessionId=");
        A10.append(this.A04);
        A10.append(", port=");
        A10.append(this.A03);
        A10.append(", connectionSequenceState=");
        A10.append(this.A02);
        A10.append(", dnsResolverInfo=");
        A10.append(this.A05);
        A10.append(", popAddress=");
        return C17900vP.A0B(this.A06, A10);
    }

    public C62652rk(C53412cU r1, String str, int i, int i2, int i3) {
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A05 = r1;
        this.A06 = str;
    }
}
