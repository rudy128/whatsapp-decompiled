package com.whatsapp.calling.views;

import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.C17880vN;
import X.C17960vV;
import X.C24291Jp;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class JoinableEducationDialogFragment extends Hilt_JoinableEducationDialogFragment {
    public boolean A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.whatsapp.calling.views.Hilt_JoinableEducationDialogFragment, com.whatsapp.calling.views.JoinableEducationDialogFragment] */
    public static JoinableEducationDialogFragment A00() {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("bundle_param_voice_call", false);
        ? hilt_JoinableEducationDialogFragment = new Hilt_JoinableEducationDialogFragment();
        hilt_JoinableEducationDialogFragment.A1R(A0D);
        return hilt_JoinableEducationDialogFragment;
    }

    public Dialog A27(Bundle bundle) {
        if (!(bundle == null && (bundle = this.A06) == null)) {
            this.A00 = bundle.getBoolean("bundle_param_voice_call", false);
        }
        AnonymousClass1FL A1B = A1B();
        C17960vV.A07(A1B);
        C73203Rj A002 = AnonymousClass4a6.A00(A1B);
        View inflate = LayoutInflater.from(A1B).inflate(2131627496, (ViewGroup) null, false);
        ImageView A0H = AnonymousClass3MW.A0H(inflate, 2131436937);
        if (this.A00) {
            C24291Jp A003 = C24291Jp.A00((Resources.Theme) null, AnonymousClass3MZ.A09(this), 2131233486);
            C17960vV.A07(A003);
            A0H.setImageDrawable(A003);
            A0H.setContentDescription(A1H(2131898187));
        }
        A002.setView(inflate);
        A002.setPositiveButton(2131899286, (DialogInterface.OnClickListener) null);
        return A002.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }
}
