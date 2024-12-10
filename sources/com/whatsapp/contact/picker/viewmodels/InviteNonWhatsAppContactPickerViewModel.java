package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass3MY;
import X.AnonymousClass8BS;
import X.AnonymousClass8FK;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C20103A7h;
import X.C22791Df;
import X.C22801Dg;
import X.C24921Me;
import X.C28149Ds9;
import X.C41731wy;
import X.CW0;
import android.app.Application;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class InviteNonWhatsAppContactPickerViewModel extends AnonymousClass8FK {
    public String A00;
    public boolean A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1DS A04;
    public final AnonymousClass1DS A05;
    public final AnonymousClass1DS A06;
    public final AnonymousClass1DS A07;
    public final AnonymousClass1DS A08;
    public final C22801Dg A09;
    public final C22801Dg A0A = new C22801Dg();
    public final AnonymousClass1DT A0B;
    public final AnonymousClass1DT A0C;
    public final AnonymousClass1DT A0D;
    public final AnonymousClass1DT A0E;
    public final AnonymousClass1DT A0F;
    public final AnonymousClass1M9 A0G;
    public final C24921Me A0H;
    public final C18000vb A0I;
    public final C18030ve A0J;
    public final CW0 A0K;
    public final C41731wy A0L;
    public final List A0M;

    public final void A0T(String str) {
        this.A00 = str;
        ArrayList A032 = C20103A7h.A03(this.A0I, str);
        C18070vi.A0X(A032);
        this.A0E.A0F(AnonymousClass3MY.A0f());
        this.A0F.A0F(A032);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteNonWhatsAppContactPickerViewModel(Application application, AnonymousClass1M9 r4, C24921Me r5, C18000vb r6, C18030ve r7, CW0 cw0) {
        super(application);
        C18070vi.A0w(application, r7, r4, r6, r5);
        C18070vi.A0d(cw0, 6);
        this.A0J = r7;
        this.A0G = r4;
        this.A0I = r6;
        this.A0H = r5;
        this.A0K = cw0;
        C41731wy r0 = new C41731wy();
        this.A0L = r0;
        this.A02 = r0;
        AnonymousClass1DT r02 = new AnonymousClass1DT();
        this.A0E = r02;
        this.A08 = r02;
        C22801Dg r1 = new C22801Dg();
        this.A09 = r1;
        this.A06 = r1;
        this.A07 = C22791Df.A01(r1, C28149Ds9.A00);
        this.A0F = new AnonymousClass1DT();
        AnonymousClass1DT r03 = new AnonymousClass1DT();
        this.A0D = r03;
        this.A05 = r03;
        AnonymousClass1DT r04 = new AnonymousClass1DT();
        this.A0C = r04;
        this.A04 = r04;
        AnonymousClass1DT r05 = new AnonymousClass1DT();
        this.A0B = r05;
        this.A03 = r05;
        this.A0M = AnonymousClass000.A13();
    }

    public static final void A00(AnonymousClass1E7 r2, Map map) {
        String A0K2 = r2.A0K();
        if (A0K2 == null || A0K2.length() == 0) {
            Log.i("InviteNonWhatsAppContactPickerViewModel/fillNameToContactMap/display name missing");
            return;
        }
        List A0t = AnonymousClass8BS.A0t(A0K2, map);
        if (A0t == null) {
            A0t = AnonymousClass000.A13();
        }
        A0t.add(r2);
        map.put(A0K2, A0t);
    }
}
