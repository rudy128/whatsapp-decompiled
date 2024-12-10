package com.whatsapp.inappsupport.ui;

import X.A6n;
import X.AnonymousClass00H;
import X.AnonymousClass198;
import X.AnonymousClass19T;
import X.AnonymousClass1HF;
import X.C105655Sv;
import X.C17880vN;
import X.C18070vi;
import X.C36361nl;
import X.C72453Mb;
import X.C91644g1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public final class ContextualHelpBkScreenFragment extends Hilt_ContextualHelpBkScreenFragment {
    public FrameLayout A00;
    public ProgressBar A01;
    public C36361nl A02;
    public AnonymousClass19T A03;
    public AnonymousClass198 A04;
    public AnonymousClass00H A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625366, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        this.A01 = (ProgressBar) AnonymousClass1HF.A06(view, 2131428243);
        FrameLayout frameLayout = (FrameLayout) AnonymousClass1HF.A06(view, 2131428242);
        this.A00 = frameLayout;
        C72453Mb.A1D(frameLayout);
        C72453Mb.A1C(this.A01);
        C91644g1.A00(A1G(), ((SupportBkLayoutViewModel) this.A08).A02, new C105655Sv(this), 36);
        SupportBkLayoutViewModel supportBkLayoutViewModel = (SupportBkLayoutViewModel) this.A08;
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (str = bundle2.getString("screen_name")) == null) {
            str = "";
        }
        supportBkLayoutViewModel.A01 = str;
        ((SupportBkLayoutViewModel) this.A08).A00 = A00(this);
        super.A21(bundle, view);
    }

    public static final String A00(ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        Serializable serializable;
        Bundle bundle = contextualHelpBkScreenFragment.A06;
        if (!(bundle == null || bundle.getSerializable("screen_params") == null)) {
            Bundle bundle2 = contextualHelpBkScreenFragment.A06;
            if (bundle2 != null) {
                serializable = bundle2.getSerializable("screen_params");
            } else {
                serializable = null;
            }
            C18070vi.A0z(serializable, "null cannot be cast to non-null type kotlin.String");
            try {
                JSONObject A16 = C17880vN.A16((String) serializable);
                if (!A16.has("params")) {
                    return null;
                }
                JSONObject jSONObject = A16.getJSONObject("params");
                if (!jSONObject.has("server_params")) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("server_params");
                C18070vi.A0b(jSONObject2);
                return A6n.A02("entrypointid", jSONObject2);
            } catch (JSONException e) {
                Log.e("ContextualHelpBkScreenFragment/getEntryPointId", e);
            }
        }
        return null;
    }

    public Class A26() {
        return SupportBkLayoutViewModel.class;
    }

    public void A27() {
        C72453Mb.A1D(this.A01);
        C72453Mb.A1C(this.A00);
    }

    public void A28() {
        C72453Mb.A1D(this.A01);
        C72453Mb.A1C(this.A00);
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
        ((SupportBkLayoutViewModel) this.A08).A02.A09(A1G());
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        try {
            AnonymousClass198 r0 = this.A04;
            if (r0 != null) {
                r0.A00();
            } else {
                C18070vi.A11("whatsAppSoLoader");
                throw null;
            }
        } catch (IOException e) {
            Log.e("ContextualHelpBkScreenFragment/so loader init failed", e);
        }
    }

    public int A25() {
        return 2131428240;
    }
}
