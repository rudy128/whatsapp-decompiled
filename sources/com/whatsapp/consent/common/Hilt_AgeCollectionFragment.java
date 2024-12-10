package com.whatsapp.consent.common;

import X.A8V;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C008703w;
import X.C008903z;
import X.C108995ce;
import X.C25661Pc;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;
import com.whatsapp.consent.DateOfBirthCollectionFragment;
import com.whatsapp.consent.DateOfBirthRemediationFragment;
import com.whatsapp.consent.Hilt_DateOfBirthCollectionFragment;
import com.whatsapp.consent.Hilt_DateOfBirthRemediationFragment;
import com.whatsapp.pancake.dosa.DosaCollectionFragment;
import com.whatsapp.pancake.dosa.Hilt_DosaCollectionFragment;

public abstract class Hilt_AgeCollectionFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (this instanceof Hilt_DosaCollectionFragment) {
            Hilt_DosaCollectionFragment hilt_DosaCollectionFragment = (Hilt_DosaCollectionFragment) this;
            if (!hilt_DosaCollectionFragment.A00) {
                hilt_DosaCollectionFragment.A00 = true;
                C008903z A0S = AnonymousClass3MX.A0S(hilt_DosaCollectionFragment);
                DosaCollectionFragment dosaCollectionFragment = (DosaCollectionFragment) hilt_DosaCollectionFragment;
                AnonymousClass10E r2 = ((C36241nZ) A0S).A2Q;
                AnonymousClass10G r1 = r2.A00;
                C108995ce.A19(r1, dosaCollectionFragment, C72473Md.A0T(r2, r1, dosaCollectionFragment));
                dosaCollectionFragment.A0B = AnonymousClass10E.A6Q(r2);
                dosaCollectionFragment.A00 = (C25661Pc) r2.AIw.get();
            }
        } else if (this instanceof Hilt_DateOfBirthRemediationFragment) {
            Hilt_DateOfBirthRemediationFragment hilt_DateOfBirthRemediationFragment = (Hilt_DateOfBirthRemediationFragment) this;
            if (!hilt_DateOfBirthRemediationFragment.A00) {
                hilt_DateOfBirthRemediationFragment.A00 = true;
                C008903z A0S2 = AnonymousClass3MX.A0S(hilt_DateOfBirthRemediationFragment);
                DateOfBirthRemediationFragment dateOfBirthRemediationFragment = (DateOfBirthRemediationFragment) hilt_DateOfBirthRemediationFragment;
                AnonymousClass10E r22 = ((C36241nZ) A0S2).A2Q;
                AnonymousClass10G r12 = r22.A00;
                C108995ce.A19(r12, dateOfBirthRemediationFragment, C72473Md.A0T(r22, r12, dateOfBirthRemediationFragment));
                dateOfBirthRemediationFragment.A0B = AnonymousClass10E.A6Q(r22);
                dateOfBirthRemediationFragment.A00 = (A8V) r22.A4U.get();
            }
        } else if (this instanceof Hilt_DateOfBirthCollectionFragment) {
            Hilt_DateOfBirthCollectionFragment hilt_DateOfBirthCollectionFragment = (Hilt_DateOfBirthCollectionFragment) this;
            if (!hilt_DateOfBirthCollectionFragment.A00) {
                hilt_DateOfBirthCollectionFragment.A00 = true;
                C008903z A0S3 = AnonymousClass3MX.A0S(hilt_DateOfBirthCollectionFragment);
                DateOfBirthCollectionFragment dateOfBirthCollectionFragment = (DateOfBirthCollectionFragment) hilt_DateOfBirthCollectionFragment;
                AnonymousClass10E r23 = ((C36241nZ) A0S3).A2Q;
                AnonymousClass10G r13 = r23.A00;
                C108995ce.A19(r13, dateOfBirthCollectionFragment, C72473Md.A0T(r23, r13, dateOfBirthCollectionFragment));
                dateOfBirthCollectionFragment.A0B = AnonymousClass10E.A6Q(r23);
                dateOfBirthCollectionFragment.A00 = (A8V) r23.A4U.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            AgeCollectionFragment ageCollectionFragment = (AgeCollectionFragment) this;
            AnonymousClass10E r24 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r14 = r24.A00;
            C108995ce.A19(r14, ageCollectionFragment, C72473Md.A0T(r24, r14, ageCollectionFragment));
            ageCollectionFragment.A0B = AnonymousClass10E.A6Q(r24);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A00();
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
            r2.A00()
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.consent.common.Hilt_AgeCollectionFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
