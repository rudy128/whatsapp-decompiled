package com.whatsapp.biz.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1E7;
import X.AnonymousClass1J2;
import X.AnonymousClass1PM;
import X.AnonymousClass3MZ;
import X.AnonymousClass4QR;
import X.C18070vi;
import com.whatsapp.jid.UserJid;

public final class BusinessDetailsViewModel extends AnonymousClass1J2 {
    public AnonymousClass1E7 A00;
    public final AnonymousClass4QR A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1PM A04;

    public final UserJid A0T() {
        AnonymousClass1E7 r0 = this.A00;
        if (r0 != null) {
            return AnonymousClass3MZ.A0x(r0);
        }
        C18070vi.A11("contact");
        throw null;
    }

    public BusinessDetailsViewModel(AnonymousClass11S r1, AnonymousClass4QR r2, AnonymousClass1PM r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r3, r2, r4);
        this.A03 = r1;
        this.A04 = r3;
        this.A01 = r2;
        this.A02 = r4;
    }
}
