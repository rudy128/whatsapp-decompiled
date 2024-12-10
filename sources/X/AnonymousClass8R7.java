package X;

import java.util.Map;

/* renamed from: X.8R7  reason: invalid class name */
public final class AnonymousClass8R7 extends C180739Ns {
    public final long A00;
    public final long A01;
    public final C193289pq A02;
    public final Integer A03;
    public final String A04;
    public final Map A05;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C180739Ns)) {
                return false;
            }
            AnonymousClass8R7 r7 = (AnonymousClass8R7) ((C180739Ns) obj);
            if (!this.A04.equals(r7.A04)) {
                return false;
            }
            Integer num = this.A03;
            Integer num2 = r7.A03;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            if (!this.A02.equals(r7.A02) || this.A00 != r7.A00 || this.A01 != r7.A01 || !this.A05.equals(r7.A05)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass8R7(C193289pq r1, Integer num, String str, Map map, long j, long j2) {
        this.A04 = str;
        this.A03 = num;
        this.A02 = r1;
        this.A00 = j;
        this.A01 = j2;
        this.A05 = map;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        return ((((((((((1000003 ^ this.A04.hashCode()) * 1000003) ^ AnonymousClass001.A0k(this.A03)) * 1000003) ^ this.A02.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.A05.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EventInternal{transportName=");
        A10.append(this.A04);
        A10.append(", code=");
        A10.append(this.A03);
        A10.append(", encodedPayload=");
        A10.append(this.A02);
        A10.append(", eventMillis=");
        A10.append(this.A00);
        A10.append(", uptimeMillis=");
        A10.append(this.A01);
        A10.append(", autoMetadata=");
        return AnonymousClass8BX.A0d(this.A05, A10);
    }
}
