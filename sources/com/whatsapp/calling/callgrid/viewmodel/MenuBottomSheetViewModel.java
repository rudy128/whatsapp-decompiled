package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass11S;
import X.AnonymousClass1DT;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3VX;
import X.AnonymousClass4T4;
import X.C175258yP;
import X.C17890vO;
import X.C18140vp;
import X.C24921Me;
import X.C41731wy;
import com.whatsapp.jid.UserJid;

public class MenuBottomSheetViewModel extends AnonymousClass3VX {
    public AnonymousClass4T4 A00;
    public UserJid A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass11S A04;
    public final AnonymousClass1M9 A05;
    public final C24921Me A06;
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final C41731wy A08 = AnonymousClass3MW.A0o();
    public final C18140vp A09;
    public final C175258yP A0A;

    public void A0S() {
        this.A0A.unregisterObserver(this);
    }

    public void A0T(int i) {
        UserJid userJid = this.A01;
        if (userJid != null || i == 0) {
            this.A08.A0F(C17890vO.A0E(userJid, i));
        }
    }

    public MenuBottomSheetViewModel(AnonymousClass11S r3, C175258yP r4, AnonymousClass1M9 r5, C24921Me r6, C18140vp r7) {
        this.A04 = r3;
        this.A0A = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A09 = r7;
        r4.registerObserver(this);
        AnonymousClass3VX.A00(r4, this);
    }
}
