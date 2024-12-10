package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1pq  reason: invalid class name and case insensitive filesystem */
public final class C37611pq {
    public final C18030ve A00;
    public final AnonymousClass18K A01;

    public C37611pq(C18030ve r2, AnonymousClass18K r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(int i) {
        if (C18020vd.A05(C18040vf.A02, this.A00, 8726)) {
            AnonymousClass2GQ r1 = new AnonymousClass2GQ();
            r1.A05 = Integer.valueOf(i);
            r1.A04 = 6;
            this.A01.CC7(r1);
        }
    }

    public final void A02(AnonymousClass1E7 r5, Integer num, int i, boolean z) {
        Jid A06;
        if (C18020vd.A05(C18040vf.A02, this.A00, 8506) && (A06 = r5.A06(UserJid.class)) != null) {
            C46832Gb r1 = new C46832Gb();
            r1.A06 = A06.getRawString();
            r1.A05 = Integer.valueOf(i);
            r1.A04 = 4;
            if (z) {
                r1.A00 = Boolean.valueOf(r5.A0p);
                r1.A02 = Boolean.valueOf(r5.A0l);
                r1.A01 = Boolean.valueOf(r5.A0h);
            }
            if (num != null) {
                r1.A03 = num;
            }
            this.A01.CC7(r1);
        }
    }

    public final void A01(AnonymousClass1E7 r4, Integer num, int i, int i2) {
        AnonymousClass2GQ r2 = new AnonymousClass2GQ();
        r2.A04 = Integer.valueOf(i);
        r2.A05 = Integer.valueOf(i2);
        if (num != null) {
            r2.A06 = Long.valueOf((long) num.intValue());
        }
        if (r4 != null) {
            r2.A01 = Boolean.valueOf(r4.A0m);
            r2.A00 = Boolean.valueOf(r4.A0l);
            r2.A02 = Boolean.valueOf(r4.A0p);
            r2.A03 = Boolean.valueOf(r4.A0h);
        }
        this.A01.CC7(r2);
    }
}
