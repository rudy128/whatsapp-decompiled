package X;

import java.util.Set;

/* renamed from: X.8vK  reason: invalid class name and case insensitive filesystem */
public class C173588vK extends C63622tQ {
    public int A00 = 0;
    public long A01;
    public long A02;
    public String A03;
    public Set A04;
    public boolean A05;
    public final int A06;
    public final String A07;
    public final String A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C173588vK(X.AnonymousClass190 r17, X.AnonymousClass11P r18, X.AnonymousClass1CP r19, X.C18030ve r20, X.AnonymousClass18K r21, X.AnonymousClass1N7 r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.Set r28, int r29, long r30, long r32) {
        /*
            r16 = this;
            r11 = 1
            r14 = r32
            r4 = r19
            r12 = r30
            r2 = r17
            r1 = r16
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14)
            r0 = 0
            r1.A00 = r0
            r0 = r26
            r1.A08 = r0
            r0 = r28
            r1.A04 = r0
            r0 = r29
            r1.A06 = r0
            r0 = r27
            r1.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173588vK.<init>(X.190, X.11P, X.1CP, X.0ve, X.18K, X.1N7, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Set, int, long, long):void");
    }

    public AnonymousClass184 A03(C57532jE r4, int i) {
        C171588rx r2 = new C171588rx();
        r2.A06 = Long.valueOf(r4.A02);
        r2.A00 = Boolean.valueOf(this.A05);
        Integer num = this.A08;
        if (num != null) {
            r2.A07 = C17890vO.A0N(num);
        }
        r2.A08 = Long.valueOf(this.A01);
        r2.A09 = Long.valueOf(C20099A7c.A03(this.A07));
        r2.A03 = Integer.valueOf(i);
        r2.A0A = Long.valueOf(this.A02);
        r2.A0B = this.A08;
        r2.A01 = Integer.valueOf(this.A06);
        r2.A02 = Integer.valueOf(this.A00);
        r2.A04 = Long.valueOf(r4.A00);
        r2.A05 = Long.valueOf(r4.A01);
        return r2;
    }

    public String A04() {
        return "LoggableReceiptStanza";
    }

    public void A06(AnonymousClass2H4 r2) {
        r2.A03 = C17880vN.A0i();
        r2.A02 = Integer.valueOf(this.A06);
        r2.A0B = this.A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoggableReceiptStanza");
        A10.append("(");
        A10.append(super.toString());
        A10.append("; type=");
        A10.append(this.A08);
        A10.append("; messageType=");
        A10.append(this.A06);
        A10.append("; retryVersion=");
        A10.append(this.A07);
        A10.append("; hasOrphaned=");
        A10.append(this.A05);
        A10.append("; totalCount=");
        A10.append(this.A02);
        A10.append("; processedCount=");
        A10.append(this.A01);
        A10.append("; aggregationType=");
        A10.append(this.A00);
        return AnonymousClass8BU.A0q(A10);
    }
}
