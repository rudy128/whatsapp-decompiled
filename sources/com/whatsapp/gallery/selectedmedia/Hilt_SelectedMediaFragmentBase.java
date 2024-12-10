package com.whatsapp.gallery.selectedmedia;

import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C008803x;
import X.C008903z;
import X.C17880vN;
import X.C24051Ir;
import X.C24771Lp;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

public abstract class Hilt_SelectedMediaFragmentBase extends Fragment implements AnonymousClass009 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C17880vN.A0p();
    public volatile C008803x A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0X = r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.selectedmedia.Hilt_SelectedMediaFragmentBase.A1p(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (this instanceof Hilt_SelectedMediaCaptionFragment) {
            Hilt_SelectedMediaCaptionFragment hilt_SelectedMediaCaptionFragment = (Hilt_SelectedMediaCaptionFragment) this;
            if (!hilt_SelectedMediaCaptionFragment.A00) {
                hilt_SelectedMediaCaptionFragment.A00 = true;
                C008903z A0S = AnonymousClass3MX.A0S(hilt_SelectedMediaCaptionFragment);
                SelectedMediaCaptionFragment selectedMediaCaptionFragment = (SelectedMediaCaptionFragment) hilt_SelectedMediaCaptionFragment;
                C36241nZ r4 = (C36241nZ) A0S;
                AnonymousClass10E r2 = r4.A2Q;
                selectedMediaCaptionFragment.A01 = (C24771Lp) r2.A0o.get();
                AnonymousClass10G r1 = r2.A00;
                selectedMediaCaptionFragment.A03 = C000200d.A00(r1.ADC);
                selectedMediaCaptionFragment.A02 = AnonymousClass3Ma.A0a(r2);
                selectedMediaCaptionFragment.A05 = C000200d.A00(r4.A1G);
                selectedMediaCaptionFragment.A06 = C000200d.A00(r1.AIe);
                selectedMediaCaptionFragment.A07 = C000200d.A00(r2.ABl);
                selectedMediaCaptionFragment.A02 = AnonymousClass10E.A6Q(r2);
            }
        } else if (!this.A02) {
            this.A02 = true;
            SelectedMediaFragmentBase selectedMediaFragmentBase = (SelectedMediaFragmentBase) this;
            AnonymousClass10E r12 = ((C36241nZ) ((C008903z) generatedComponent())).A2Q;
            selectedMediaFragmentBase.A01 = (C24771Lp) r12.A0o.get();
            selectedMediaFragmentBase.A03 = C000200d.A00(r12.A00.ADC);
            selectedMediaFragmentBase.A02 = AnonymousClass3Ma.A0a(r12);
        }
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C008803x(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public Hilt_SelectedMediaFragmentBase(int i) {
        this.A02 = i;
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

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }
}
