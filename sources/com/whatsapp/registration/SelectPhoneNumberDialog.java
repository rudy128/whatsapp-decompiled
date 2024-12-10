package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass1LA;
import X.AnonymousClass3MY;
import X.AnonymousClass3Oe;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.AnonymousClass5YK;
import X.AnonymousClass99S;
import X.C010105w;
import X.C17900vP;
import X.C17960vV;
import X.C18070vi;
import X.C73203Rj;
import X.C88854aw;
import X.C90814eg;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;

public final class SelectPhoneNumberDialog extends Hilt_SelectPhoneNumberDialog {
    public AnonymousClass1LA A00;
    public AnonymousClass5YK A01;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof AnonymousClass5YK) {
            this.A01 = (AnonymousClass5YK) context;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        AnonymousClass5YK r0 = this.A01;
        if (r0 != null) {
            AnonymousClass99S r02 = (AnonymousClass99S) r0;
            r02.A09.A02(r02.A0L.A03);
        }
    }

    public void A1K() {
        super.A1K();
        this.A01 = null;
    }

    public Dialog A27(Bundle bundle) {
        ArrayList parcelableArrayList = A15().getParcelableArrayList("deviceSimInfoList");
        C17960vV.A07(parcelableArrayList);
        C18070vi.A0X(parcelableArrayList);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectPhoneNumberDialog/number-of-suggestions: ");
        C17900vP.A0o(A10, parcelableArrayList.size());
        Context A14 = A14();
        AnonymousClass1LA r0 = this.A00;
        if (r0 != null) {
            AnonymousClass3Oe r4 = new AnonymousClass3Oe(A14, r0, parcelableArrayList);
            C73203Rj A002 = AnonymousClass4a6.A00(A14);
            A002.A0E(2131895619);
            A002.A00.A0H((DialogInterface.OnClickListener) null, r4);
            A002.A0Z(new C88854aw(this, parcelableArrayList, r4, 8), 2131897666);
            A002.A0X(new AnonymousClass4bB(this, 44), 2131898766);
            C010105w A0L = AnonymousClass3MY.A0L(A002);
            C90814eg.A00(A0L.A00.A0K, r4, 7);
            return A0L;
        }
        C18070vi.A11("countryPhoneInfo");
        throw null;
    }
}
