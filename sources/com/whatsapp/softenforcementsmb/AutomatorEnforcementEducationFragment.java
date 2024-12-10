package com.whatsapp.softenforcementsmb;

import X.AnonymousClass03S;
import X.AnonymousClass1FL;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CG;
import X.AnonymousClass4CI;
import X.AnonymousClass78A;
import X.C127756es;
import X.C139436yq;
import X.C140056zs;
import X.C17880vN;
import X.C18070vi;
import X.C72453Mb;
import X.C72483Me;
import X.C82814Ce;
import X.C82824Cf;
import X.C87004Tx;
import X.C87134Uk;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class AutomatorEnforcementEducationFragment extends Hilt_AutomatorEnforcementEducationFragment {
    public C127756es A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624245, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            C140056zs r5 = new C140056zs(C17880vN.A16(bundle2.getString("notification")));
            C87134Uk r6 = new C87134Uk(AnonymousClass03S.A01(view.getContext(), 2131233674), C82814Ce.SMALL, AnonymousClass3Ma.A11(view, 2131886819), (CharSequence) null);
            View inflate = View.inflate(AnonymousClass3MY.A04(view), 2131624246, (ViewGroup) null);
            ((WDSSectionHeader) inflate.findViewById(2131427940)).setSubHeaderText(2131886821);
            C127756es r3 = this.A00;
            if (r3 != null) {
                AnonymousClass78A r2 = new AnonymousClass78A(r3, r5, AnonymousClass3MY.A04(view), 43);
                ((WDSTextLayout) view.findViewById(2131436069)).setTextLayoutViewState(new AnonymousClass4CI(new C87004Tx(r2, C18070vi.A0F(view.getContext(), 2131886818)), (C87004Tx) null, r6, C82824Cf.FOOTER, new AnonymousClass4CG(inflate), (CharSequence) null));
                A00(A17());
                return;
            }
            C18070vi.A11("clickListenerUtil");
            throw null;
        }
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A01(true);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A00(A17());
    }

    private final void A00(View view) {
        AnonymousClass1FL A1D = A1D();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            float f = 0.6f;
            if (C72453Mb.A08(A14()) == 2) {
                f = 1.0f;
            }
            AnonymousClass3MZ.A1G(view, layoutParams, (float) C72483Me.A02(A1D), f);
            return;
        }
        throw AnonymousClass3MY.A0k();
    }
}
