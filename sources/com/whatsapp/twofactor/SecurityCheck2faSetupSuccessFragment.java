package com.whatsapp.twofactor;

import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass6LG;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class SecurityCheck2faSetupSuccessFragment extends Hilt_SecurityCheck2faSetupSuccessFragment {
    public AnonymousClass00H A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625394, viewGroup, false);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(inflate, 2131435037);
        AnonymousClass3MY.A1I(this, wDSTextLayout, 2131898925);
        wDSTextLayout.setPrimaryButtonClickListener(new AnonymousClass6LG(this, 36));
        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131897195);
        C18070vi.A0b(inflate);
        AnonymousClass3MW.A0J(inflate, 2131435036).setText(2131897194);
        return inflate;
    }
}
