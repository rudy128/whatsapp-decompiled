package com.whatsapp.payments.ui.mapper.register;

import X.AXS;
import X.AYS;
import X.AnonymousClass11S;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8FK;
import X.C1418477e;
import X.C144717Ik;
import X.C175798zI;
import X.C18070vi;
import X.C20008A2y;
import X.C41731wy;
import android.app.Application;
import com.whatsapp.Me;

public final class IndiaUpiMapperLinkViewModel extends AnonymousClass8FK {
    public AXS A00;
    public AnonymousClass11S A01;
    public final Application A02;
    public final C175798zI A03;
    public final C20008A2y A04;
    public final C41731wy A05 = AnonymousClass3MW.A0o();
    public final String A06;
    public final String A07;
    public final String A08;

    public final void A0T(boolean z) {
        String str;
        String str2;
        C175798zI r4 = this.A03;
        AXS axs = this.A00;
        String A0J = axs.A0J();
        if (A0J == null) {
            A0J = "";
        }
        C1418477e A0D = axs.A0D();
        C144717Ik A0Z = AnonymousClass8BR.A0Z();
        Class<String> cls = String.class;
        AnonymousClass11S r0 = this.A01;
        r0.A0I();
        Me me = r0.A00;
        if (me != null) {
            str = me.number;
        } else {
            str = null;
        }
        C1418477e A0Y = AnonymousClass8BR.A0Y(A0Z, cls, str, "upiAlias");
        if (z) {
            str2 = "port";
        } else {
            str2 = "add";
        }
        r4.A01(A0D, A0Y, new AYS(this, 1), A0J, "mobile_number", str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndiaUpiMapperLinkViewModel(Application application, AnonymousClass11S r3, AXS axs, C175798zI r5, C20008A2y a2y) {
        super(application);
        C18070vi.A0o(application, axs, r3);
        C18070vi.A0d(a2y, 5);
        this.A02 = application;
        this.A00 = axs;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = a2y;
        this.A07 = C18070vi.A0F(application, 2131897443);
        this.A06 = C18070vi.A0F(application, 2131897445);
        this.A08 = C18070vi.A0F(application, 2131897444);
    }
}
