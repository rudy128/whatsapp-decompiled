package com.whatsapp.privacy.checkup;

import X.AnonymousClass00H;
import X.AnonymousClass033;
import X.AnonymousClass18K;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.C139756zO;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C22891Dp;
import X.C38471rL;
import X.C72473Md;
import X.C81263yx;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public abstract class PrivacyCheckupBaseFragment extends Hilt_PrivacyCheckupBaseFragment {
    public C18030ve A00;
    public AnonymousClass18K A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626591, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        Resources resources;
        C18070vi.A0d(view, 0);
        ImageView A0C = AnonymousClass3Ma.A0C(view, 2131431374);
        boolean z = this instanceof PrivacyCheckupMoreSecurityFragment;
        if (z) {
            i = 2131233527;
        } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
            i = 2131233528;
        } else if (this instanceof PrivacyCheckupHomeFragment) {
            i = 2131233526;
            if (C22891Dp.A02) {
                i = 0;
            }
        } else if (this instanceof PrivacyCheckupContactFragment) {
            i = 2131233525;
        } else {
            i = 2131233524;
        }
        A0C.setImageResource(i);
        Context A1n = A1n();
        if (!(A1n == null || (resources = A1n.getResources()) == null)) {
            AnonymousClass3MY.A14(resources, A0C, 2131169533);
        }
        ViewGroup.LayoutParams layoutParams = A0C.getLayoutParams();
        Resources A09 = AnonymousClass3MZ.A09(this);
        boolean z2 = this instanceof PrivacyCheckupHomeFragment;
        if (z2) {
            i2 = 2131168305;
        } else {
            i2 = 2131168306;
        }
        layoutParams.height = A09.getDimensionPixelSize(i2);
        TextView A0E = AnonymousClass3Ma.A0E(view, 2131436208);
        if (z) {
            i3 = 2131894752;
        } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
            i3 = 2131894748;
        } else if (z2) {
            i3 = 2131894742;
        } else if (this instanceof PrivacyCheckupContactFragment) {
            i3 = 2131894737;
        } else {
            i3 = 2131894729;
        }
        A0E.setText(i3);
        TextView A0E2 = AnonymousClass3Ma.A0E(view, 2131429927);
        if (z) {
            i4 = 2131894750;
        } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
            i4 = 2131894743;
        } else if (z2) {
            i4 = 2131894741;
        } else if (this instanceof PrivacyCheckupContactFragment) {
            i4 = 2131894734;
        } else {
            i4 = 2131894722;
        }
        A0E2.setText(i4);
        TextView A0E3 = AnonymousClass3Ma.A0E(view, 2131430949);
        AnonymousClass3MY.A1X(A1H(2131894740), A0E3);
        if (z || (this instanceof PrivacyCheckupMorePrivacyFragment) || !z2) {
            A0E3.setVisibility(8);
        } else {
            A0E3.setVisibility(0);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.constraintlayout.widget.ConstraintLayout, X.3SA, android.view.View, android.view.ViewGroup] */
    public final void A28(View view, C38471rL r10, int i, int i2, int i3) {
        ViewGroup viewGroup = (ViewGroup) C18070vi.A05(view, 2131435245);
        Context A14 = A14();
        ? constraintLayout = new ConstraintLayout(A14);
        if (!constraintLayout.A02) {
            constraintLayout.A02 = true;
            constraintLayout.A00 = C72473Md.A0S((AnonymousClass033) constraintLayout.generatedComponent());
        }
        LayoutInflater.from(A14).inflate(2131626593, constraintLayout, true);
        AnonymousClass3MW.A0H(constraintLayout, 2131431496).setImageResource(i3);
        ImageView A0H = AnonymousClass3MW.A0H(constraintLayout, 2131434711);
        AnonymousClass3NL.A01(constraintLayout.getContext(), A0H, constraintLayout.getWhatsAppLocale(), 2131231900);
        Resources resources = A14.getResources();
        if (resources != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(2131169479);
            A0H.getLayoutParams().width = dimensionPixelSize;
            AnonymousClass3MX.A1F(A0H, dimensionPixelSize);
        }
        C17880vN.A0E(constraintLayout, 2131436208).setText(i);
        TextView A0E = C17880vN.A0E(constraintLayout, 2131429927);
        if (i2 == 0) {
            A0E.setVisibility(8);
        } else {
            A0E.setText(i2);
        }
        constraintLayout.findViewById(2131429504).setOnClickListener(r10);
        viewGroup.addView(constraintLayout, 0);
    }

    public final void A26(int i, int i2) {
        C81263yx r1 = new C81263yx();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = Integer.valueOf(i);
        AnonymousClass18K r0 = this.A01;
        if (r0 != null) {
            r0.CC4(r1);
        } else {
            AnonymousClass3MW.A1J();
            throw null;
        }
    }

    public final void A27(int i, Integer num) {
        int i2;
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            C139756zO r1 = (C139756zO) r0.get();
            if (this instanceof PrivacyCheckupMoreSecurityFragment) {
                i2 = 4;
            } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
                i2 = 3;
            } else if (this instanceof PrivacyCheckupHomeFragment) {
                i2 = 0;
            } else if (this instanceof PrivacyCheckupContactFragment) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            r1.A03(Integer.valueOf(i2), num, i);
            return;
        }
        C18070vi.A11("privacyCheckupWamEventHelper");
        throw null;
    }
}
