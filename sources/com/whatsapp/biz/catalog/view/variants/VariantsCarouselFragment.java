package com.whatsapp.biz.catalog.view.variants;

import X.AnonymousClass1GP;
import X.AnonymousClass3MW;
import X.AnonymousClass7CX;
import X.B0V;
import X.C18070vi;
import X.C20339AGv;
import X.C20510ANv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.jid.UserJid;

public final class VariantsCarouselFragment extends Hilt_VariantsCarouselFragment {
    public AnonymousClass7CX A00;
    public AnonymousClass7CX A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625395, viewGroup, false);
        this.A02 = (ShimmerFrameLayout) inflate.findViewById(2131436669);
        this.A03 = (ShimmerFrameLayout) inflate.findViewById(2131436670);
        ShimmerFrameLayout shimmerFrameLayout = this.A02;
        if (shimmerFrameLayout != null) {
            AnonymousClass7CX r4 = this.A00;
            if (r4 != null) {
                UserJid userJid = this.A03;
                if (userJid != null) {
                    AnonymousClass1GP A1E = A1E();
                    C18070vi.A0X(A1E);
                    r4.A01(A1E, this, shimmerFrameLayout, userJid, 0);
                }
                str = "bizJid";
                C18070vi.A11(str);
                throw null;
            }
            str = "variantsCarouselController1";
            C18070vi.A11(str);
            throw null;
        }
        ShimmerFrameLayout shimmerFrameLayout2 = this.A03;
        if (shimmerFrameLayout2 != null) {
            AnonymousClass7CX r42 = this.A01;
            if (r42 != null) {
                UserJid userJid2 = this.A03;
                if (userJid2 != null) {
                    AnonymousClass1GP A1E2 = A1E();
                    C18070vi.A0X(A1E2);
                    r42.A01(A1E2, this, shimmerFrameLayout2, userJid2, 1);
                }
                str = "bizJid";
                C18070vi.A11(str);
                throw null;
            }
            str = "variantsCarouselController2";
            C18070vi.A11(str);
            throw null;
        }
        AnonymousClass7CX r2 = this.A00;
        if (r2 != null) {
            r2.A00 = new C20510ANv(this, 0);
            AnonymousClass7CX r22 = this.A01;
            if (r22 != null) {
                r22.A00 = new C20510ANv(this, 1);
                return inflate;
            }
            str = "variantsCarouselController2";
            C18070vi.A11(str);
            throw null;
        }
        str = "variantsCarouselController1";
        C18070vi.A11(str);
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = this.A02;
        if (variantsCarouselFragmentViewModel != null) {
            C20339AGv.A00(A1G(), variantsCarouselFragmentViewModel.A09, new B0V(view, this), 10);
            return;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }
}
