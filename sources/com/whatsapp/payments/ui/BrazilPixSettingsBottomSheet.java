package com.whatsapp.payments.ui;

import X.AFO;
import X.AnonymousClass1KB;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.C17880vN;
import X.C18070vi;
import X.C194929sW;
import X.C19740yt;
import X.C20339AGv;
import X.C22236Azq;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;

public final class BrazilPixSettingsBottomSheet extends Hilt_BrazilPixSettingsBottomSheet {
    public AnonymousClass1KB A00;
    public C194929sW A01;
    public AnonymousClass1QS A02;
    public BrazilPixKeySettingViewModel A03;
    public String A04;
    public String A05;
    public String A06;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A06 = AnonymousClass8BR.A0y(bundle2);
            this.A05 = bundle2.getString("previous_screen");
            this.A04 = bundle2.getString("campaign_id");
            String string = bundle2.getString("pix_info_key_type");
            if (string != null) {
                this.A01 = new C194929sW(string, bundle2.getString("pix_info_key_value"), bundle2.getString("pix_info_display_name"), bundle2.getString("extra_pix_info_key_credential_id"));
            }
        }
        View findViewById = view.findViewById(2131430258);
        AnonymousClass8BU.A15(findViewById, 2131430260, C19740yt.A00(A14(), 2131101222));
        C17880vN.A0E(findViewById, 2131430261).setText(2131887396);
        AnonymousClass3Ma.A1D(findViewById, this, 30);
        View findViewById2 = view.findViewById(2131429895);
        AnonymousClass8BU.A15(findViewById2, 2131429897, AnonymousClass3MZ.A02(A14(), A14(), 2130970924, 2131102368));
        C17880vN.A0E(findViewById2, 2131429899).setText(2131887397);
        AFO.A00(findViewById2, this, 8);
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = this.A03;
        if (brazilPixKeySettingViewModel != null) {
            C20339AGv.A00(this, brazilPixKeySettingViewModel.A01, new C22236Azq(this), 39);
            BrazilPixKeySettingViewModel brazilPixKeySettingViewModel2 = this.A03;
            if (brazilPixKeySettingViewModel2 != null) {
                brazilPixKeySettingViewModel2.A0T((Integer) null, "custom_payment_method_settings", this.A06, this.A05, 0);
                return;
            }
        }
        C18070vi.A11("brazilPixKeySettingViewModel");
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = this.A03;
        if (brazilPixKeySettingViewModel == null) {
            C18070vi.A11("brazilPixKeySettingViewModel");
            throw null;
        }
        brazilPixKeySettingViewModel.A0T(1, "custom_payment_method_settings", this.A06, this.A05, 1);
        super.onDismiss(dialogInterface);
    }

    public final AnonymousClass1KB A2K() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("globalUI");
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A03 = (BrazilPixKeySettingViewModel) AnonymousClass3MW.A0N(this).A00(BrazilPixKeySettingViewModel.class);
    }

    public int A2F() {
        return 2131626393;
    }
}
