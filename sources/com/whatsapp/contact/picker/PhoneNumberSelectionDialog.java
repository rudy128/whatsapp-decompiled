package com.whatsapp.contact.picker;

import X.AnonymousClass11P;
import X.AnonymousClass3Oc;
import X.AnonymousClass48X;
import X.AnonymousClass4a6;
import X.C010105w;
import X.C17880vN;
import X.C17960vV;
import X.C23351Fr;
import X.C73203Rj;
import X.C88854aw;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

public class PhoneNumberSelectionDialog extends Hilt_PhoneNumberSelectionDialog {
    public C23351Fr A00;
    public AnonymousClass11P A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.contact.picker.PhoneNumberSelectionDialog, com.whatsapp.contact.picker.Hilt_PhoneNumberSelectionDialog, androidx.fragment.app.Fragment] */
    public static PhoneNumberSelectionDialog A00(String str, ArrayList arrayList) {
        ? hilt_PhoneNumberSelectionDialog = new Hilt_PhoneNumberSelectionDialog();
        Bundle A0D = C17880vN.A0D();
        A0D.putString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str);
        A0D.putParcelableArrayList("phoneNumberSelectionInfoList", arrayList);
        hilt_PhoneNumberSelectionDialog.A1R(A0D);
        return hilt_PhoneNumberSelectionDialog;
    }

    public void A1K() {
        super.A1K();
        this.A00 = null;
    }

    public void A1x(Context context) {
        super.A1x(context);
        if (context instanceof C23351Fr) {
            this.A00 = (C23351Fr) context;
        }
    }

    public Dialog A27(Bundle bundle) {
        Bundle A15 = A15();
        String string = A15.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
        ArrayList parcelableArrayList = A15.getParcelableArrayList("phoneNumberSelectionInfoList");
        C17960vV.A07(parcelableArrayList);
        Context A14 = A14();
        AnonymousClass3Oc r5 = new AnonymousClass3Oc(A14, parcelableArrayList);
        C73203Rj A002 = AnonymousClass4a6.A00(A14);
        A002.A0k(string);
        A002.A00.A0H((DialogInterface.OnClickListener) null, r5);
        A002.A0Z(new C88854aw(r5, this, parcelableArrayList, 4), 2131887451);
        A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
        A002.A0T(true);
        C010105w create = A002.create();
        create.A00.A0K.setOnItemClickListener(new AnonymousClass48X(r5, this, this.A01));
        return create;
    }
}
