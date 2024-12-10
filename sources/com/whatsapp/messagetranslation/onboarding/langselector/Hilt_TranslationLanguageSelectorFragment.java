package com.whatsapp.messagetranslation.onboarding.langselector;

import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C131606lN;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_TranslationLanguageSelectorFragment extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A04() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment = (TranslationLanguageSelectorFragment) this;
            AnonymousClass10E A0N = C72473Md.A0N(translationLanguageSelectorFragment, AnonymousClass3MX.A0S(this));
            translationLanguageSelectorFragment.A07 = AnonymousClass3MZ.A11(A0N);
            translationLanguageSelectorFragment.A02 = AnonymousClass3MZ.A0d(A0N);
            translationLanguageSelectorFragment.A0D = AnonymousClass3MZ.A1B(A0N);
            translationLanguageSelectorFragment.A08 = C000200d.A00(A0N.AXd);
            translationLanguageSelectorFragment.A09 = C000200d.A00(A0N.A5w);
            translationLanguageSelectorFragment.A06 = (C131606lN) A0N.A60.get();
            translationLanguageSelectorFragment.A0A = C000200d.A00(A0N.AZc);
            translationLanguageSelectorFragment.A0B = AnonymousClass3MW.A0s(A0N);
            translationLanguageSelectorFragment.A03 = AnonymousClass3Ma.A0c(A0N);
            translationLanguageSelectorFragment.A0C = C000200d.A00(A0N.A9B);
            translationLanguageSelectorFragment.A04 = AnonymousClass10E.A6Q(A0N);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A04();
        return this.A00;
    }

    public LayoutInflater A1o(Bundle bundle) {
        return C72453Mb.A0Q(super.A1o(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1p(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C008803x.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass3MY.A1Z(r0)
            r2.A04()
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagetranslation.onboarding.langselector.Hilt_TranslationLanguageSelectorFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A04();
        A2E();
    }
}
