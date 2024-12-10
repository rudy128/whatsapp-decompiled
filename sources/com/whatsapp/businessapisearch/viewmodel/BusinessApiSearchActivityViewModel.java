package com.whatsapp.businessapisearch.viewmodel;

import X.AnonymousClass0IN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8FK;
import X.C18020vd;
import X.C18040vf;
import X.C41731wy;
import android.app.Application;

public class BusinessApiSearchActivityViewModel extends AnonymousClass8FK {
    public final AnonymousClass0IN A00;
    public final C41731wy A01;

    public BusinessApiSearchActivityViewModel(Application application, AnonymousClass0IN r6) {
        super(application);
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A01 = A0o;
        this.A00 = r6;
        if (C18020vd.A05(C18040vf.A02, r6.A01, 2760) && r6.A00().getBoolean("arg_should_show_nux", true)) {
            AnonymousClass3MX.A1K(A0o, 1);
        }
    }
}
