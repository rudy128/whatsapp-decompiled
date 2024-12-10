package com.whatsapp.group.newgroup;

import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass5I1;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C21355Aik;
import X.C36401np;
import X.C36531o3;
import X.C72453Mb;
import X.C73203Rj;
import X.C88414Zp;
import X.C90044dR;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import com.whatsapp.radio.RadioButtonWithSubtitle;

public final class GroupVisibilitySettingDialog extends Hilt_GroupVisibilitySettingDialog {
    public C36531o3 A00;
    public AnonymousClass11C A01;
    public C36401np A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new AnonymousClass5I1(this));
    public final C18100vl A04 = C88414Zp.A00(this, "is_hidden_subgroup_initial");

    public static final void A00(GroupVisibilitySettingDialog groupVisibilitySettingDialog, boolean z) {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("is_hidden_subgroup_result", z);
        String A0y = AnonymousClass3MW.A0y(groupVisibilitySettingDialog.A03);
        if (A0y != null) {
            A0D.putString("group_jid_raw_key", A0y);
        }
        groupVisibilitySettingDialog.A1F().A0w("RESULT_KEY", A0D);
        groupVisibilitySettingDialog.A28();
    }

    public Dialog A27(Bundle bundle) {
        String str;
        View A0B = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0E(this), (ViewGroup) null, 2131625528, false);
        WaTextView A0N = AnonymousClass3Ma.A0N(A0B, 2131431318);
        RadioButtonWithSubtitle radioButtonWithSubtitle = (RadioButtonWithSubtitle) C18070vi.A05(A0B, 2131436849);
        RadioButtonWithSubtitle radioButtonWithSubtitle2 = (RadioButtonWithSubtitle) C18070vi.A05(A0B, 2131431444);
        if (C72453Mb.A1a(this.A04)) {
            radioButtonWithSubtitle2.setChecked(true);
        } else {
            radioButtonWithSubtitle.setChecked(true);
        }
        radioButtonWithSubtitle.setTitle(A1H(2131891173));
        radioButtonWithSubtitle.setSubTitle(A1H(2131891174));
        C90044dR.A00(radioButtonWithSubtitle, this, 23);
        radioButtonWithSubtitle2.setTitle(A1H(2131891171));
        radioButtonWithSubtitle2.setSubTitle(A1H(2131891172));
        C90044dR.A00(radioButtonWithSubtitle2, this, 24);
        C36401np r5 = this.A02;
        if (r5 != null) {
            A0N.setText(r5.A05(A1n(), new C21355Aik(this, 34), AnonymousClass3MX.A16(this, "learn-more", new Object[1], 0, 2131891170), "learn-more"));
            C18030ve r1 = this.A02;
            AnonymousClass11C r0 = this.A01;
            if (r0 != null) {
                AnonymousClass1Y5.A0C(A0N, r0, r1);
                C73203Rj A032 = AnonymousClass4a6.A03(this);
                A032.A0c(A0B);
                return AnonymousClass3MY.A0L(A032);
            }
            str = "systemServices";
        } else {
            str = "linkifier";
        }
        C18070vi.A11(str);
        throw null;
    }
}
