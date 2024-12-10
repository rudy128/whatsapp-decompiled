package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass4I5;
import X.AnonymousClass4IV;
import X.C18070vi;
import X.C18600wl;
import X.C23421Fz;
import X.C24921Me;
import X.C28243Du4;
import X.C30391dr;
import X.C37361pP;
import com.whatsapp.jid.UserJid;

public final class OneOnOneCallConfirmationSheetViewModel extends AnonymousClass1J2 {
    public boolean A00;
    public final int A01;
    public final AnonymousClass1VP A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final UserJid A05;
    public final C18600wl A06;
    public final C18600wl A07;
    public final C23421Fz A08;
    public final AnonymousClass1G4 A09;
    public final boolean A0A;

    public OneOnOneCallConfirmationSheetViewModel(C37361pP r3, AnonymousClass1VP r4, AnonymousClass1M9 r5, C24921Me r6, C18600wl r7, C18600wl r8) {
        C18070vi.A0w(r3, r4, r5, r6, r7);
        C18070vi.A0d(r8, 6);
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = r7;
        this.A06 = r8;
        Boolean bool = (Boolean) r3.A02("is_video");
        if (bool != null) {
            this.A0A = bool.booleanValue();
            UserJid userJid = (UserJid) r3.A02("user_jid");
            if (userJid != null) {
                this.A05 = userJid;
                Number number = (Number) r3.A02("call_from_ui");
                if (number != null) {
                    this.A01 = number.intValue();
                    this.A08 = AnonymousClass4I5.A00(r8, new C28243Du4(new OneOnOneCallConfirmationSheetViewModel$uiState$1(this, (C30391dr) null)));
                    this.A09 = AnonymousClass3MW.A18(AnonymousClass4IV.A01);
                    return;
                }
                throw AnonymousClass000.A0n("OneOnOneCallConfirmationSheetViewModel callFromUi cannot be null");
            }
            throw AnonymousClass000.A0n("OneOnOneCallConfirmationSheetViewModel userJid cannot be null");
        }
        throw AnonymousClass000.A0n("OneOnOneCallConfirmationSheetViewModel isVideoCall cannot be null");
    }
}
