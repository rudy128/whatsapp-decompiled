package X;

import java.util.UUID;

/* renamed from: X.1q1  reason: invalid class name and case insensitive filesystem */
public final class C37721q1 {
    public final AnonymousClass11S A00;
    public final AnonymousClass1UN A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass00H A03;
    public final C32951i1 A04;
    public final AnonymousClass11C A05;
    public final C219217x A06;
    public final C18030ve A07;
    public final C37711q0 A08;
    public volatile Integer A09;
    public volatile String A0A;

    public C37721q1(AnonymousClass11S r2, C32951i1 r3, AnonymousClass11C r4, C219217x r5, AnonymousClass1UN r6, C18030ve r7, C37711q0 r8, AnonymousClass18K r9, AnonymousClass00H r10) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r10, 4);
        C18070vi.A0d(r5, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r3, 7);
        C18070vi.A0d(r6, 8);
        C18070vi.A0d(r7, 9);
        this.A00 = r2;
        this.A02 = r9;
        this.A05 = r4;
        this.A03 = r10;
        this.A06 = r5;
        this.A08 = r8;
        this.A04 = r3;
        this.A01 = r6;
        this.A07 = r7;
    }

    public final void A04(AnonymousClass1BI r13, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, int i) {
        if (!this.A00.A0N() && this.A0A != null) {
            ((AnonymousClass10I) this.A03.get()).CGS(new AnonymousClass3CW(new C23841Bqy(), r13, this, bool, bool2, bool3, num, num2, i), "AddContactLog");
        }
    }

    public static final void A00(C23841Bqy bqy, C37721q1 r3, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, int i) {
        A01(bqy, r3, r3.A09, r3.A0A);
        bqy.A07 = Integer.valueOf(i);
        bqy.A0A = num;
        bqy.A09 = num2;
        bqy.A03 = bool;
        bqy.A0B = num3;
        if (r3.A01.A07()) {
            bqy.A02 = bool2;
            bqy.A01 = bool3;
        }
        r3.A02.CC7(bqy);
    }

    public static final void A01(C23841Bqy bqy, C37721q1 r3, Integer num, String str) {
        bqy.A0D = str;
        bqy.A08 = num;
        Integer A002 = AnonymousClass2T4.A00(r3.A05, r3.A06);
        if (A002 != null) {
            bqy.A0C = Long.valueOf((long) A002.intValue());
        }
    }

    public final void A02() {
        if (!this.A00.A0N() && this.A0A != null) {
            ((AnonymousClass10I) this.A03.get()).CGS(new AnonymousClass7RD(this, new C23841Bqy(), 32), "AddContactLog");
        }
    }

    public final void A03(int i) {
        if (!this.A00.A0N() && this.A0A != null) {
            ((AnonymousClass10I) this.A03.get()).CGS(new C146877Qy(new C23841Bqy(), this, i), "AddContactLog");
        }
    }

    public final void A05(AnonymousClass1BI r5, boolean z) {
        if (this.A0A != null && !this.A00.A0N()) {
            ((AnonymousClass10I) this.A03.get()).CGS(new C70843Cs(new C23841Bqy(), r5, this, z), "AddContactLog");
        }
    }

    public final void A06(boolean z, int i) {
        if (!this.A00.A0N()) {
            this.A0A = UUID.randomUUID().toString();
            this.A09 = Integer.valueOf(i);
            ((AnonymousClass10I) this.A03.get()).CGS(new C146867Qx(this, new C23841Bqy(), 16, z), "AddContactLog");
        }
    }
}
