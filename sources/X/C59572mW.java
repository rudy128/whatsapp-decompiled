package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2mW  reason: invalid class name and case insensitive filesystem */
public final class C59572mW {
    public final JniBridge A00;
    public final C32691hb A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public final AnonymousClass206 A01(AnonymousClass350 r6, AnonymousClass1BI r7) {
        AnonymousClass1BI A002 = A00(r6, r7);
        String str = r6.A04;
        AnonymousClass205 A012 = AnonymousClass205.A01(A002, str, true);
        AnonymousClass00H r1 = this.A03;
        AnonymousClass206 A013 = AnonymousClass1W2.A01(A012, r1);
        if (A013 == null) {
            return AnonymousClass1W2.A01(AnonymousClass205.A01(A002, str, false), r1);
        }
        return A013;
    }

    public final byte[] A02(AnonymousClass350 r5, AnonymousClass1BI r6) {
        String str = r5.A03;
        if (str == null || str.length() == 0) {
            return null;
        }
        AnonymousClass205 A012 = AnonymousClass205.A01(A00(r5, r6), str, false);
        C32691hb r1 = this.A01;
        AnonymousClass206 A013 = AnonymousClass1W2.A01(A012, r1.A0c);
        if (A013 == null && (A013 = ((C59392mE) r1.A0f.get()).A00(A012)) == null) {
            return null;
        }
        return A013.A1D;
    }

    public final AnonymousClass1BI A00(AnonymousClass350 r4, AnonymousClass1BI r5) {
        AnonymousClass1BI A002 = C22971Dz.A00(r4.A00);
        if (A002 != null) {
            r5 = A002;
        }
        if (C22971Dz.A0M(r5)) {
            if (C18020vd.A05(C18040vf.A02, this.A02, 11660)) {
                C18070vi.A0z(r5, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                return C22971Dz.A03((UserJid) r5);
            }
        }
        return r5;
    }

    public C59572mW(C32691hb r1, C18030ve r2, JniBridge jniBridge, AnonymousClass00H r4) {
        C18070vi.A0s(r2, jniBridge, r4, r1);
        this.A02 = r2;
        this.A00 = jniBridge;
        this.A03 = r4;
        this.A01 = r1;
    }
}
