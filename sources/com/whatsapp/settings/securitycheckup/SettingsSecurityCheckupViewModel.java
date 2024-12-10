package com.whatsapp.settings.securitycheckup;

import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.C108465bk;
import X.C18070vi;
import X.C18600wl;
import X.C192679on;
import X.C19830z4;
import X.C200410p;
import X.C20741AWw;
import X.C34071js;
import X.C97804q5;
import X.C97814q6;
import X.C97824q7;
import X.C98924rw;

public final class SettingsSecurityCheckupViewModel extends AnonymousClass1J2 {
    public final C192679on A00;
    public final SecurityCheckupStatusRepository A01;
    public final C18600wl A02;
    public final AnonymousClass1G4 A03;
    public final AnonymousClass1G1 A04;

    public SettingsSecurityCheckupViewModel(C192679on r8, SecurityCheckupStatusRepository securityCheckupStatusRepository, C18600wl r10) {
        C97804q5 r0;
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r10, 3);
        this.A00 = r8;
        this.A01 = securityCheckupStatusRepository;
        this.A02 = r10;
        C108465bk[] r4 = new C108465bk[3];
        if (r8.A01()) {
            r0 = new C97804q5(securityCheckupStatusRepository.A02.A03.getValue() instanceof C20741AWw);
        } else {
            r0 = null;
        }
        r4[0] = r0;
        C19830z4 r02 = securityCheckupStatusRepository.A00;
        r4[1] = new C97824q7(r02.A0o(), r02.A2N());
        r4[2] = new C97814q6(false);
        AnonymousClass1G7 A002 = C34071js.A00(C98924rw.A00(C200410p.A0P(r4), 18));
        this.A03 = A002;
        this.A04 = A002;
    }
}
