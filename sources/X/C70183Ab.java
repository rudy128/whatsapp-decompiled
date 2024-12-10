package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Ab  reason: invalid class name and case insensitive filesystem */
public class C70183Ab implements AnonymousClass1TI {
    public int A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ C32861hs A02;
    public final /* synthetic */ AnonymousClass34B A03;
    public final /* synthetic */ C26551So A04;
    public final /* synthetic */ C63642tS A05;

    public C70183Ab(C32861hs r2, AnonymousClass34B r3, C26551So r4, C63642tS r5) {
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        int i = this.A00 + 1;
        this.A00 = i;
        C32861hs r8 = this.A02;
        C63642tS r6 = this.A05;
        C32861hs.A03(r8, r6, -2, i, 0);
        if (AnonymousClass1RO.A02(str3)) {
            C18030ve r3 = r8.A07;
            if (C18020vd.A05(C18040vf.A01, r3, 1539)) {
                C26551So r2 = this.A04;
                if ((r2 == C26551So.A0B || r2 == C26551So.A0E || r2 == C26551So.A0q) && r8.A0D.A06(C29431cG.A0t(r6.A03)) && !this.A01) {
                    AnonymousClass34B r4 = this.A03;
                    C56232h8 A012 = r4.A01();
                    C18040vf r22 = C18040vf.A02;
                    if (C18020vd.A05(r22, r3, 6502)) {
                        str2 = A012.A0A;
                        str = A012.A09;
                    } else {
                        C167228ff r0 = (C167228ff) r8.A0I.A03(r4);
                        if (r0 != null) {
                            C196299un r02 = r0.A0Z;
                            str2 = r02.A06();
                            str = r02.A05();
                        } else {
                            str = null;
                            str2 = null;
                        }
                    }
                    long j = A012.A03;
                    AnonymousClass1BI r9 = r6.A01().A0v.A00;
                    if (!(str == null || j <= 0 || r9 == null)) {
                        if (C18020vd.A05(r22, r3, 6966)) {
                            r8.A05(r9, str3, (String) null, str, j);
                        }
                        if (str2 != null) {
                            if (C18020vd.A05(r22, r3, 8177)) {
                                r8.A05(r9, str3, str2, str, j);
                            }
                            this.A01 = true;
                            return;
                        }
                    }
                    Log.e("SendMediaMessageManager/when http connected could not send media notify since some params are invalid");
                }
            }
        }
    }
}
