package com.facebook.smartcapture.ui;

import X.BLO;
import X.BVP;
import X.C17880vN;
import X.C18070vi;
import X.E1M;
import android.content.Context;
import android.os.Bundle;

public abstract class SelfieCaptureOverlayFragment extends DrawableProviderFragment {
    public BVP A00;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof E1M) {
            this.A00 = ((BLO) ((E1M) context)).A02;
        }
    }

    public void A1r() {
        super.A1r();
        this.A00 = null;
    }

    public final void A25(String str, String str2, String str3, String str4, String str5, boolean z) {
        Bundle A0D = C17880vN.A0D();
        if (str != null) {
            A0D.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        }
        if (str2 != null) {
            A0D.putString("challenge_use_case", str2);
        }
        if (str3 != null) {
            A0D.putString("av_session_id", str3);
        }
        if (str4 != null) {
            A0D.putString("flow_id", str4);
        }
        if (str5 != null) {
            A0D.putString("product_surface", str5);
        }
        A0D.putBoolean("should_hide_privacy_disclaimer", z);
        A1R(A0D);
    }
}
