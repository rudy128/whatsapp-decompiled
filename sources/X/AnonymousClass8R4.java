package X;

import java.util.List;

/* renamed from: X.8R4  reason: invalid class name */
public final class AnonymousClass8R4 extends C181009Ou {
    public final long A00;
    public final long A01;
    public final C180989Os A02;
    public final C24314BzB A03;
    public final Integer A04;
    public final String A05;
    public final List A06;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C181009Ou)) {
                return false;
            }
            AnonymousClass8R4 r7 = (AnonymousClass8R4) ((C181009Ou) obj);
            if (this.A00 != r7.A00 || this.A01 != r7.A01) {
                return false;
            }
            C180989Os r1 = this.A02;
            C180989Os r0 = r7.A02;
            if (r1 == null) {
                if (r0 != null) {
                    return false;
                }
            } else if (!r1.equals(r0)) {
                return false;
            }
            Integer num = this.A04;
            Integer num2 = r7.A04;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            String str = this.A05;
            String str2 = r7.A05;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            List list = this.A06;
            List list2 = r7.A06;
            if (list == null) {
                if (list2 != null) {
                    return false;
                }
            } else if (!list.equals(list2)) {
                return false;
            }
            C24314BzB bzB = this.A03;
            C24314BzB bzB2 = r7.A03;
            return bzB == null ? bzB2 == null : bzB.equals(bzB2);
        }
    }

    public AnonymousClass8R4(C180989Os r1, C24314BzB bzB, Integer num, String str, List list, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = r1;
        this.A04 = num;
        this.A05 = str;
        this.A06 = list;
        this.A03 = bzB;
    }

    public int hashCode() {
        int hashCode;
        long j = this.A00;
        long j2 = this.A01;
        int A0k = (((((((((1000003 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ AnonymousClass001.A0k(this.A02)) * 1000003) ^ AnonymousClass001.A0k(this.A04)) * 1000003) ^ C17900vP.A00(this.A05)) * 1000003;
        List list = this.A06;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((A0k ^ hashCode) * 1000003) ^ C17880vN.A02(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LogRequest{requestTimeMs=");
        A10.append(this.A00);
        A10.append(", requestUptimeMs=");
        A10.append(this.A01);
        A10.append(", clientInfo=");
        A10.append(this.A02);
        A10.append(", logSource=");
        A10.append(this.A04);
        A10.append(", logSourceName=");
        A10.append(this.A05);
        A10.append(", logEvents=");
        A10.append(this.A06);
        A10.append(", qosTier=");
        return AnonymousClass8BX.A0d(this.A03, A10);
    }
}
