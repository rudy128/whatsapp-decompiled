package com.whatsapp.home;

import X.AnonymousClass000;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass8FK;
import X.C18070vi;
import android.app.Application;

public final class HomeViewModel extends AnonymousClass8FK {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass1DT A02 = new AnonymousClass1DS(200);

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1DT, X.1DS] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.1DT, X.1DS] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel(Application application) {
        super(application);
        C18070vi.A0d(application, 1);
        ? r0 = new AnonymousClass1DS(AnonymousClass000.A0h());
        this.A01 = r0;
        this.A00 = r0;
    }
}
