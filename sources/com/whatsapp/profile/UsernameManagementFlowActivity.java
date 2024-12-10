package com.whatsapp.profile;

import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass5KS;
import X.AnonymousClass5KT;
import X.C104585Os;
import X.C18100vl;
import X.C28281Zt;
import X.C30391dr;
import X.C34001jj;
import X.C37561pk;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.whatsapp.profile.fragments.UsernameManagementFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;

public final class UsernameManagementFlowActivity extends AnonymousClass1FY {
    public final C18100vl A00 = C99274sY.A00(new AnonymousClass5KT(this), new AnonymousClass5KS(this), new C104585Os(this), AnonymousClass3MW.A15(UsernameNavigationViewModel.class));

    public static final void A03(Fragment fragment, UsernameManagementFlowActivity usernameManagementFlowActivity, String str, boolean z) {
        if (usernameManagementFlowActivity.getSupportFragmentManager().A0Q(str) == null) {
            C34001jj r4 = new C34001jj(AnonymousClass3MX.A0O(usernameManagementFlowActivity));
            if (z) {
                r4.A06(2130772058, 2130772022, 2130772020, 2130772062);
            }
            r4.A0C(fragment, str, 2131431002);
            r4.A0H(str);
            r4.A01();
        }
    }

    public static final void A0Q(UsernameManagementFlowActivity usernameManagementFlowActivity, String str) {
        Fragment A0Q = usernameManagementFlowActivity.getSupportFragmentManager().A0Q(str);
        if (A0Q != null) {
            C34001jj A0H = AnonymousClass3Ma.A0H(usernameManagementFlowActivity);
            A0H.A07(A0Q);
            A0H.A03();
            usernameManagementFlowActivity.getSupportFragmentManager().A0b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(2131431002);
        setContentView((View) frameLayout);
        C28281Zt.A06(this, 2131102739);
        if (getSupportFragmentManager().A0U.A04().isEmpty()) {
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0D(new UsernameManagementFragment(), "UsernameManagementFragment", 2131431002);
            A0H.A01();
        }
        C37561pk.A00(getLifecycle()).A00(new UsernameManagementFlowActivity$onCreate$2(this, (C30391dr) null));
    }
}
