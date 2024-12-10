package com.whatsapp.ptt;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C131606lN;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import X.C88534a3;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_TranscriptionOnboardingBottomSheetFragment extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            TranscriptionOnboardingBottomSheetFragment transcriptionOnboardingBottomSheetFragment = (TranscriptionOnboardingBottomSheetFragment) this;
            AnonymousClass10E r2 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r3 = r2.A00;
            transcriptionOnboardingBottomSheetFragment.A05 = C72473Md.A0U(r2, r3, transcriptionOnboardingBottomSheetFragment);
            transcriptionOnboardingBottomSheetFragment.A00 = AnonymousClass3MZ.A0N(r2);
            transcriptionOnboardingBottomSheetFragment.A03 = AnonymousClass3MZ.A0d(r2);
            transcriptionOnboardingBottomSheetFragment.A01 = AnonymousClass10E.A12(r2);
            transcriptionOnboardingBottomSheetFragment.A0C = AnonymousClass3MZ.A1B(r2);
            transcriptionOnboardingBottomSheetFragment.A09 = AnonymousClass3MY.A0e(r3);
            transcriptionOnboardingBottomSheetFragment.A0D = AnonymousClass3MZ.A1C(r2);
            transcriptionOnboardingBottomSheetFragment.A0B = C000200d.A00(r2.AXd);
            transcriptionOnboardingBottomSheetFragment.A07 = (C131606lN) r2.A60.get();
            transcriptionOnboardingBottomSheetFragment.A0A = (C88534a3) r2.A9G.get();
            transcriptionOnboardingBottomSheetFragment.A06 = AnonymousClass3MY.A0Z(r2);
            transcriptionOnboardingBottomSheetFragment.A04 = AnonymousClass3Ma.A0c(r2);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A01();
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
            r2.A01()
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ptt.Hilt_TranscriptionOnboardingBottomSheetFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A2E();
    }
}
