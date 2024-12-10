package com.whatsapp.companiondevice;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1KB;
import X.AnonymousClass1RK;
import X.AnonymousClass2PO;
import X.AnonymousClass3MW;
import X.AnonymousClass8FK;
import X.C17890vO;
import X.C19880zA;
import X.C22781De;
import X.C22971Dz;
import X.C34221k8;
import X.C41731wy;
import X.C88344Zh;
import X.C94094k2;
import X.C98764rg;
import android.app.Application;
import java.util.List;

public class LinkedDevicesViewModel extends AnonymousClass8FK {
    public List A00 = AnonymousClass000.A13();
    public final C19880zA A01;
    public final C34221k8 A02 = new C94094k2(this);
    public final AnonymousClass1RK A03;
    public final C41731wy A04 = AnonymousClass3MW.A0o();
    public final C41731wy A05 = AnonymousClass3MW.A0o();
    public final C41731wy A06 = AnonymousClass3MW.A0o();
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass1KB A0A;

    public int A0T() {
        int i = 0;
        for (C88344Zh r5 : this.A00) {
            if (!AnonymousClass000.A1R((r5.A01 > 0 ? 1 : (r5.A01 == 0 ? 0 : -1))) && !C22971Dz.A0T(r5.A08)) {
                i++;
            }
        }
        return i;
    }

    public LinkedDevicesViewModel(Application application, C19880zA r3, AnonymousClass1KB r4, AnonymousClass1RK r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        super(application);
        this.A0A = r4;
        this.A08 = r6;
        this.A09 = r7;
        this.A03 = r5;
        this.A01 = r3;
    }

    public void A0U() {
        if (C22781De.A03()) {
            C17890vO.A0u(new AnonymousClass2PO(this.A01, this.A02, this.A03), this.A08);
            return;
        }
        this.A0A.A0J(new C98764rg((Object) this, 37));
    }
}
