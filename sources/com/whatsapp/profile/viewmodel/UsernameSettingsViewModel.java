package com.whatsapp.profile.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1E5;
import X.AnonymousClass1J2;
import X.AnonymousClass3MX;
import X.AnonymousClass4XD;
import X.AnonymousClass4bI;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C26801Tn;
import X.C30391dr;
import X.C41561wd;
import X.C99094sG;
import X.C99164sN;
import com.whatsapp.jid.UserJid;

public final class UsernameSettingsViewModel extends AnonymousClass1J2 implements C26801Tn {
    public final AnonymousClass4XD A00 = AnonymousClass4XD.A00(this, 30);
    public final AnonymousClass00H A01;
    public final C18100vl A02;
    public final C18100vl A03;

    public void A0S() {
        C17880vN.A0V(this.A01).unregisterObserver(this);
    }

    public UsernameSettingsViewModel(AnonymousClass11S r3, AnonymousClass4bI r4, AnonymousClass00H r5) {
        C18070vi.A0o(r3, r4, r5);
        this.A01 = r5;
        this.A02 = C99164sN.A01(r3, 29);
        this.A03 = AnonymousClass1DF.A01(new C99094sG(this, r4, r3, 4));
    }

    public void C9r(String str, UserJid userJid, String str2) {
        C18070vi.A0i(userJid, str2);
        if (AnonymousClass1E5.A00(userJid)) {
            AnonymousClass3MX.A1Q(new UsernameSettingsViewModel$onUsernameChanged$1(this, str2, (C30391dr) null), C41561wd.A00(this));
        }
    }
}
