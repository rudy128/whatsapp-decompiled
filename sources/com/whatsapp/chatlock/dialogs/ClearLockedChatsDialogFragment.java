package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass3MY;
import X.AnonymousClass4DG;
import X.AnonymousClass4a6;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C73203Rj;
import X.C91494fm;
import android.app.Dialog;
import android.os.Bundle;

public final class ClearLockedChatsDialogFragment extends Hilt_ClearLockedChatsDialogFragment {
    public C18030ve A00;

    public static final void A00(Bundle bundle, ClearLockedChatsDialogFragment clearLockedChatsDialogFragment) {
        C18070vi.A0d(bundle, 0);
        bundle.putBoolean("ClearLockedChatsDialogFragment_result_key", false);
        clearLockedChatsDialogFragment.A1F().A0w("ClearLockedChatsDialogFragment_request_key", bundle);
        clearLockedChatsDialogFragment.A28();
    }

    public static final void A01(Bundle bundle, ClearLockedChatsDialogFragment clearLockedChatsDialogFragment) {
        C18070vi.A0d(bundle, 0);
        bundle.putBoolean("ClearLockedChatsDialogFragment_result_key", true);
        clearLockedChatsDialogFragment.A1F().A0w("ClearLockedChatsDialogFragment_request_key", bundle);
        clearLockedChatsDialogFragment.A28();
    }

    public Dialog A27(Bundle bundle) {
        this.A07 = AnonymousClass4DG.DESTRUCTIVE;
        Bundle A0D = C17880vN.A0D();
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0E(2131888322);
        A03.A0D(2131888323);
        A03.A0e(this, new C91494fm(this, A0D, 3), 2131888321);
        A03.A0g(this, new C91494fm(this, A0D, 4), 2131897323);
        return AnonymousClass3MY.A0L(A03);
    }
}
