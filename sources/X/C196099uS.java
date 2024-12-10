package X;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* renamed from: X.9uS  reason: invalid class name and case insensitive filesystem */
public final class C196099uS {
    public int A00;
    public long A01;
    public long A02;
    public Integer A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Integer A09;
    public final int A0A;
    public final int A0B;
    public final C20078A6e A0C;
    public final A6Y A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C196099uS) {
                C196099uS r8 = (C196099uS) obj;
                if (!(C18070vi.A18(this.A0E, r8.A0E) && this.A09 == r8.A09 && C18070vi.A18(this.A0D, r8.A0D) && this.A06 == r8.A06 && this.A07 == r8.A07 && this.A05 == r8.A05 && C18070vi.A18(this.A0C, r8.A0C) && this.A04 == r8.A04 && this.A03 == r8.A03 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00 && this.A0A == r8.A0A && this.A08 == r8.A08 && this.A0B == r8.A0B && C18070vi.A18(this.A0G, r8.A0G) && C18070vi.A18(this.A0F, r8.A0F))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C195779tt A00() {
        A6Y a6y;
        C193259pn r4;
        long j;
        List list = this.A0F;
        if (AnonymousClass000.A1a(list)) {
            a6y = (A6Y) C108955ca.A0p(list);
        } else {
            a6y = A6Y.A01;
        }
        UUID fromString = UUID.fromString(this.A0E);
        C18070vi.A0X(fromString);
        Integer num = this.A09;
        HashSet A12 = AnonymousClass8BR.A12(this.A0G);
        A6Y a6y2 = this.A0D;
        C18070vi.A0a(a6y);
        int i = this.A04;
        int i2 = this.A0A;
        C20078A6e a6e = this.A0C;
        long j2 = this.A06;
        long j3 = this.A07;
        if (j3 != 0) {
            r4 = new C193259pn(j3, this.A05);
        } else {
            r4 = null;
        }
        if (num == AnonymousClass00R.A00) {
            boolean A1R = AnonymousClass000.A1R(i);
            Integer num2 = this.A03;
            long j4 = this.A01;
            long j5 = this.A02;
            int i3 = this.A00;
            boolean A1O = AnonymousClass000.A1O((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)));
            j = AnonymousClass9OK.A00(num2, i, i3, j4, j5, j2, this.A05, j3, this.A08, A1R, A1O);
        } else {
            j = Long.MAX_VALUE;
        }
        long j6 = j2;
        return new C195779tt(a6e, a6y2, a6y, r4, num, A12, fromString, i, i2, this.A0B, j6, j);
    }

    public int hashCode() {
        String str;
        int A032 = C17880vN.A03(this.A0E);
        Integer num = this.A09;
        int A0N = (AnonymousClass000.A0N(this.A0C, AnonymousClass001.A0K(this.A05, AnonymousClass001.A0K(this.A07, AnonymousClass001.A0K(this.A06, AnonymousClass000.A0N(this.A0D, (A032 + C72453Mb.A0E(num, C196349ut.A00(num))) * 31))))) + this.A04) * 31;
        int intValue = this.A03.intValue();
        if (intValue != 0) {
            str = "LINEAR";
        } else {
            str = "EXPONENTIAL";
        }
        int A0K = AnonymousClass001.A0K(this.A01, AnonymousClass8BW.A03(str, intValue, A0N));
        long j = this.A08;
        return AnonymousClass000.A0O(this.A0F, AnonymousClass000.A0N(this.A0G, (AnonymousClass001.A0K(j, (((AnonymousClass001.A0K(this.A02, A0K) + this.A00) * 31) + this.A0A) * 31) + this.A0B) * 31));
    }

    public C196099uS(C20078A6e a6e, A6Y a6y, Integer num, Integer num2, String str, List list, List list2, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6) {
        C18070vi.A0j(str, num);
        C18070vi.A0d(num2, 9);
        this.A0E = str;
        this.A09 = num;
        this.A0D = a6y;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A0C = a6e;
        this.A04 = i;
        this.A03 = num2;
        this.A01 = j4;
        this.A02 = j5;
        this.A00 = i2;
        this.A0A = i3;
        this.A08 = j6;
        this.A0B = i4;
        this.A0G = list;
        this.A0F = list2;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WorkInfoPojo(id=");
        A10.append(this.A0E);
        A10.append(", state=");
        A10.append(C196349ut.A00(this.A09));
        A10.append(", output=");
        A10.append(this.A0D);
        A10.append(", initialDelay=");
        A10.append(this.A06);
        A10.append(", intervalDuration=");
        A10.append(this.A07);
        A10.append(", flexDuration=");
        A10.append(this.A05);
        A10.append(", constraints=");
        A10.append(this.A0C);
        A10.append(", runAttemptCount=");
        A10.append(this.A04);
        A10.append(", backoffPolicy=");
        if (this.A03.intValue() != 0) {
            str = "LINEAR";
        } else {
            str = "EXPONENTIAL";
        }
        A10.append(str);
        A10.append(", backoffDelayDuration=");
        A10.append(this.A01);
        A10.append(", lastEnqueueTime=");
        A10.append(this.A02);
        A10.append(", periodCount=");
        A10.append(this.A00);
        A10.append(", generation=");
        A10.append(this.A0A);
        A10.append(", nextScheduleTimeOverride=");
        A10.append(this.A08);
        A10.append(", stopReason=");
        A10.append(this.A0B);
        A10.append(", tags=");
        A10.append(this.A0G);
        A10.append(", progress=");
        return AnonymousClass001.A1F(this.A0F, A10);
    }
}
