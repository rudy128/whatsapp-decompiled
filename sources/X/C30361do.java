package X;

import java.util.Set;

/* renamed from: X.1do  reason: invalid class name and case insensitive filesystem */
public final class C30361do {
    public static final C18100vl A0C = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass3Di(4));
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final C27491Wh A03;
    public final C25431Oe A04;
    public final AnonymousClass00H A05;
    public final C18100vl A06 = new C18110vm(new C71013Dl(this, 17));
    public final C18100vl A07 = new C18110vm(new C71013Dl(this, 18));
    public final C200710s A08;
    public final AnonymousClass10I A09;
    public volatile int A0A = 8;
    public volatile Integer A0B;

    public C30361do(AnonymousClass11P r3, C18030ve r4, AnonymousClass18K r5, C27491Wh r6, C25431Oe r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r6, 6);
        C18070vi.A0d(r9, 7);
        this.A00 = r3;
        this.A01 = r4;
        this.A09 = r8;
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r9;
        this.A08 = new C200710s(r8, false);
    }

    private final void A00(AnonymousClass1BI r9, int i) {
        int i2 = i;
        if (!((Set) A0C.getValue()).contains(new AnonymousClass1D6(Integer.valueOf(this.A0A), Integer.valueOf(i)))) {
            int i3 = this.A0A;
            this.A0A = i;
            Integer num = this.A0B;
            this.A0B = null;
            this.A08.execute(new C30381dq(r9, this, num, i3, i2));
        }
    }

    public final void A01() {
        if (((Boolean) this.A06.getValue()).booleanValue() && this.A0A != 1) {
            A00((AnonymousClass1BI) null, 1);
        }
    }

    public final void A02(AnonymousClass1BI r3, int i) {
        if (((Boolean) this.A06.getValue()).booleanValue() && ((1 << i) & ((Number) this.A07.getValue()).intValue()) == 0) {
            A00(r3, i);
        }
    }
}
