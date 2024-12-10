package com.whatsapp.biz.catalog.view.variants.v2;

import X.AnonymousClass1GP;
import X.AnonymousClass3MX;
import X.AnonymousClass7CW;
import X.C18070vi;
import X.C20510ANv;
import X.C28281Zt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;

public final class VariantsCarouselFragmentV2 extends Hilt_VariantsCarouselFragmentV2 {
    public AnonymousClass7CW A00;
    public AnonymousClass7CW A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18070vi.A0d(layoutInflater, 0);
        super.A1q(bundle, layoutInflater, viewGroup);
        View inflate = layoutInflater.inflate(2131625396, viewGroup, false);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) AnonymousClass3MX.A0C(inflate, 2131436663);
        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) AnonymousClass3MX.A0C(inflate, 2131436664);
        AnonymousClass7CW r2 = this.A00;
        if (r2 != null) {
            if (this.A03 != null) {
                AnonymousClass1GP A1E = A1E();
                C18070vi.A0X(A1E);
                r2.A00(A1E, this, shimmerFrameLayout, 0);
                r2.A06 = new C20510ANv(this, 2);
                AnonymousClass7CW r22 = this.A01;
                if (r22 == null) {
                    str = "variantsCarouselController2";
                } else if (this.A03 != null) {
                    AnonymousClass1GP A1E2 = A1E();
                    C18070vi.A0X(A1E2);
                    r22.A00(A1E2, this, shimmerFrameLayout2, 1);
                    r22.A06 = new C20510ANv(this, 3);
                    return inflate;
                }
            }
            str = "bizJid";
        } else {
            str = "variantsCarouselController1";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        int i;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View A0C = AnonymousClass3MX.A0C(view, 2131430073);
        View A0C2 = AnonymousClass3MX.A0C(view, 2131428344);
        boolean A0B = C28281Zt.A0B(view.getContext());
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("extra_entry_point", 1);
        } else {
            i = 1;
        }
        int i2 = 0;
        if (i == 0) {
            A0C.setVisibility(8);
            if (!(!A0B)) {
                i2 = 8;
            }
            A0C2.setVisibility(i2);
        } else if (i == 1) {
            A0C.setVisibility(0);
            A0C2.setVisibility(8);
        }
    }
}
