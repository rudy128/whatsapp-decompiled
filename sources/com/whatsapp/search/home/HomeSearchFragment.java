package com.whatsapp.search.home;

import X.AnonymousClass118;
import X.AnonymousClass1FL;
import X.AnonymousClass1HS;
import X.AnonymousClass1YL;
import X.AnonymousClass3MZ;
import X.AnonymousClass3TN;
import X.AnonymousClass4CA;
import X.C17900vP;
import X.C18070vi;
import X.C23361Fs;
import X.C24071It;
import X.C28281Zt;
import X.C73263Sy;
import X.C90064dT;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.HomeActivity;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

public final class HomeSearchFragment extends Hilt_HomeSearchFragment {
    public AnonymousClass1HS A00;
    public AnonymousClass118 A01;
    public AnonymousClass3TN A02;
    public WDSConversationSearchView A03;
    public final AnonymousClass4CA A04 = new AnonymousClass4CA(this, 1);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Toolbar toolbar;
        C17900vP.A0Y(this, "HomeSearchFragment/onCreateView ", AnonymousClass3MZ.A19(layoutInflater, 0));
        View inflate = layoutInflater.inflate(2131625554, viewGroup, false);
        WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) inflate.findViewById(2131434976);
        this.A03 = wDSConversationSearchView;
        if (wDSConversationSearchView != null) {
            wDSConversationSearchView.setHint((CharSequence) A1H(2131895489));
        }
        WDSConversationSearchView wDSConversationSearchView2 = this.A03;
        if (wDSConversationSearchView2 != null) {
            AnonymousClass4CA r1 = this.A04;
            C18070vi.A0d(r1, 0);
            wDSConversationSearchView2.A01.addTextChangedListener(r1);
        }
        WDSConversationSearchView wDSConversationSearchView3 = this.A03;
        if (!(wDSConversationSearchView3 == null || (toolbar = wDSConversationSearchView3.A03) == null)) {
            toolbar.setNavigationOnClickListener(new C90064dT((Object) this, 1));
        }
        return inflate;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A00();
    }

    private final void A00() {
        AnonymousClass1HS r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("voipCallState");
            throw null;
        } else if (!r0.A01()) {
            C28281Zt.A06(A1D(), AnonymousClass1YL.A00(A1n(), 2130969148, 2131100157));
        }
    }

    public void A1u() {
        super.A1u();
        A00();
    }

    public void A1z(Bundle bundle) {
        C23361Fs r2;
        super.A1z(bundle);
        AnonymousClass1FL A1B = A1B();
        if ((A1B instanceof C23361Fs) && (r2 = (C23361Fs) A1B) != null && !r2.isFinishing()) {
            HomeActivity homeActivity = (HomeActivity) r2;
            this.A02 = (AnonymousClass3TN) new C24071It(new C73263Sy(homeActivity, homeActivity.A0Y), homeActivity).A00(AnonymousClass3TN.class);
        }
    }
}
