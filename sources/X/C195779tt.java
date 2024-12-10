package X;

import java.util.Set;
import java.util.UUID;

/* renamed from: X.9tt  reason: invalid class name and case insensitive filesystem */
public final class C195779tt {
    public final A6Y A00;
    public final A6Y A01;
    public final Integer A02;
    public final UUID A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final C20078A6e A09;
    public final C193259pn A0A;
    public final Set A0B;

    public C195779tt(C20078A6e a6e, A6Y a6y, A6Y a6y2, C193259pn r5, Integer num, Set set, UUID uuid, int i, int i2, int i3, long j, long j2) {
        C18070vi.A0f(num, 2, a6y);
        this.A03 = uuid;
        this.A02 = num;
        this.A0B = set;
        this.A00 = a6y;
        this.A01 = a6y2;
        this.A05 = i;
        this.A04 = i2;
        this.A09 = a6e;
        this.A07 = j;
        this.A0A = r5;
        this.A08 = j2;
        this.A06 = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        C195779tt r7 = (C195779tt) obj;
        if (this.A05 == r7.A05 && this.A04 == r7.A04 && C18070vi.A18(this.A03, r7.A03) && this.A02 == r7.A02 && C18070vi.A18(this.A00, r7.A00) && C18070vi.A18(this.A09, r7.A09) && this.A07 == r7.A07 && C18070vi.A18(this.A0A, r7.A0A) && this.A08 == r7.A08 && this.A06 == r7.A06 && C18070vi.A18(this.A0B, r7.A0B)) {
            return C18070vi.A18(this.A01, r7.A01);
        }
        return false;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A03);
        Integer num = this.A02;
        int A0N = AnonymousClass000.A0N(this.A0B, AnonymousClass000.A0N(this.A00, (A0L + C72453Mb.A0E(num, C196349ut.A00(num))) * 31));
        int A0N2 = AnonymousClass000.A0N(this.A09, (((AnonymousClass000.A0N(this.A01, A0N) + this.A05) * 31) + this.A04) * 31);
        return AnonymousClass001.A0K(this.A08, (AnonymousClass001.A0K(this.A07, A0N2) + AnonymousClass001.A0l(this.A0A)) * 31) + this.A06;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WorkInfo{id='");
        A10.append(this.A03);
        A10.append("', state=");
        A10.append(C196349ut.A00(this.A02));
        A10.append(", outputData=");
        A10.append(this.A00);
        A10.append(", tags=");
        A10.append(this.A0B);
        A10.append(", progress=");
        A10.append(this.A01);
        A10.append(", runAttemptCount=");
        A10.append(this.A05);
        A10.append(", generation=");
        A10.append(this.A04);
        A10.append(", constraints=");
        A10.append(this.A09);
        A10.append(", initialDelayMillis=");
        A10.append(this.A07);
        A10.append(", periodicityInfo=");
        A10.append(this.A0A);
        A10.append(", nextScheduleTimeMillis=");
        A10.append(this.A08);
        A10.append("}, stopReason=");
        return C17880vN.A0t(A10, this.A06);
    }
}
