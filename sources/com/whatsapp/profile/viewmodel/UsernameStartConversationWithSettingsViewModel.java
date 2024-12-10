package com.whatsapp.profile.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1E5;
import X.AnonymousClass1G4;
import X.AnonymousClass1J2;
import X.AnonymousClass3MX;
import X.AnonymousClass4XD;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C18150vq;
import X.C18600wl;
import X.C26801Tn;
import X.C30391dr;
import X.C34071js;
import X.C41561wd;
import X.C99054sC;
import X.C99134sK;
import com.whatsapp.jid.UserJid;

public final class UsernameStartConversationWithSettingsViewModel extends AnonymousClass1J2 implements C26801Tn {
    public final AnonymousClass4XD A00 = AnonymousClass4XD.A00(this, 32);
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04;
    public final C18600wl A05;
    public final AnonymousClass1G4 A06;

    public void A0S() {
        C17880vN.A0V(this.A02).unregisterObserver(this);
    }

    public UsernameStartConversationWithSettingsViewModel(AnonymousClass11S r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, C18600wl r8) {
        C18070vi.A0w(r4, r5, r6, r7, r8);
        C18150vq A002 = C99054sC.A00(r4, 38);
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A05 = r8;
        this.A06 = C34071js.A00(r4.A0C());
        this.A04 = AnonymousClass1DF.A01(new C99134sK(A002, this, 17));
    }

    public void C9r(String str, UserJid userJid, String str2) {
        C18070vi.A0i(userJid, str2);
        if (AnonymousClass1E5.A00(userJid)) {
            AnonymousClass3MX.A1Q(new UsernameStartConversationWithSettingsViewModel$onUsernameChanged$1(this, str2, (C30391dr) null), C41561wd.A00(this));
        }
    }
}
