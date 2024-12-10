package com.whatsapp.profile.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1E5;
import X.AnonymousClass1G4;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.AnonymousClass4XD;
import X.AnonymousClass9AN;
import X.AnonymousClass9AO;
import X.AnonymousClass9AP;
import X.AnonymousClass9AQ;
import X.AnonymousClass9AR;
import X.AnonymousClass9AS;
import X.AnonymousClass9I3;
import X.AnonymousClass9Mn;
import X.B9U;
import X.C17880vN;
import X.C180429Mm;
import X.C18070vi;
import X.C18100vl;
import X.C21524AlX;
import X.C21527Ala;
import X.C26801Tn;
import X.C99164sN;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.CancellationException;

public final class UsernameSetViewModel extends AnonymousClass1J2 implements B9U, C26801Tn {
    public String A00 = "";
    public AnonymousClass1OB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass4XD A04;
    public final AnonymousClass4XD A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C18100vl A08 = AnonymousClass1DF.A01(new C21524AlX(this, 3));
    public final C18100vl A09 = C21527Ala.A00(9);
    public final C18100vl A0A = C21527Ala.A00(10);
    public final C18100vl A0B = C21527Ala.A00(8);
    public final C18100vl A0C = AnonymousClass1DF.A01(new C21524AlX(this, 4));

    public void A0S() {
        C17880vN.A0V(this.A06).unregisterObserver(this);
        AnonymousClass1OB r1 = this.A01;
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
        this.A01 = null;
    }

    public void A0T(AnonymousClass9Mn r7) {
        AnonymousClass1G4 A17;
        String A012;
        AnonymousClass118 r1;
        int i;
        AnonymousClass3MW.A17(this.A0A).setValue(AnonymousClass9I3.ENABLED);
        if (C18070vi.A18(r7, AnonymousClass9AS.A00)) {
            this.A02.A0K(this.A00);
            return;
        }
        if (r7 instanceof AnonymousClass9AQ) {
            A17 = AnonymousClass3MW.A17(this.A0B);
            long j = ((AnonymousClass9AQ) r7).A00;
            if (Long.valueOf(j) == null) {
                A012 = "";
            } else {
                if (j == 406 || j == 40601) {
                    r1 = this.A03;
                    i = 2131895785;
                } else {
                    int i2 = (j > 40602 ? 1 : (j == 40602 ? 0 : -1));
                    r1 = this.A03;
                    if (i2 == 0) {
                        i = 2131895786;
                    } else {
                        i = 2131895783;
                    }
                }
                A012 = C18070vi.A0G(r1, i);
            }
        } else if (C18070vi.A18(r7, AnonymousClass9AR.A00)) {
            A17 = AnonymousClass3MW.A17(this.A0B);
            A012 = this.A03.A01(2131895781);
        } else {
            throw AnonymousClass3MW.A14();
        }
        A17.setValue(A012);
    }

    public void C3i(C180429Mm r6) {
        AnonymousClass11S r1;
        String str;
        if (r6 instanceof AnonymousClass9AN) {
            r1 = this.A02;
            str = ((AnonymousClass9AN) r6).A00;
        } else if (r6 instanceof AnonymousClass9AO) {
            if (((AnonymousClass9AO) r6).A00 == 404) {
                r1 = this.A02;
                str = "";
            } else {
                return;
            }
        } else if (!C18070vi.A18(r6, AnonymousClass9AP.A00)) {
            throw AnonymousClass3MW.A14();
        } else {
            return;
        }
        r1.A0K(str);
    }

    public UsernameSetViewModel(AnonymousClass11S r4, AnonymousClass118 r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0s(r4, r6, r7, r5);
        this.A02 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A03 = r5;
        C21524AlX alX = new C21524AlX(this, 2);
        Integer num = AnonymousClass00R.A01;
        this.A05 = new AnonymousClass4XD(num, alX);
        this.A04 = new AnonymousClass4XD(num, new C99164sN(this, 28));
    }

    public void C9r(String str, UserJid userJid, String str2) {
        C18070vi.A0i(userJid, str2);
        if (AnonymousClass1E5.A00(userJid)) {
            AnonymousClass3MW.A17(this.A08).setValue(str2);
        }
    }
}
