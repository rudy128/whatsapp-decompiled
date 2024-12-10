package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2jg  reason: invalid class name and case insensitive filesystem */
public final class C57812jg {
    public final C32951i1 A00;
    public final C30801eX A01;
    public final C18030ve A02;
    public final C37711q0 A03;
    public final C25241Nl A04;

    public final void A00(C81643zZ r6, AnonymousClass1BI r7) {
        long j;
        boolean z;
        Boolean bool;
        if (C18020vd.A05(C18040vf.A02, this.A02, 8140) && r7 != null) {
            r6.A06 = this.A03.A05(r7.getRawString());
            String str = null;
            C60082nM A022 = this.A01.A02((UserJid) r7);
            if (A022 != null) {
                str = A022.A08;
            }
            r6.A04 = str;
            C32951i1 r4 = this.A00;
            SharedPreferences A002 = C32951i1.A00(r4);
            String rawString = r7.getRawString();
            C18070vi.A0d(rawString, 0);
            String A0r = C17880vN.A0r(A002, rawString);
            if (TextUtils.isEmpty(A0r)) {
                j = -1;
            } else {
                AnonymousClass2S9 A003 = C60332nq.A00(A0r);
                j = A003.A06 + A003.A07;
            }
            r6.A02 = Long.valueOf(j);
            SharedPreferences A004 = C32951i1.A00(r4);
            String rawString2 = r7.getRawString();
            C18070vi.A0d(rawString2, 0);
            String A0r2 = C17880vN.A0r(A004, rawString2);
            if (TextUtils.isEmpty(A0r2) || (bool = C60332nq.A00(A0r2).A0C) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            r6.A00 = Integer.valueOf(z ? 1 : 0);
        }
    }

    public C57812jg(C32951i1 r1, C30801eX r2, C18030ve r3, C37711q0 r4, C25241Nl r5) {
        C18070vi.A0w(r4, r2, r1, r3, r5);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
    }
}
