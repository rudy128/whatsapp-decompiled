package com.whatsapp.events;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4CW;
import X.AnonymousClass4a6;
import X.AnonymousClass5PL;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C72453Mb;
import X.C73203Rj;
import X.C88414Zp;
import X.C89934dG;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.whatsapp.base.WaDialogFragment;

public final class EventCallTypeDialog extends WaDialogFragment {
    public final C18100vl A00 = C88414Zp.A00(this, "IS_EDIT_MODE");
    public final C18100vl A01 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5PL(this, AnonymousClass4CW.WA_VIDEO_CALL));

    public Dialog A27(Bundle bundle) {
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        View A0B = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0E(this), (ViewGroup) null, 2131625237, false);
        A04.A0E(2131890055);
        if (C72453Mb.A1a(this.A00)) {
            C28931bI.A00(A0B, 2131428748).A04(0);
        }
        CompoundButton compoundButton = (CompoundButton) C18070vi.A05(A0B, 2131436742);
        CompoundButton compoundButton2 = (CompoundButton) C18070vi.A05(A0B, 2131436863);
        int ordinal = ((AnonymousClass4CW) this.A01.getValue()).ordinal();
        if (ordinal == 1) {
            compoundButton.setChecked(true);
        } else if (ordinal == 0) {
            compoundButton2.setChecked(true);
        } else {
            throw AnonymousClass3MW.A14();
        }
        compoundButton.setText(2131898969);
        compoundButton2.setText(2131898970);
        C89934dG.A00(compoundButton, this, 32);
        C89934dG.A00(compoundButton2, this, 33);
        A04.setView(A0B);
        return AnonymousClass3MY.A0L(A04);
    }
}
