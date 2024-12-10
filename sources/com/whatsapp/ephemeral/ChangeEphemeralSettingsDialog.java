package com.whatsapp.ephemeral;

import X.AnonymousClass00H;
import X.AnonymousClass1GP;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C43391zj;
import X.C73203Rj;
import X.C90894eo;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public final class ChangeEphemeralSettingsDialog extends Hilt_ChangeEphemeralSettingsDialog {
    public AnonymousClass00H A00;

    public static final void A00(AnonymousClass1GP r3, int i, int i2) {
        C18070vi.A0d(r3, 1);
        Hilt_ChangeEphemeralSettingsDialog hilt_ChangeEphemeralSettingsDialog = new Hilt_ChangeEphemeralSettingsDialog();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("from_settings", i);
        A0D.putInt("entry_point", i2);
        hilt_ChangeEphemeralSettingsDialog.A1R(A0D);
        hilt_ChangeEphemeralSettingsDialog.A2C(r3, "group_ephemeral_settings_dialog");
    }

    public Dialog A27(Bundle bundle) {
        int i;
        View A0B = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0E(this), (ViewGroup) null, 2131625119, false);
        RadioGroup radioGroup = (RadioGroup) C18070vi.A05(A0B, 2131430023);
        TextView A0E = AnonymousClass3Ma.A0E(A0B, 2131430024);
        int i2 = A15().getInt("from_settings", 0);
        int i3 = A15().getInt("entry_point", 0);
        C18030ve r10 = this.A02;
        C18070vi.A0W(r10);
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            AnonymousClass3Ma.A1O(radioGroup, 0, C18070vi.A0E(r0));
            C43391zj r9 = C43391zj.A00;
            if (i3 == 2) {
                C43391zj.A03(radioGroup, r9, r10, i2, true, true);
                i = 2131889522;
            } else {
                C43391zj.A03(radioGroup, r9, r10, i2, false, false);
                i = 2131889914;
            }
            A0E.setText(i);
            int childCount = radioGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = radioGroup.getChildAt(i4);
                C18070vi.A0X(childAt);
                if (childAt instanceof RadioButton) {
                    ((TextView) childAt).setTextSize(0, AnonymousClass3MZ.A09(this).getDimension(2131166515));
                }
            }
            radioGroup.setOnCheckedChangeListener(new C90894eo(this, 3));
            C73203Rj A03 = AnonymousClass4a6.A03(this);
            A03.A0c(A0B);
            return AnonymousClass3MY.A0L(A03);
        }
        C18070vi.A11("waDebugBuildSharedPreferences");
        throw null;
    }
}
