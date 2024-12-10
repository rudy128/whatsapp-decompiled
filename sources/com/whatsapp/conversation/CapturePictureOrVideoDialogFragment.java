package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass4a6;
import X.AnonymousClass4bA;
import X.C010105w;
import X.C107985aw;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public final class CapturePictureOrVideoDialogFragment extends Hilt_CapturePictureOrVideoDialogFragment {
    public static final int[] A01 = {2131896768, 2131894962};
    public C107985aw A00;

    public void A1x(Context context) {
        super.A1x(context);
        try {
            this.A00 = (C107985aw) context;
        } catch (ClassCastException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(context.toString());
            throw new ClassCastException(AnonymousClass000.A0y(" must implement CapturePictureOrVideoDialogClickListener", A10));
        }
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0M(new AnonymousClass4bA(this, 14), this.A01.A0R(A01));
        C010105w create = A03.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
