package com.whatsapp.privacy.disclosure.ui.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1FL;
import X.AnonymousClass3MX;
import X.AnonymousClass6XC;
import X.AnonymousClass6XD;
import X.AnonymousClass6XE;
import X.C110695gu;
import X.C120236Cx;
import X.C135416sA;
import X.C18070vi;
import X.C72463Mc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.util.Log;

public final class PrivacyDisclosureFullscreenFragment extends Fragment {
    public C135416sA A00;
    public C120236Cx A01;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        View view2 = this.A0B;
        if (view2 != null) {
            C72463Mc.A0x(view2.getContext(), AnonymousClass000.A0Y(view2), view2, 2130970830, 2131102245);
        }
        C135416sA r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("args");
            throw null;
        }
        C120236Cx r3 = this.A01;
        if (r3 != null) {
            r3.A00(r0.A02, r0.A00, r0.A01);
        }
        A1D().BVe().A09(new C110695gu(), A1G());
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C135416sA r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("args");
            throw null;
        }
        String str = r0.A02.A0B;
        AnonymousClass1FL A1B = A1B();
        if (A1B == null) {
            return null;
        }
        C120236Cx A002 = AnonymousClass6XE.A00(A1B, AnonymousClass3MX.A0O(A1B), str);
        this.A01 = A002;
        return A002;
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        C135416sA A002 = AnonymousClass6XC.A00(this);
        if (A002 != null) {
            this.A00 = A002;
            return;
        }
        Log.e("PrivacyDisclosureFullscreenFragment: parseAndValidateArguments(): invalid disclosure arguments");
        AnonymousClass6XD.A00(A1F(), AnonymousClass00R.A0u);
    }
}
