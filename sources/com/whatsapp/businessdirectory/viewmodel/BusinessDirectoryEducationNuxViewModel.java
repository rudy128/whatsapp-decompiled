package com.whatsapp.businessdirectory.viewmodel;

import X.AM5;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.AnonymousClass8FK;
import X.C173738ve;
import X.C17880vN;
import X.C18070vi;
import android.app.Application;

public final class BusinessDirectoryEducationNuxViewModel extends AnonymousClass8FK {
    public final C173738ve A00;

    public void A0S() {
        C17880vN.A1F(AnonymousClass8BT.A05(this.A00.A03), "is_nux", false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessDirectoryEducationNuxViewModel(Application application, AM5 am5, C173738ve r4) {
        super(application);
        C18070vi.A0o(application, am5, r4);
        this.A00 = r4;
        AM5.A02(am5, AnonymousClass8BW.A0J(0));
    }
}
