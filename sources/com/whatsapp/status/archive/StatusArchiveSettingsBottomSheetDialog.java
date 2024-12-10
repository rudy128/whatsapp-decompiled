package com.whatsapp.status.archive;

import X.AnonymousClass00R;
import X.AnonymousClass18K;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4KF;
import X.AnonymousClass4P9;
import X.AnonymousClass5PY;
import X.AnonymousClass7vG;
import X.AnonymousClass7vH;
import X.C103745Lm;
import X.C103755Ln;
import X.C103765Lo;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C81173yo;
import X.C99274sY;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class StatusArchiveSettingsBottomSheetDialog extends Hilt_StatusArchiveSettingsBottomSheetDialog {
    public AnonymousClass4KF A00;
    public AnonymousClass18K A01;
    public AnonymousClass4P9 A02;
    public final C18100vl A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return (View) new AnonymousClass5PY(layoutInflater, viewGroup, this).invoke();
    }

    public void A1s() {
        this.A02 = null;
        super.A1s();
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        A00(this, 3);
    }

    public static final void A00(StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog, int i) {
        AnonymousClass18K r2 = statusArchiveSettingsBottomSheetDialog.A01;
        if (r2 != null) {
            C81173yo r1 = new C81173yo();
            r1.A01 = C17880vN.A0i();
            r1.A00 = Integer.valueOf(i);
            r2.CC7(r1);
            return;
        }
        AnonymousClass3MW.A1J();
        throw null;
    }

    public StatusArchiveSettingsBottomSheetDialog() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103755Ln(new C103745Lm(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(StatusArchiveSettingsViewModel.class);
        this.A03 = C99274sY.A00(new C103765Lo(A002), new AnonymousClass7vH(this, A002), new AnonymousClass7vG(A002), A15);
    }

    public void A1v() {
        super.A1v();
        A00(this, 1);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass3MX.A1Q(new StatusArchiveSettingsBottomSheetDialog$onCreate$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }
}
