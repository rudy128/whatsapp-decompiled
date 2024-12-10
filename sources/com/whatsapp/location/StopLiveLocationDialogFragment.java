package com.whatsapp.location;

import X.AnonymousClass10I;
import X.AnonymousClass4a6;
import X.AnonymousClass750;
import X.C108955ca;
import X.C108985cd;
import X.C17960vV;
import X.C27131Uv;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public class StopLiveLocationDialogFragment extends Hilt_StopLiveLocationDialogFragment {
    public C27131Uv A00;
    public AnonymousClass10I A01;

    public Dialog A27(Bundle bundle) {
        String A0s = C108955ca.A0s(A15(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A0i = C108985cd.A0i(this);
        C17960vV.A07(A0i);
        C73203Rj A002 = AnonymousClass4a6.A00(A1B());
        A002.A0D(2131891789);
        A002.A0Z(new AnonymousClass750(this, A0s, A0i, 0), 2131891787);
        A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
        return A002.create();
    }
}
