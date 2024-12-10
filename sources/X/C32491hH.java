package X;

import android.os.Handler;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.1hH  reason: invalid class name and case insensitive filesystem */
public final class C32491hH {
    public Handler A00;
    public Runnable A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1CJ A03;
    public final AnonymousClass1MZ A04;
    public final AnonymousClass18K A05;
    public final C25241Nl A06;
    public final AnonymousClass126 A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass11P A0A;

    public C32491hH(AnonymousClass1M9 r2, AnonymousClass11P r3, AnonymousClass1CJ r4, AnonymousClass1MZ r5, AnonymousClass18K r6, C25241Nl r7, AnonymousClass126 r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r2, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r5, 7);
        C18070vi.A0d(r9, 8);
        C18070vi.A0d(r10, 9);
        this.A0A = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A09 = r10;
    }

    public void A01(AnonymousClass206 r9, int i, boolean z) {
        int i2;
        boolean z2;
        AnonymousClass2GD r2 = new AnonymousClass2GD();
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        r2.A03 = i2;
        AnonymousClass1BI r5 = r9.A0v.A00;
        if (r5 != null) {
            AnonymousClass1CJ r0 = this.A03;
            AnonymousClass1M9 r6 = this.A02;
            r2.A05 = Long.valueOf((long) C43391zj.A00(r6, r0, r5));
            boolean z3 = false;
            if (C22971Dz.A0e(r5)) {
                GroupJid groupJid = (GroupJid) r5;
                AnonymousClass1MZ r02 = this.A04;
                boolean A0J = r02.A0J(groupJid);
                boolean A0K = r02.A0K(groupJid);
                if (A0J && A0K) {
                    z3 = true;
                }
                r2.A02 = Boolean.valueOf(z3);
                z2 = true;
            } else {
                z2 = false;
            }
            r2.A01 = z2;
            AnonymousClass1E7 A0E = r6.A0E(r5);
            if (C22971Dz.A0W(r5) && A0E != null) {
                r2.A00 = Boolean.valueOf(this.A07.A0X.A00(A0E, (AnonymousClass1EC) r5));
            }
        }
        r2.A04 = Integer.valueOf(AnonymousClass4W2.A00(i, z));
        this.A05.CC7(r2);
    }

    public void A00(C25161Nd r5, AnonymousClass1BI r6, int i, int i2) {
        if (r6 != null) {
            C46722Fq r2 = new C46722Fq();
            r2.A00 = Integer.valueOf(i);
            int i3 = 4;
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 7;
                } else if (i2 != 3) {
                    i3 = 5;
                    if (i2 != 4) {
                        i3 = 6;
                        if (i2 == 6) {
                            i3 = 3;
                        } else if (i2 != 7) {
                            i3 = 1;
                        }
                    }
                } else {
                    i3 = 2;
                }
            }
            r2.A01 = Integer.valueOf(i3);
            r2.A03 = this.A06.A05(r6.getRawString());
            AnonymousClass1CJ r0 = r5.A02;
            AnonymousClass1CJ.A01(r0);
            r2.A02 = Long.valueOf((long) r0.A04(r6));
            this.A05.CC7(r2);
        }
    }
}
