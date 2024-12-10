package com.whatsapp.profile.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1E5;
import X.AnonymousClass1J2;
import X.AnonymousClass4XD;
import X.AnonymousClass9AN;
import X.AnonymousClass9AO;
import X.B9U;
import X.C108425bg;
import X.C17880vN;
import X.C180429Mm;
import X.C18070vi;
import X.C18100vl;
import X.C26801Tn;
import X.C99064sD;
import com.whatsapp.jid.UserJid;

public final class UsernameViewModel extends AnonymousClass1J2 implements B9U, C26801Tn {
    public final AnonymousClass11S A00;
    public final C108425bg A01;
    public final AnonymousClass4XD A02 = AnonymousClass4XD.A00(this, 33);
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05 = AnonymousClass1DF.A01(new C99064sD(17));

    public void A0S() {
        C17880vN.A0V(this.A03).unregisterObserver(this);
    }

    public void C3i(C180429Mm r6) {
        if (r6 instanceof AnonymousClass9AN) {
            String str = ((AnonymousClass9AN) r6).A00;
            if (str.length() > 0) {
                this.A00.A0K(str);
            }
        } else if ((r6 instanceof AnonymousClass9AO) && ((AnonymousClass9AO) r6).A00 == 404) {
            this.A00.A0K("");
        } else {
            return;
        }
        ((AnonymousClass1DS) this.A05.getValue()).A0E(this.A00.A0C());
    }

    public UsernameViewModel(AnonymousClass11S r3, C108425bg r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0s(r3, r5, r4, r6);
        this.A00 = r3;
        this.A03 = r5;
        this.A01 = r4;
        this.A04 = r6;
    }

    public void C9r(String str, UserJid userJid, String str2) {
        C18070vi.A0i(userJid, str2);
        if (AnonymousClass1E5.A00(userJid)) {
            ((AnonymousClass1DS) this.A05.getValue()).A0E(str2);
        }
    }
}
