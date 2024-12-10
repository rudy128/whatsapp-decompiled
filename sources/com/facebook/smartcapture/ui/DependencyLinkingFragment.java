package com.facebook.smartcapture.ui;

import X.BLP;
import X.BVO;
import X.BVV;
import X.C18070vi;
import X.EDO;
import android.content.Context;
import android.os.Bundle;

public abstract class DependencyLinkingFragment extends DrawableProviderFragment {
    public BVO A00;
    public Integer A01;
    public Bundle A02;
    public BVV A03;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof EDO) {
            BLP blp = (BLP) ((EDO) context);
            blp.A2m();
            this.A03 = blp.A06;
            this.A00 = blp.A2n();
            this.A02 = blp.A2m().A02;
            this.A01 = blp.A2m().A07;
            blp.A2m();
        }
    }
}
