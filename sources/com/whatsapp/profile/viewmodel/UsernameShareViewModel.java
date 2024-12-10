package com.whatsapp.profile.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1E5;
import X.AnonymousClass1G4;
import X.AnonymousClass1J2;
import X.AnonymousClass1LU;
import X.AnonymousClass4XD;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C26801Tn;
import X.C34071js;
import X.C99134sK;
import com.whatsapp.jid.UserJid;

public final class UsernameShareViewModel extends AnonymousClass1J2 implements C26801Tn {
    public final AnonymousClass118 A00;
    public final AnonymousClass4XD A01 = AnonymousClass4XD.A00(this, 31);
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05;
    public final AnonymousClass1G4 A06;
    public final AnonymousClass1LU A07;

    public void A0S() {
        C17880vN.A0V(this.A03).unregisterObserver(this);
    }

    public UsernameShareViewModel(AnonymousClass11S r3, AnonymousClass118 r4, AnonymousClass1LU r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r3, r6, r7, r8, r4);
        C18070vi.A0d(r5, 6);
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A00 = r4;
        this.A07 = r5;
        this.A06 = C34071js.A00(r3.A0C());
        this.A05 = AnonymousClass1DF.A01(new C99134sK(r3, this, 16));
    }

    public void C9r(String str, UserJid userJid, String str2) {
        C18070vi.A0n(userJid, str, str2);
        if (AnonymousClass1E5.A00(userJid) && !str2.equals(str)) {
            this.A06.CPw(str2);
        }
    }
}
