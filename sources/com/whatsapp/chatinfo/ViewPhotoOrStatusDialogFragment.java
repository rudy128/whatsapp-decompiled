package com.whatsapp.chatinfo;

import X.AnonymousClass000;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.C107935ar;
import X.C17890vO;
import X.C18070vi;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public final class ViewPhotoOrStatusDialogFragment extends Hilt_ViewPhotoOrStatusDialogFragment {
    public C107935ar A00;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof C107935ar) {
            this.A00 = (C107935ar) context;
            return;
        }
        throw new ClassCastException(AnonymousClass000.A0y(" must implement ViewPhotoOrStatusDialogClickListener", C17890vO.A0f(context)));
    }

    public void A1K() {
        super.A1K();
        this.A00 = null;
    }

    public Dialog A27(Bundle bundle) {
        String[] stringArray = AnonymousClass3MZ.A09(this).getStringArray(2130903070);
        C18070vi.A0X(stringArray);
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A00.A0M(new AnonymousClass4aq(this, 39), stringArray);
        return AnonymousClass3MY.A0L(A03);
    }
}
