package X;

import java.lang.ref.WeakReference;

/* renamed from: X.730  reason: invalid class name */
public final class AnonymousClass730 {
    public static final Integer A0C = AnonymousClass00R.A06;
    public final AnonymousClass1L9 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1LC A02;
    public final AnonymousClass10I A03;
    public final C30141dS A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07 = C217517g.A00(16503);
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public final void A02(String str) {
        A01((C114375qh) null, (C38471rL) null, this, str, 2131889145, 0, false);
    }

    public static final C90594eK A00(C38471rL r5, AnonymousClass730 r6, String str, int i, int i2) {
        C23291Fl r2;
        WeakReference A002 = ((AnonymousClass178) r6.A07.get()).A00(str);
        C90594eK r3 = null;
        if (!(A002 == null || (r2 = (C23291Fl) A002.get()) == null || !r2.BPx().A00(C23401Fx.STARTED))) {
            r3 = r2.BZQ(i, 3500, false);
            if (!(r5 == null || i2 == 0)) {
                r3.A06(r5, i2);
                BIE bie = r3.A01.A0J;
                C18070vi.A0X(bie);
                r3.A05(AnonymousClass1YL.A00(bie.getContext(), 2130971311, 2131102579));
            }
        }
        return r3;
    }

    public static final void A01(C114375qh r2, C38471rL r3, AnonymousClass730 r4, String str, int i, int i2, boolean z) {
        r4.A01.CGP(new AnonymousClass7QL(r2, r3, r4, str, i, i2, z));
    }

    public AnonymousClass730(AnonymousClass1L9 r2, AnonymousClass1KB r3, AnonymousClass1LC r4, AnonymousClass10I r5, C30141dS r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0w(r3, r5, r6, r4, r2);
        C18070vi.A0x(r7, r8, r9, r10, r11);
        C18070vi.A0d(r12, 11);
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A00 = r2;
        this.A08 = r7;
        this.A0A = r8;
        this.A05 = r9;
        this.A0B = r10;
        this.A06 = r11;
        this.A09 = r12;
    }
}
