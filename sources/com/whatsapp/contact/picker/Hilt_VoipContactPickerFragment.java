package com.whatsapp.contact.picker;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11N;
import X.AnonymousClass1HQ;
import X.AnonymousClass1K1;
import X.BE7;
import X.BE8;
import X.BE9;
import X.BEB;
import X.C000200d;
import X.C008603v;
import X.C008703w;
import X.C008903z;
import X.C108975cc;
import X.C109015cg;
import X.C1408673j;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

public abstract class Hilt_VoipContactPickerFragment extends SelectedListContactPickerFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new C008603v(super.A1n(), (Fragment) this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            VoipContactPickerFragment voipContactPickerFragment = (VoipContactPickerFragment) this;
            C36241nZ r5 = (C36241nZ) ((C008903z) generatedComponent());
            AnonymousClass10E r3 = r5.A2Q;
            AnonymousClass10G r4 = r3.A00;
            BEB.A0z(r3, r4, voipContactPickerFragment);
            BEB.A0y(r3, r4, voipContactPickerFragment);
            BEB.A11(r3, voipContactPickerFragment, BE7.A0c(r3));
            C109015cg.A04(r3, r4, voipContactPickerFragment, C108975cc.A0O(r3));
            C109015cg.A02(r5, r3, r4, BE9.A0X(r4), voipContactPickerFragment);
            AnonymousClass1K1 A0P = BEB.A0P(r5, r3, r4, voipContactPickerFragment);
            BEB.A0u(A0P, r5, r3, voipContactPickerFragment, r4.AD4.get());
            BEB.A0v(r5, r3, r4, voipContactPickerFragment, C000200d.A00(r3.A25));
            C109015cg.A01(A0P, r3, r4, voipContactPickerFragment);
            BEB.A0w(r5, r3, r4, voipContactPickerFragment, BEB.A0X(r3, voipContactPickerFragment));
            BEB.A0t(A0P, r5, r3, r4, voipContactPickerFragment);
            BE8.A11(r5, voipContactPickerFragment);
            C109015cg.A00(A0P, r5, r3, r4, voipContactPickerFragment);
            voipContactPickerFragment.A02 = (C1408673j) r4.A4R.get();
            voipContactPickerFragment.A04 = (AnonymousClass11N) r3.A96.get();
            voipContactPickerFragment.A01 = (AnonymousClass1HQ) r3.A99.get();
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
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.Hilt_VoipContactPickerFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A01();
        A25();
    }
}
