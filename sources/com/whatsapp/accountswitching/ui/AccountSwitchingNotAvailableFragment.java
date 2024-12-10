package com.whatsapp.accountswitching.ui;

import X.AnonymousClass00H;
import X.AnonymousClass3MZ;
import X.AnonymousClass739;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C19830z4;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

public final class AccountSwitchingNotAvailableFragment extends Hilt_AccountSwitchingNotAvailableFragment {
    public C19830z4 A00;
    public AnonymousClass00H A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131623978, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Log.i("AccountSwitchingNotAvailableFragment/dialog shown");
        View findViewById = view.findViewById(2131427457);
        View findViewById2 = view.findViewById(2131427451);
        C19830z4 r0 = this.A00;
        if (r0 != null) {
            if (C17880vN.A1W(C17890vO.A0B(r0), "notify_account_switching_available")) {
                C17880vN.A0E(view, 2131427455).setText(2131886386);
                C18070vi.A0b(findViewById);
                findViewById.setVisibility(8);
            } else {
                AnonymousClass3MZ.A1N(findViewById, this, 44);
            }
            AnonymousClass3MZ.A1N(findViewById2, this, 45);
            AnonymousClass00H r02 = this.A01;
            if (r02 != null) {
                ((AnonymousClass739) C18070vi.A0E(r02)).A04((Boolean) null, 7, 20);
                return;
            }
            str = "accountSwitchingLogger";
        } else {
            str = "waSharedPreferences";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(AccountSwitchingNotAvailableFragment accountSwitchingNotAvailableFragment) {
        String str;
        Log.i("AccountSwitchingNotAvailableFragment/actionButton clicked");
        C19830z4 r0 = accountSwitchingNotAvailableFragment.A00;
        if (r0 != null) {
            C17880vN.A1F(C19830z4.A00(r0), "notify_account_switching_available", true);
            AnonymousClass00H r02 = accountSwitchingNotAvailableFragment.A01;
            if (r02 != null) {
                ((AnonymousClass739) C18070vi.A0E(r02)).A04((Boolean) null, 7, 22);
                super.A29();
                return;
            }
            str = "accountSwitchingLogger";
        } else {
            str = "waSharedPreferences";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            ((AnonymousClass739) C18070vi.A0E(r0)).A04((Boolean) null, 7, 21);
            A29();
            return;
        }
        C18070vi.A11("accountSwitchingLogger");
        throw null;
    }
}
