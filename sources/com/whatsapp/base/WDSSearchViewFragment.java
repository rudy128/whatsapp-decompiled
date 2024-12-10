package com.whatsapp.base;

import X.AFU;
import X.AnonymousClass1FL;
import X.AnonymousClass6Pm;
import X.C109005cf;
import X.C111075i9;
import X.C1604888r;
import X.C18070vi;
import X.C28281Zt;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

public class WDSSearchViewFragment extends WaFragment {
    public WDSConversationSearchView A00;
    public C111075i9 A01;
    public final AnonymousClass6Pm A02 = new AnonymousClass6Pm(this);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131627592, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        Toolbar toolbar;
        C18070vi.A0d(view, 0);
        WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) view.findViewById(2131434976);
        this.A00 = wDSConversationSearchView;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.setHint((CharSequence) A1H(2131895489));
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A00;
        if (!(wDSConversationSearchView2 == null || (toolbar = wDSConversationSearchView2.A03) == null)) {
            toolbar.setNavigationOnClickListener(new AFU((Object) this, 34));
        }
        WDSConversationSearchView wDSConversationSearchView3 = this.A00;
        if (wDSConversationSearchView3 != null) {
            AnonymousClass6Pm r1 = this.A02;
            C18070vi.A0d(r1, 0);
            wDSConversationSearchView3.A01.addTextChangedListener(r1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C109005cf.A0T(this);
    }

    public void A1u() {
        super.A1u();
        C109005cf.A0T(this);
    }

    public void A1z(Bundle bundle) {
        C1604888r r1;
        super.A1z(bundle);
        AnonymousClass1FL A1B = A1B();
        if ((A1B instanceof C1604888r) && (r1 = (C1604888r) A1B) != null && !r1.isFinishing()) {
            this.A01 = r1.BYk();
        }
    }

    public void A26() {
        Window window;
        AnonymousClass1FL A1B = A1B();
        if (!(A1B == null || (window = A1B.getWindow()) == null)) {
            C28281Zt.A0A(window, false);
        }
        C111075i9 r0 = this.A01;
        if (r0 != null) {
            r0.A00.A0F("");
        }
        WDSConversationSearchView wDSConversationSearchView = this.A00;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.A00();
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A00;
        if (wDSConversationSearchView2 != null) {
            AnonymousClass6Pm r1 = this.A02;
            C18070vi.A0d(r1, 0);
            wDSConversationSearchView2.A01.removeTextChangedListener(r1);
        }
    }
}
