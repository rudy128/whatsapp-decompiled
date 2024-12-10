package X;

import java.util.Arrays;

/* renamed from: X.8R3  reason: invalid class name */
public final class AnonymousClass8R3 extends C180999Ot {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C181019Ov A03;
    public final Integer A04;
    public final String A05;
    public final byte[] A06;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C180999Ot)) {
                return false;
            }
            AnonymousClass8R3 r7 = (AnonymousClass8R3) ((C180999Ot) obj);
            if (this.A00 != r7.A00) {
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
            if (this.A01 != r7.A01 || !Arrays.equals(this.A06, r7.A06)) {
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
            if (this.A02 != r7.A02) {
                return false;
            }
            C181019Ov r1 = this.A03;
            C181019Ov r0 = r7.A03;
            return r1 == null ? r0 == null : r1.equals(r0);
        }
    }

    public AnonymousClass8R3(C181019Ov r1, Integer num, String str, byte[] bArr, long j, long j2, long j3) {
        this.A00 = j;
        this.A04 = num;
        this.A01 = j2;
        this.A06 = bArr;
        this.A05 = str;
        this.A02 = j3;
        this.A03 = r1;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        long j3 = this.A02;
        return ((((((((((((1000003 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ AnonymousClass001.A0k(this.A04)) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.A06)) * 1000003) ^ C17900vP.A00(this.A05)) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ C17880vN.A02(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LogEvent{eventTimeMs=");
        A10.append(this.A00);
        A10.append(", eventCode=");
        A10.append(this.A04);
        A10.append(", eventUptimeMs=");
        A10.append(this.A01);
        A10.append(", sourceExtension=");
        C17890vO.A1C(A10, this.A06);
        A10.append(", sourceExtensionJsonProto3=");
        A10.append(this.A05);
        A10.append(", timezoneOffsetSeconds=");
        A10.append(this.A02);
        A10.append(", networkConnectionInfo=");
        return AnonymousClass8BX.A0d(this.A03, A10);
    }
}
