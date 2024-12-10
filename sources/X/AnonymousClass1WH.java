package X;

/* renamed from: X.1WH  reason: invalid class name */
public class AnonymousClass1WH {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass121 A03;
    public final C26141Qz A04;
    public final AnonymousClass1MZ A05;
    public final AnonymousClass1Cd A06;
    public final C24751Ln A07;
    public final AnonymousClass1WG A08;
    public final C202711m A09;
    public final C18030ve A0A;
    public final AnonymousClass1RU A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass1CJ A0D;
    public final AnonymousClass1RR A0E;
    public final AnonymousClass18K A0F;
    public final C25241Nl A0G;

    public void A00(AnonymousClass206 r5, AnonymousClass22A r6, Integer num, Integer num2) {
        AnonymousClass2GS r3 = new AnonymousClass2GS();
        int i = 1;
        if (r6.A01 != 1) {
            i = 2;
        }
        r3.A01 = Integer.valueOf(i);
        r3.A02 = num;
        r3.A00 = num2;
        r3.A05 = Long.valueOf(r6.A0I);
        if (r5 != null) {
            r3.A04 = Long.valueOf((long) r5.A05);
            Integer A042 = this.A0E.A04(r5);
            if (A042 != null) {
                r3.A04 = Long.valueOf((long) A042.intValue());
            }
        }
        AnonymousClass1BI r2 = r6.A0v.A00;
        if (r2 != null) {
            r3.A06 = this.A0G.A05(r2.getRawString());
            r3.A03 = Long.valueOf((long) this.A0D.A04(r2));
        }
        this.A0F.CC7(r3);
    }

    public AnonymousClass1WH(AnonymousClass11S r2, AnonymousClass1M9 r3, AnonymousClass11P r4, AnonymousClass1CJ r5, AnonymousClass121 r6, C26141Qz r7, AnonymousClass1RR r8, AnonymousClass1MZ r9, AnonymousClass1Cd r10, C24751Ln r11, AnonymousClass1WG r12, C202711m r13, C18030ve r14, AnonymousClass18K r15, C25241Nl r16, AnonymousClass1RU r17, AnonymousClass00H r18) {
        Boolean bool = C17960vV.A01;
        this.A02 = r4;
        this.A0A = r14;
        this.A00 = r2;
        this.A0D = r5;
        this.A0F = r15;
        this.A01 = r3;
        this.A07 = r11;
        this.A09 = r13;
        this.A0G = r16;
        this.A06 = r10;
        this.A04 = r7;
        this.A03 = r6;
        this.A0C = r18;
        this.A05 = r9;
        this.A0B = r17;
        this.A08 = r12;
        this.A0E = r8;
    }
}
