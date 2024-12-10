package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass11O;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass17K;
import X.AnonymousClass190;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LC;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C19830z4;
import X.C24605CBj;
import X.C26302CxJ;
import X.C33841jT;
import X.C36361nl;
import X.C72463Mc;
import X.C73203Rj;
import X.C88824as;
import X.C99744tO;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class DisplayExceptionDialogFactory$LoginFailedDialogFragment extends Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass190 A01;
    public AnonymousClass1KB A02;
    public C36361nl A03;
    public AnonymousClass11S A04;
    public AnonymousClass1LC A05;
    public AnonymousClass11C A06;
    public AnonymousClass11P A07;
    public C19830z4 A08;
    public AnonymousClass11O A09;
    public AnonymousClass1LU A0A;
    public C33841jT A0B;
    public AnonymousClass00H A0C;

    public static void A00(Activity activity, DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment) {
        String A0n = displayExceptionDialogFactory$LoginFailedDialogFragment.A08.A0n();
        String A0l = displayExceptionDialogFactory$LoginFailedDialogFragment.A08.A0l();
        Intent A012 = AnonymousClass1LU.A01(activity);
        if (AnonymousClass11P.A01(displayExceptionDialogFactory$LoginFailedDialogFragment.A07) < C17890vO.A05(C17890vO.A0B(displayExceptionDialogFactory$LoginFailedDialogFragment.A08), "post_reg_notification_time") + 1800000) {
            A012.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", A0n);
            A012.putExtra("com.whatsapp.registration.RegisterPhone.country_code", A0l);
            A012.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
        }
        displayExceptionDialogFactory$LoginFailedDialogFragment.A0B.A04();
        C33841jT.A03(displayExceptionDialogFactory$LoginFailedDialogFragment.A0B, 0, true);
        activity.startActivity(A012);
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A042;
        boolean z = true;
        if (C17880vN.A0I(this.A0C).A0E()) {
            String A022 = AnonymousClass17K.A02(AnonymousClass3MZ.A0Q(this.A04));
            View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(A1D()), 2131623974);
            A042 = AnonymousClass4a6.A04(this);
            A042.A0T(false);
            A042.A0c(A0D);
            TextEmojiLabel A0V = AnonymousClass3MX.A0V(A0D, 2131429980);
            View A062 = AnonymousClass1HF.A06(A0D, 2131432204);
            View A063 = AnonymousClass1HF.A06(A0D, 2131434478);
            String A0q = C17880vN.A0q(A14(), this.A01.A0G(A022), new Object[1], 0, 2131894709);
            A0V.setText(A0q);
            Context context = A0D.getContext();
            C18030ve r12 = this.A02;
            C26302CxJ.A0M(context, this.A00, this.A02, A0V, this.A06, r12, A0q, new C99744tO(this));
            AnonymousClass3Ma.A1G(A062, this, A022, 0);
            AnonymousClass3MZ.A1N(A063, this, 23);
        } else {
            String A0r = C17880vN.A0r(C17890vO.A0B(this.A08), "logout_message_locale");
            if (A0r == null || !this.A01.A05().equals(A0r)) {
                z = false;
            }
            A042 = AnonymousClass4a6.A04(this);
            A042.A0T(false);
            String A0r2 = C17880vN.A0r(C17890vO.A0B(this.A08), "main_button_text");
            if (!z || C24605CBj.A00(A0r2)) {
                A0r2 = A14().getString(2131891828);
            }
            A042.A0L(new C88824as(0, this, z), A0r2);
            String A0r3 = C17880vN.A0r(C17890vO.A0B(this.A08), "secondary_button_text");
            if (!z || C24605CBj.A00(A0r3)) {
                A0r3 = A14().getString(2131891829);
            }
            A042.A00.A0J(new C88824as(1, this, z), A0r3);
            String string = C17890vO.A0B(this.A08).getString("logout_message_header", (String) null);
            String string2 = C17890vO.A0B(this.A08).getString("logout_message_subtext", (String) null);
            if (!z || C24605CBj.A00(string)) {
                string = A14().getString(2131894711);
            } else if (!C24605CBj.A00(string2)) {
                string = AnonymousClass001.A1H("\n\n", string2, AnonymousClass000.A11(string));
            }
            A042.A0S(string);
        }
        return A042.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C72463Mc.A1A(this);
    }
}
