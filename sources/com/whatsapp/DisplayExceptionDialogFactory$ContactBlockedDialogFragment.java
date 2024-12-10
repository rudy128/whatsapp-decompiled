package com.whatsapp;

import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass1LU;
import X.AnonymousClass4a6;
import X.AnonymousClass4b0;
import X.C17960vV;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class DisplayExceptionDialogFactory$ContactBlockedDialogFragment extends Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment {
    public AnonymousClass1LU A00;
    public AnonymousClass00H A01;

    public Dialog A27(Bundle bundle) {
        Log.w("home/dialog contact-blocked");
        Bundle A15 = A15();
        String string = A15.getString("message");
        C17960vV.A07(string);
        ArrayList parcelableArrayList = A15.getParcelableArrayList("jids");
        C17960vV.A07(parcelableArrayList);
        AnonymousClass1FL A1D = A1D();
        AnonymousClass1LU r6 = this.A00;
        Object obj = this.A01.get();
        C73203Rj A002 = AnonymousClass4a6.A00(A1D);
        A002.A0S(string);
        return C73203Rj.A00(new AnonymousClass4b0(obj, A1D, parcelableArrayList, r6, 0), A002, 2131897273);
    }
}
