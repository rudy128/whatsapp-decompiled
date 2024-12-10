package com.facebook.smartcapture.ui;

import X.AnonymousClass3MW;
import X.C18070vi;
import X.C28510E4u;
import android.content.Context;
import java.lang.ref.WeakReference;

public abstract class CaptureOverlayFragment extends DependencyLinkingFragment {
    public WeakReference A00;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof C28510E4u) {
            this.A00 = AnonymousClass3MW.A0z(context);
        }
    }
}
