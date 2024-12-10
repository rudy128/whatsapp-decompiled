package X;

/* renamed from: X.8vJ  reason: invalid class name and case insensitive filesystem */
public class C173578vJ extends C63622tQ {
    public int A00 = 1;
    public long A01;
    public Integer A02;
    public boolean A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C173578vJ(X.AnonymousClass190 r18, X.AnonymousClass11P r19, X.AnonymousClass1CP r20, X.C18030ve r21, X.AnonymousClass18K r22, X.AnonymousClass1N7 r23, java.lang.Integer r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.String r27, int r28, long r29, long r31, boolean r33, boolean r34, boolean r35) {
        /*
            r17 = this;
            r0 = 1
            r12 = 0
            r13 = r29
            r11 = r27
            r7 = r22
            r6 = r21
            r5 = r20
            r15 = r31
            r3 = r18
            r2 = r17
            r4 = r19
            r8 = r23
            r9 = r24
            r10 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
            r1 = r28
            r2.A04 = r1
            r1 = r35
            r2.A06 = r1
            r1 = r33
            r2.A05 = r1
            r1 = r34
            r2.A07 = r1
            r2.A00 = r0
            r0 = r26
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173578vJ.<init>(X.190, X.11P, X.1CP, X.0ve, X.18K, X.1N7, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, int, long, long, boolean, boolean, boolean):void");
    }

    public AnonymousClass184 A03(C57532jE r4, int i) {
        C171628s1 r2 = new C171628s1();
        r2.A00 = Boolean.valueOf(this.A06);
        r2.A05 = Integer.valueOf(this.A00);
        r2.A0B = Long.valueOf(r4.A02);
        r2.A01 = Boolean.valueOf(this.A03);
        r2.A02 = Boolean.valueOf(this.A05);
        Integer num = this.A08;
        if (num != null) {
            r2.A0C = C17890vO.A0N(num);
        }
        r2.A03 = Boolean.valueOf(this.A07);
        r2.A06 = Integer.valueOf(i);
        r2.A07 = Integer.valueOf(this.A04);
        r2.A0A = Long.valueOf(this.A01);
        r2.A08 = Long.valueOf(r4.A00);
        r2.A09 = Long.valueOf(r4.A01);
        r2.A04 = this.A02;
        return r2;
    }

    public String A04() {
        return "LoggableMessageStanza";
    }

    public void A06(AnonymousClass2H4 r2) {
        r2.A03 = C17880vN.A0h();
        r2.A01 = Integer.valueOf(this.A00);
        r2.A02 = Integer.valueOf(this.A04);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoggableMessageStanza");
        A10.append("(");
        A10.append(super.toString());
        A10.append("; messageType=");
        A10.append(this.A04);
        A10.append("; hasSenderKeyDistributionMessage=");
        A10.append(this.A06);
        A10.append("; ephemeral=");
        A10.append(this.A05);
        A10.append("; revoke=");
        A10.append(this.A07);
        A10.append("; decryptionSuccess=");
        A10.append(this.A03);
        A10.append("; mediaType=");
        A10.append(this.A00);
        A10.append("; decryptQueueSize=");
        A10.append(this.A01);
        return AnonymousClass8BU.A0q(A10);
    }
}
