package com.facebook.smartcapture.ui;

import X.C18070vi;
import X.C28509E4t;
import X.CDP;
import android.content.Context;
import androidx.fragment.app.Fragment;

public abstract class DrawableProviderFragment extends Fragment {
    public CDP A00;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof C28509E4t) {
            this.A00 = ((C28509E4t) context).BQu();
        }
    }

    public void A1K() {
        super.A1K();
        this.A00 = null;
    }
}
