package com.whatsapp.consent.common;

import X.AnonymousClass000;
import X.AnonymousClass1YF;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C111095iI;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C23391Fw;
import X.C25681Pe;
import X.C30391dr;
import X.C37561pk;
import X.C72463Mc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.base.WaFragment;
import com.whatsapp.consent.AgeRemediationFailFragment;
import com.whatsapp.consent.ConsentAgeBanFragment;
import com.whatsapp.consent.ConsentAgeBanViewModel;
import com.whatsapp.pancake.dosa.DosaAgeBanFragment;

public abstract class AgeBanFragment extends WaFragment {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624630, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        if (this instanceof AgeRemediationFailFragment) {
            C17880vN.A0E(view, 2131429368).setText(2131886561);
            TextView A0E = C17880vN.A0E(view, 2131429365);
            A0E.setText(2131886559);
            AnonymousClass3Ma.A1B(A0E, this, 14);
        } else {
            TextView A0E2 = C17880vN.A0E(view, 2131429368);
            TextView A0E3 = C17880vN.A0E(view, 2131429365);
            A0E3.setText(2131886559);
            AnonymousClass3Ma.A1B(A0E3, this, 15);
            String A0r = C17880vN.A0r(((C25681Pe) A26().A02).A02(), "idv_token");
            if (A0r == null || AnonymousClass1YF.A0T(A0r)) {
                A0E2.setText(2131886560);
            } else {
                A0E2.setText(2131886561);
                View A0M = C72463Mc.A0M(view, 2131429369);
                C18070vi.A0z(A0M, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                TextView textView = (TextView) A0M;
                C111095iI A26 = A26();
                if (!(A26 instanceof ConsentAgeBanViewModel) || AnonymousClass000.A1S(((ConsentAgeBanViewModel) A26).A01.A00(false), 41)) {
                    textView.setVisibility(0);
                    textView.setText(2131894584);
                    AnonymousClass3Ma.A1B(textView, this, 16);
                } else {
                    textView.setVisibility(8);
                }
            }
        }
        C23391Fw r0 = this.A0L;
        C18070vi.A0X(r0);
        C37561pk.A00(r0).A01(new AgeBanFragment$onViewCreated$1(this, (C30391dr) null));
    }

    public C111095iI A26() {
        C18100vl r0;
        if (this instanceof DosaAgeBanFragment) {
            r0 = ((DosaAgeBanFragment) this).A01;
        } else if (this instanceof ConsentAgeBanFragment) {
            r0 = ((ConsentAgeBanFragment) this).A01;
        } else {
            r0 = ((AgeRemediationFailFragment) this).A00;
        }
        return (C111095iI) r0.getValue();
    }
}
