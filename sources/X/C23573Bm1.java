package X;

/* renamed from: X.Bm1  reason: case insensitive filesystem */
public final class C23573Bm1 extends C4B {
    public final C4C A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C4B)) {
                return false;
            }
            String str = this.A04;
            C23573Bm1 bm1 = (C23573Bm1) ((C4B) obj);
            String str2 = bm1.A04;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.A02;
            String str4 = bm1.A02;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.A03;
            String str6 = bm1.A03;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            C4C c4c = this.A00;
            C4C c4c2 = bm1.A00;
            if (c4c == null) {
                if (c4c2 != null) {
                    return false;
                }
            } else if (!c4c.equals(c4c2)) {
                return false;
            }
            return this.A01.equals(bm1.A01);
        }
    }

    public C23573Bm1(C4C c4c, Integer num, String str, String str2, String str3) {
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = c4c;
        this.A01 = num;
    }

    public int hashCode() {
        String str;
        int A002 = (((((((1000003 ^ C17900vP.A00(this.A04)) * 1000003) ^ C17900vP.A00(this.A02)) * 1000003) ^ C17900vP.A00(this.A03)) * 1000003) ^ AnonymousClass001.A0k(this.A00)) * 1000003;
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "BAD_CONFIG";
        } else {
            str = "OK";
        }
        return A002 ^ (str.hashCode() + intValue);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InstallationResponse{uri=");
        A10.append(this.A04);
        A10.append(", fid=");
        A10.append(this.A02);
        A10.append(", refreshToken=");
        A10.append(this.A03);
        A10.append(", authToken=");
        A10.append(this.A00);
        A10.append(", responseCode=");
        if (this.A01.intValue() != 0) {
            str = "BAD_CONFIG";
        } else {
            str = "OK";
        }
        return BEA.A0n(str, A10);
    }
}
