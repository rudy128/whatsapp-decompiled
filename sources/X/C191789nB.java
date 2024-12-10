package X;

import android.content.Context;

/* renamed from: X.9nB  reason: invalid class name and case insensitive filesystem */
public class C191789nB {
    public static AnonymousClass9BK A09;
    public static AnonymousClass9B6 A0A;
    public final AnonymousClass190 A00;
    public final C175718zA A01;
    public final BCB A02;
    public final AnonymousClass1KG A03;
    public final AnonymousClass1QD A04;
    public final AnonymousClass1QH A05;
    public final AZC A06;
    public final C30931ek A07;
    public final AnonymousClass10I A08;

    public synchronized void A00() {
        C30931ek r9 = this.A07;
        AZC azc = this.A06;
        BCB bcb = this.A02;
        C175718zA r4 = this.A01;
        AnonymousClass1QH r7 = this.A05;
        AnonymousClass9BK r2 = new AnonymousClass9BK(this.A00, r4, bcb, this.A03, r7, azc, r9, !this.A04.A03().getBoolean("payments_sandbox", false));
        A09 = r2;
        AnonymousClass3MW.A1T(r2, this.A08, 0);
    }

    public C191789nB(AnonymousClass190 r16, AnonymousClass1KB r17, AnonymousClass11S r18, AnonymousClass118 r19, AnonymousClass1OZ r20, AXS axs, BCB bcb, C33711jG r23, C196259ui r24, AnonymousClass1KG r25, AnonymousClass1QD r26, C31061ex r27, AnonymousClass1QH r28, AZ6 az6, AZC azc, A0B a0b, C30931ek r32, AnonymousClass10I r33) {
        this.A00 = r16;
        AnonymousClass10I r13 = r33;
        this.A08 = r13;
        AZC azc2 = azc;
        this.A06 = azc2;
        C30931ek r12 = r32;
        this.A07 = r12;
        this.A04 = r26;
        this.A05 = r28;
        this.A03 = r25;
        BCB bcb2 = bcb;
        this.A02 = bcb2;
        Context context = r19.A00;
        String A0B = r18.A0B();
        C17960vV.A07(A0B);
        AnonymousClass1KB r2 = r17;
        AXS axs2 = axs;
        C33711jG r6 = r23;
        C196259ui r7 = r24;
        this.A01 = new C175718zA(context, r2, r20, axs2, bcb2, r6, r7, r27, az6, azc2, a0b, r12, r13, A0B);
    }
}
