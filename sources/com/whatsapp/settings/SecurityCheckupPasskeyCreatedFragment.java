package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass48o;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class SecurityCheckupPasskeyCreatedFragment extends Hilt_SecurityCheckupPasskeyCreatedFragment {
    public AnonymousClass00H A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625386, viewGroup, false);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(inflate, 2131435042);
        AnonymousClass3MY.A1I(this, wDSTextLayout, 2131898925);
        AnonymousClass48o.A02(wDSTextLayout, this, 24);
        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131893574);
        C18070vi.A0b(inflate);
        AnonymousClass3MW.A0J(inflate, 2131435041).setText(2131893573);
        return inflate;
    }
}
