package com.whatsapp;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass194;
import X.AnonymousClass1FL;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.C137096uu;
import X.C18030ve;
import X.C40751vD;
import X.C72463Mc;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment extends Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass194 A01;
    public C40751vD A02;
    public AnonymousClass11C A03;
    public AnonymousClass11P A04;
    public AnonymousClass18K A05;
    public AnonymousClass00H A06;

    public Dialog A27(Bundle bundle) {
        Log.w("home/dialog software-expired");
        AnonymousClass1FL A1D = A1D();
        AnonymousClass11P r7 = this.A04;
        C18030ve r9 = this.A02;
        C40751vD r4 = this.A02;
        AnonymousClass18K r10 = this.A05;
        AnonymousClass194 r3 = this.A01;
        return C137096uu.A00(A1D, this.A00, r3, r4, AnonymousClass3MW.A0a(this.A06), this.A03, r7, this.A01, r9, r10);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C72463Mc.A1A(this);
    }
}
