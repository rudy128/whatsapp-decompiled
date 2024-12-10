package com.whatsapp.settings;

import X.AnonymousClass3MY;
import X.AnonymousClass4DG;
import X.AnonymousClass4a6;
import X.C17880vN;
import X.C37301pI;
import X.C73203Rj;
import X.C88854aw;
import X.C89484cX;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

public final class SettingsContactsDeleteDialogFragment extends Hilt_SettingsContactsDeleteDialogFragment {
    public Activity A00;
    public DialogInterface.OnClickListener A01;
    public C37301pI A02;

    public Dialog A27(Bundle bundle) {
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(this.A00), 2131626902);
        A04.A0c(A0D);
        TextView A0E = C17880vN.A0E(A0D, 2131429483);
        TextView A0E2 = C17880vN.A0E(A0D, 2131429482);
        CompoundButton compoundButton = (CompoundButton) A0D.findViewById(2131428033);
        View findViewById = A0D.findViewById(2131435971);
        Parcelable parcelable = A15().getParcelable("arg_confirm_dialog_data");
        if (parcelable != null) {
            C89484cX r3 = (C89484cX) parcelable;
            A0E.setText(2131893369);
            AnonymousClass3MY.A1X(r3.A01, A0E2);
            findViewById.setVisibility(r3.A00);
            compoundButton.setText(2131893362);
            compoundButton.setChecked(r3.A05);
            this.A05 = AnonymousClass4DG.NORMAL;
            A04.A0X(this.A01, 2131893359);
            this.A07 = AnonymousClass4DG.DESTRUCTIVE;
            A04.A0Z(new C88854aw(compoundButton, this, r3, 9), 2131893361);
            return AnonymousClass3MY.A0L(A04);
        }
        throw C17880vN.A0g();
    }
}
