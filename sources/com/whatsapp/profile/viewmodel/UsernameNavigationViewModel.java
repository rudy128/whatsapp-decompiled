package com.whatsapp.profile.viewmodel;

import X.AnonymousClass1E5;
import X.AnonymousClass3U6;
import X.AnonymousClass4XD;
import X.AnonymousClass4bI;
import X.C18070vi;
import X.C26801Tn;
import X.C47802Ka;
import X.C97364pL;
import X.C97494pZ;
import com.whatsapp.jid.UserJid;

public final class UsernameNavigationViewModel extends AnonymousClass3U6 implements C26801Tn {
    public final C47802Ka A00;
    public final AnonymousClass4bI A01;
    public final AnonymousClass4XD A02 = AnonymousClass4XD.A00(this, 25);

    public void A0S() {
        this.A00.unregisterObserver(this);
    }

    public UsernameNavigationViewModel(C47802Ka r2, AnonymousClass4bI r3) {
        C18070vi.A0j(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void C9r(String str, UserJid userJid, String str2) {
        Object obj;
        C18070vi.A0n(userJid, str, str2);
        if (AnonymousClass1E5.A00(userJid) && str.length() == 0 && str2.length() > 0) {
            obj = new C97364pL(str2);
        } else if (AnonymousClass1E5.A00(userJid) && !str.equals(str2)) {
            obj = C97494pZ.A00;
        } else {
            return;
        }
        A0T(obj);
    }
}
