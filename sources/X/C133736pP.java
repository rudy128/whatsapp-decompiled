package X;

import android.content.SharedPreferences;

/* renamed from: X.6pP  reason: invalid class name and case insensitive filesystem */
public final class C133736pP {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11P A02;
    public final C18030ve A03;

    public final boolean A01(Integer num) {
        String str;
        C18030ve r4 = this.A03;
        C18040vf r3 = C18040vf.A02;
        if (C18020vd.A05(r3, r4, 5869)) {
            AnonymousClass00H r2 = this.A00;
            String A0r = C17880vN.A0r(C18070vi.A03(((C85234Mp) r2.get()).A01), "pref_disclosure_source");
            if (A0r != null) {
                if (num.intValue() != 0) {
                    str = "MARKETING_MESSAGE";
                } else {
                    str = "CTWA";
                }
                if (!str.equals(A0r)) {
                    int A002 = C18020vd.A00(r3, r4, 5591) * 1000;
                    AnonymousClass11P r42 = this.A02;
                    if (AnonymousClass11P.A01(r42) - C18070vi.A03(((C85234Mp) r2.get()).A01).getLong("pref_disclosure_timestamp", AnonymousClass11P.A01(r42)) < ((long) A002)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void A00(Integer num) {
        String str;
        if (C18020vd.A05(C18040vf.A02, this.A03, 5869)) {
            long A012 = AnonymousClass11P.A01(this.A02);
            SharedPreferences.Editor A0E = C108995ce.A0E(((C85234Mp) this.A00.get()).A01);
            if (num.intValue() != 0) {
                str = "MARKETING_MESSAGE";
            } else {
                str = "CTWA";
            }
            A0E.putString("pref_disclosure_source", str);
            A0E.putLong("pref_disclosure_timestamp", A012);
            A0E.apply();
        }
    }

    public C133736pP(AnonymousClass11P r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }
}
